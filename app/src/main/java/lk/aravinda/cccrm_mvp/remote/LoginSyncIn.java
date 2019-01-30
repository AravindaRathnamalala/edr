package lk.aravinda.cccrm_mvp.remote;

import lk.aravinda.cccrm_mvp.model.CCCRMBean;

/**
 * Created by aravinda_r on 9/20/2018.
 */

public interface LoginSyncIn {


    interface OnLoginListner{

         void OnLiginFailed(String msg);

         void OnLoginSuccess(CCCRMBean cccrmBean);

    }
}
