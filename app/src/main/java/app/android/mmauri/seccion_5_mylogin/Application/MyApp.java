package app.android.mmauri.seccion_5_mylogin.Application;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by marc on 10/26/17.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SystemClock.sleep(1500);
    }
}
