package djaa9.dk.thepage.hi4group15;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ContentActivity extends Activity {
    private TextView textView;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        textView = (TextView) findViewById(R.id.content_txt);

        intent = getIntent();
        textView.setText(intent.getStringExtra("KEY"));
    }
}
