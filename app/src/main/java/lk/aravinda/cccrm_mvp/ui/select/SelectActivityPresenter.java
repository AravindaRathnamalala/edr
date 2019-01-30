package lk.aravinda.cccrm_mvp.ui.select;

import javax.inject.Inject;

import lk.aravinda.cccrm_mvp.remote.LoginSync;
import lk.aravinda.cccrm_mvp.ui.base.BasePresenter;
import lk.aravinda.cccrm_mvp.util.PreferencesManager;


/**
 * Created by aravinda_r on 9/21/2018.
 */

public class SelectActivityPresenter extends BasePresenter<SelectView> {

//    private LoginSync loginSync;
    private PreferencesManager preferencesManager;

    @Inject
    public SelectActivityPresenter(PreferencesManager preferencesManager){
//        this.loginSync = loginSync;
        this.preferencesManager = preferencesManager;
    }
}
