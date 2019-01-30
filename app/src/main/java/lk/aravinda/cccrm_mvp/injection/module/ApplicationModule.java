package lk.aravinda.cccrm_mvp.injection.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lk.aravinda.cccrm_mvp.injection.ApplicationContext;
import lk.aravinda.cccrm_mvp.network.ApiService;

/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {

  protected final Application mApplication;

  public ApplicationModule(Application application) {
    mApplication = application;
  }

  @Provides
  Application provideApplication() {
    return mApplication;
  }

  @Provides
  @ApplicationContext
  Context provideContext() {
    return mApplication;
  }

  @Provides
  @Singleton
  ApiService provideApiService() {
    return ApiService.Creator.newApiService();
  }
}
