package djaa9.dk.thepage.hi4group15;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class ContentActivity extends FragmentActivity implements ContentFragment.OnFragmentInteractionListener {
    private Intent _intent;
    private String _selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        _intent = getIntent();
        _selectedItem = _intent.getStringExtra("KEY");

        ContentFragment fragment = (ContentFragment) getSupportFragmentManager().findFragmentById(R.id.frg_content);

        fragment.setSelectedItemText(_selectedItem);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
