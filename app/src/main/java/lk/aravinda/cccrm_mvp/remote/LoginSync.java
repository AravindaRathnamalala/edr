package lk.aravinda.cccrm_mvp.remote;

import android.content.Context;

import javax.inject.Inject;

import lk.aravinda.cccrm_mvp.injection.ApplicationContext;
import lk.aravinda.cccrm_mvp.model.CCCRMBean;
import lk.aravinda.cccrm_mvp.network.ApiService;
import lk.aravinda.cccrm_mvp.remote.response.ErrorHandle;
import lk.aravinda.cccrm_mvp.util.ConnectionDetector;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by aravinda_r on 9/20/2018.
 */

public class LoginSync{

    private final ApiService mApiService;
    private final Context mContext;

    @Inject
    public LoginSync(@ApplicationContext Context context, ApiService apiService){
        this.mApiService = apiService;
        this.mContext = context;
    }

    public void signIn(String username, String password, final LoginSyncIn.OnLoginListner listner){

        if (ConnectionDetector.getConnectionInstance(mContext).isOnline()){
            mApiService.login(username, password)
                    .enqueue(new Callback<CCCRMBean>() {
                        @Override
                        public void onResponse(Call<CCCRMBean> call, Response<CCCRMBean> response) {
                            if (response.isSuccessful()){
                                listner.OnLoginSuccess(response.body());
                            }else {
                                listner.OnLiginFailed(ErrorHandle.getApiErrorMessage(response));
                            }
                        }

                        @Override
                        public void onFailure(Call<CCCRMBean> call, Throwable t) {

                        }
                    });
        }
    }
}
