package me.lile.testStealAction;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Toast.makeText(getBaseContext(),
                       "Steal success!\nusername: " + this.getIntent().getStringExtra("username") +
                       "\npassword: " + this.getIntent().getStringExtra("password"),
                       Toast.LENGTH_LONG).show();
    }
}
