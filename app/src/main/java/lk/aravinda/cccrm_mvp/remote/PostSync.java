package lk.aravinda.cccrm_mvp.remote;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;

import lk.aravinda.cccrm_mvp.remote.response.ErrorHandle;
import lk.aravinda.cccrm_mvp.injection.ApplicationContext;
import lk.aravinda.cccrm_mvp.model.Post;
import lk.aravinda.cccrm_mvp.network.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostSync {
  private final ApiService mApiService;
  private final Context mContext;

  @Inject
  public PostSync(@ApplicationContext Context context, ApiService apiService) {
    this.mContext = context;
    this.mApiService = apiService;
  }

  public void getPosts(final PostSyncIn.OnPostListener listener) {
    ApiService.Creator.newApiService()
        .getPosts()
        .enqueue(new Callback<List<Post>>() {
          @Override
          public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
            if (response.isSuccessful()) {
              listener.onPostReceivedSuccess(response.body());
            } else {
              listener.onPostReceivedFailed(ErrorHandle.getApiErrorMessage(response));
            }
          }

          @Override public void onFailure(Call<List<Post>> call, Throwable t) {
          listener.onPostReceivedFailed("ERROR");
          }
        });
  }
}
