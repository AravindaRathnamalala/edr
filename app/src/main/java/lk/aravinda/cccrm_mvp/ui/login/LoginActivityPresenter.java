package lk.aravinda.cccrm_mvp.ui.login;



import javax.inject.Inject;
import lk.aravinda.cccrm_mvp.model.CCCRMBean;
import lk.aravinda.cccrm_mvp.remote.LoginSync;
import lk.aravinda.cccrm_mvp.remote.LoginSyncIn;
import lk.aravinda.cccrm_mvp.ui.base.BasePresenter;
import lk.aravinda.cccrm_mvp.util.PreferencesManager;

/**
 * Created by aravinda_r on 9/20/2018.
 */

public class LoginActivityPresenter extends BasePresenter<LoginView>{

    private LoginSync loginSync;
    private PreferencesManager preferencesManager;

    @Inject
    public LoginActivityPresenter(LoginSync loginSync, PreferencesManager preferencesManager){
        this.loginSync = loginSync;
        this.preferencesManager = preferencesManager;
    }

    public void signIn(String u, String p){
        getView().showProgressDialog();
        loginSync.signIn(u , p , new LoginSyncIn.OnLoginListner(){

            @Override
            public void OnLiginFailed(String msg) {
                getView().hideProgressDialog();
                getView().showErrorMessage(msg);
            }

            @Override
            public void OnLoginSuccess(CCCRMBean cccrmBean) {
                getView().hideProgressDialog();
                getView().signInSuccessfull(cccrmBean);
                preferencesManager.setCCCMUSER(cccrmBean.getCCCRM_USER());
            }

        });
    }
}
