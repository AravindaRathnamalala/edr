package lk.aravinda.cccrm_mvp.injection.component;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Component;
import lk.aravinda.cccrm_mvp.injection.ApplicationContext;
import lk.aravinda.cccrm_mvp.injection.module.ApplicationModule;
import lk.aravinda.cccrm_mvp.network.ApiService;
import lk.aravinda.cccrm_mvp.util.PreferencesManager;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponents {
  @ApplicationContext
  Context context();

  Application application();

  ApiService apiService();

  PreferencesManager preferencesManager();

}
