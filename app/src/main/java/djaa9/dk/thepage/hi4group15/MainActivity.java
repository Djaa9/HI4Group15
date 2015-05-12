package djaa9.dk.thepage.hi4group15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements MenuFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onNewMenuItemSelected(String selectedMenuItem) {
        Intent intent = new Intent(this, ContentActivity.class);
        intent.putExtra("KEY", selectedMenuItem);
        startActivity(intent);
    }
}

