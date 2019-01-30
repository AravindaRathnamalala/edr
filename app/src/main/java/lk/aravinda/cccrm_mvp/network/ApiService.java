package lk.aravinda.cccrm_mvp.network;

import java.util.List;

import lk.aravinda.cccrm_mvp.model.CCCRMBean;
import lk.aravinda.cccrm_mvp.model.Post;
import lk.aravinda.cccrm_mvp.util.Constant;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.moshi.MoshiConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {

  /**
   * Get the list of the pots from the API
   */
  @GET("/posts")
  Call<List<Post>> getPosts();


  /******** Helper class that sets up a new services *******/


  //loginService
  @FormUrlEncoded
  @POST("inspection/login.htm")
  Call<CCCRMBean> login(@Field("username") String username, @Field("password") String password);
  //EOC

  class Creator {

    public static ApiService newApiService() {

      Retrofit retrofit = new Retrofit.Builder()
          .baseUrl(Constant.BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build();

      return retrofit.create(ApiService.class);
    }
  }
}
