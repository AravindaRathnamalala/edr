package lk.aravinda.cccrm_mvp.model;

import android.os.Parcel;

/**
 * Created by aravinda_r on 9/20/2018.
 */

public class CCCRMBean {

    private String msg;
    private CCCRMObjBean CCCRM_USER;
    private String status;

    public CCCRMBean(Parcel in) {
        msg = in.readString();
        CCCRM_USER = in.readParcelable(getClass().getClassLoader());
        status = in.readString();
    }

    public CCCRMBean(String msg, CCCRMObjBean CCCRM_USER, String status) {

    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public CCCRMObjBean getCCCRM_USER() {
        return CCCRM_USER;
    }

    public void setCCCRM_USER(CCCRMObjBean CCCM_USER) {
        this.CCCRM_USER = CCCM_USER;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
