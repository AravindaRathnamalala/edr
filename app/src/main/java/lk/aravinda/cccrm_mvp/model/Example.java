package lk.aravinda.cccrm_mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by aravinda_r on 9/21/2018.
 */

public class Example {

    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("data")
    @Expose
    private List<InspectionDataBean> data = null;
    @SerializedName("status")
    @Expose
    private String status;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<InspectionDataBean> getData() {
        return data;
    }

    public void setData(List<InspectionDataBean> data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
