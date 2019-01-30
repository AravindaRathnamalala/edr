package lk.aravinda.cccrm_mvp.injection.component;

import dagger.Subcomponent;
import lk.aravinda.cccrm_mvp.injection.PerActivity;
import lk.aravinda.cccrm_mvp.injection.module.ActivityModule;
import lk.aravinda.cccrm_mvp.ui.login.LoginActivity;
import lk.aravinda.cccrm_mvp.ui.select.SelectActivity;


@PerActivity
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {



  void inject(LoginActivity loginActivity);

  void inject(SelectActivity selectActivity);

}
