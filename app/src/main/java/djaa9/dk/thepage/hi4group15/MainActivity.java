package djaa9.dk.thepage.hi4group15;

import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MainActivity extends FragmentActivity implements MenuFragment.OnFragmentInteractionListener {
    private FragmentManager _fragmentManager;
    private FragmentTransaction _fragmentTransaction;
    private MenuFragment _menuFragment;
    private ContentFragment _contentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _menuFragment = new MenuFragment();
        _contentFragment = new ContentFragment();
        _fragmentManager = getSupportFragmentManager();

        if (findViewById(R.id.activity_main).getTag().equals("phone_mode")) {
            if (findViewById(R.id.fragment_container) != null) {

                if (savedInstanceState != null) {
                    return;
                }
                _fragmentManager.beginTransaction().add(R.id.fragment_container, _contentFragment).commit();
                _fragmentManager.beginTransaction().add(R.id.fragment_container, _menuFragment).commit();
            }
        }

        if (findViewById(R.id.activity_main).getTag().equals("tablet_mode")) {
            if (findViewById(R.id.menu_fragment_container) != null
                    && findViewById(R.id.content_fragment_container) != null ) {

                if (savedInstanceState != null) {
                    return;
                }
                 _fragmentManager.beginTransaction().add(R.id.menu_fragment_container, _menuFragment).commit();
                _fragmentManager.beginTransaction().add(R.id.content_fragment_container, _contentFragment).commit();
            }
        }

    }

    @Override
    public void onNewMenuItemSelected(String selectedMenuItem) {

        if (findViewById(R.id.activity_main).getTag().equals("phone_mode")) {
            _contentFragment.setSelecteditem(selectedMenuItem);

            _fragmentTransaction = getSupportFragmentManager().beginTransaction();
            _fragmentTransaction.replace(R.id.fragment_container, _contentFragment);

            _fragmentTransaction.addToBackStack(null);
            _fragmentTransaction.commit();
        }

        if (findViewById(R.id.activity_main).getTag().equals("tablet_mode")) {
            _contentFragment.setSelecteditem(selectedMenuItem);

        }
    }
}

