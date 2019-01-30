package lk.aravinda.cccrm_mvp.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;

import javax.inject.Inject;
import javax.inject.Singleton;

import lk.aravinda.cccrm_mvp.R;
import lk.aravinda.cccrm_mvp.injection.ApplicationContext;
import lk.aravinda.cccrm_mvp.model.CCCRMObjBean;

/**
 * Created by aravinda_r on 9/20/2018.
 */

@Singleton
public class PreferencesManager {

    public static final String AUTH_TOKEN = "auth_token";
    private static final String USER = "CCCMUSER";
    private static final String INSPECTION_LIST = "INSPECTION_LIST";
    private final SharedPreferences mPreferences;
//    ArrayList<LatLng> locationLists;
    private Context mContext;
    private Gson gson;

    @Inject
    public PreferencesManager(@ApplicationContext Context context){

        mContext = context;
        mPreferences = mContext.getSharedPreferences(mContext.getString(R.string.app_name), Context.MODE_PRIVATE);

    }

    public CCCRMObjBean getCCCMUSER() {
        Gson gson = new Gson();
        String json = mPreferences.getString(USER, "");
        CCCRMObjBean user = gson.fromJson(json, CCCRMObjBean.class);
        return user;
    }

    public void setCCCMUSER(CCCRMObjBean cccmuser) {
        SharedPreferences.Editor editor = mPreferences.edit();
        Gson gson = new Gson();
        String userJson = gson.toJson(cccmuser);
        editor.putString(USER, userJson);
        editor.commit();
    }

}
