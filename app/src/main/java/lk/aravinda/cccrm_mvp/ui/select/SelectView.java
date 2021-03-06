package lk.aravinda.cccrm_mvp.ui.select;

import lk.aravinda.cccrm_mvp.model.CCCRMBean;
import lk.aravinda.cccrm_mvp.ui.base.BaseView;

/**
 * Created by aravinda_r on 9/21/2018.
 */

public interface SelectView extends BaseView {

    void signInSuccessfull(CCCRMBean cccrmBean);

    void showErrorMessage(String msg);

    void showToast(String msg);

    void showProgressDialog();

    void hideProgressDialog();
}
