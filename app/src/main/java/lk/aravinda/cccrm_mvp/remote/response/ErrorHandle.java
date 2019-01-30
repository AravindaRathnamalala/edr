package lk.aravinda.cccrm_mvp.remote.response;

import org.json.JSONObject;

import lk.aravinda.cccrm_mvp.util.Constant;
import retrofit2.Response;

public class ErrorHandle {

  public static String getApiErrorMessage(Response<?> response) {
    String error = null;
    try {
      JSONObject jObjError = new JSONObject(response.errorBody().string());
      error = jObjError.getString("error");
    } catch (Exception e) {
      error = Constant.REQUEST_FAILED;
    }
    return error;
  }
}
