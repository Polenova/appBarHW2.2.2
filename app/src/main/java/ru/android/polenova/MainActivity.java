package ru.android.polenova;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
        public boolean onCreateOptionsMenu (Menu menu) {
        // Inflate the menu, this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

    @Override
        public boolean onOptionsItemSelected (MenuItem item){
            int id = item.getItemId();
            if  (id == R.id.action_settings){
                return false;
            } else if(id == R.id.action_open_notes) {
                Toast.makeText(MainActivity.this, getString(R.string.toast_txt), Toast.LENGTH_LONG).show();
                Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
}
