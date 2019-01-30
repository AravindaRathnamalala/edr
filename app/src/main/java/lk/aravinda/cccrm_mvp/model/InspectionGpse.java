package lk.aravinda.cccrm_mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aravinda_r on 9/21/2018.
 */

public class InspectionGpse {

    @SerializedName("gpsLongitude")
    @Expose
    private String gpsLongitude;
    @SerializedName("sequenceId")
    @Expose
    private Integer sequenceId;
    @SerializedName("gpsLatitude")
    @Expose
    private String gpsLatitude;

    public String getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(String gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public Integer getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(Integer sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(String gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }
}
