package app.android.mmauri.seccion_5_mylogin.Utils;

import android.content.SharedPreferences;

/**
 * Created by marc on 10/26/17.
 */

public class Util {

    public static String getUserMailPrefs(SharedPreferences preferences) {
        return preferences.getString("email", "");
    }

    public static String getUserPassPrefs(SharedPreferences preferences) {
        return preferences.getString("pass", "");
    }

}
