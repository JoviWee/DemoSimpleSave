package sg.edu.rp.c346.id20008787.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        String msg = prefs.getString("greetings", "No greetings");
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Step 1: Obtain the SharedPreferneces instance
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        //Step 2: Create a SharedPreferences Editor by calling edit()
        SharedPreferences.Editor prefEdit = prefs.edit();
        //Step 3: Set a key-value pair in the editor
        prefEdit.putString("greetings", "Hello!");
        //Step 4: Call commit() to save the changes made to the SharedPreference
        prefEdit.commit();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}