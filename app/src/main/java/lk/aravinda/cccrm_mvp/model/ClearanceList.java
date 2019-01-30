package lk.aravinda.cccrm_mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aravinda_r on 9/21/2018.
 */

public class ClearanceList {

    @SerializedName("clearancename")
    @Expose
    private String clearancename;
    @SerializedName("clearancestatus")
    @Expose
    private String clearancestatus;

    public String getClearancename() {
        return clearancename;
    }

    public void setClearancename(String clearancename) {
        this.clearancename = clearancename;
    }

    public String getClearancestatus() {
        return clearancestatus;
    }

    public void setClearancestatus(String clearancestatus) {
        this.clearancestatus = clearancestatus;
    }
}
