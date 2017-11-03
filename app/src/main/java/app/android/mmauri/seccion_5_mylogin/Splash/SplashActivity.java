package app.android.mmauri.seccion_5_mylogin.Splash;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import app.android.mmauri.seccion_5_mylogin.Activities.LoginActivity;
import app.android.mmauri.seccion_5_mylogin.Activities.MainActivity;
import app.android.mmauri.seccion_5_mylogin.Utils.Util;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        Intent intentLogin = new Intent(this, LoginActivity.class);
        Intent intentMain = new Intent(this, MainActivity.class);

        if (!TextUtils.isEmpty(Util.getUserMailPrefs(prefs)) &&
                !TextUtils.isEmpty(Util.getUserPassPrefs(prefs))) {
            startActivity(intentMain);
        }
        else {
            startActivity(intentLogin);
        }

        /* finish() porque nunca queremos volver aqui, se borra del historial, etc */
        finish();
    }

}
