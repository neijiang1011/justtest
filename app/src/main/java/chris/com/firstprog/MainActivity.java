package chris.com.firstprog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("MainActivity","nothing");
        Log.v("MainActivity","add a line.");
        Log.v("MainActivity","add second line.");
        Log.v("MainActivity","add third line.");
        Log.v("MainActivity","add fourth line.");

    }
}
