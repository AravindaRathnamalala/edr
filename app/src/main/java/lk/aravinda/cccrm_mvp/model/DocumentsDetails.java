package lk.aravinda.cccrm_mvp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by aravinda_r on 9/21/2018.
 */

public class DocumentsDetails {

    @SerializedName("base64Img")
    @Expose
    private String base64Img;
    @SerializedName("pageId")
    @Expose
    private Integer pageId;
    @SerializedName("pagename")
    @Expose
    private String pagename;

    public String getBase64Img() {
        return base64Img;
    }

    public void setBase64Img(String base64Img) {
        this.base64Img = base64Img;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPagename() {
        return pagename;
    }

    public void setPagename(String pagename) {
        this.pagename = pagename;
    }
}
