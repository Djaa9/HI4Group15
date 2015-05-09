package djaa9.dk.thepage.hi4group15;

import android.app.Application;

import roboguice.RoboGuice;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        RoboGuice.getOrCreateBaseApplicationInjector(
                this,
                RoboGuice.DEFAULT_STAGE,
                RoboGuice.newDefaultRoboModule(this),
                new RoboModule());
    }
}
