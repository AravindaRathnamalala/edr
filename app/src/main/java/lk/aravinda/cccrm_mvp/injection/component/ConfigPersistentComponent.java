package lk.aravinda.cccrm_mvp.injection.component;

import dagger.Component;
import lk.aravinda.cccrm_mvp.injection.ConfigPersistent;
import lk.aravinda.cccrm_mvp.injection.module.ActivityModule;

/**
 * A dagger component that will live during the lifecycle of an Activity but it won't
 * be destroy during configuration changes. Check {@link BaseActivity} to see how this components
 * survives configuration changes.
 * Use the {@link ConfigPersistent} scope to annotate dependencies that need to survive
 * configuration changes (for example Presenters).
 */
@ConfigPersistent
@Component(dependencies = {ApplicationComponents.class})
public interface ConfigPersistentComponent {
  ActivityComponent activityComponent(ActivityModule activityModule);
}