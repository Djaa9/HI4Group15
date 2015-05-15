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

        if (findViewById(R.id.fragment_container) != null){

            if (savedInstanceState != null){
                return;
            }

            _menuFragment = new MenuFragment();
            _fragmentManager = getSupportFragmentManager();

            _fragmentManager.beginTransaction().add(R.id.fragment_container, _menuFragment).commit();
        }

    }

    @Override
    public void onNewMenuItemSelected(String selectedMenuItem) {

        _contentFragment = new ContentFragment();
        Bundle args = new Bundle();
        args.putString(ContentFragment.ARG_SELECTED_ITEM, selectedMenuItem);
        _contentFragment.setArguments(args);

        _fragmentTransaction = getSupportFragmentManager().beginTransaction();

        _fragmentTransaction.replace(R.id.fragment_container, _contentFragment);
        _fragmentTransaction.addToBackStack(null);
        _fragmentTransaction.commit();
    }
}

