package lk.aravinda.cccrm_mvp;

import android.app.Application;
import android.content.Context;

import lk.aravinda.cccrm_mvp.injection.component.ApplicationComponents;
import lk.aravinda.cccrm_mvp.injection.component.DaggerApplicationComponents;
import lk.aravinda.cccrm_mvp.injection.module.ApplicationModule;



public class BaseApplication extends Application {

    ApplicationComponents mApplicationComponent;

    public static BaseApplication get(Context context) {
        return (BaseApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            //Fabric.with(this, new Crashlytics());
        }
    }

    public ApplicationComponents getComponent() {
        if (mApplicationComponent == null) {
            mApplicationComponent = DaggerApplicationComponents.builder()
                    .applicationModule(new ApplicationModule(this))
                    .build();
        }
        return mApplicationComponent;
    }

    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponents applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
