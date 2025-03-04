package polinema.ac.id.starterchapter05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import polinema.ac.id.starterchapter05.activities.DynamicActivity;
import polinema.ac.id.starterchapter05.activities.StaticActivity;
import polinema.ac.id.starterchapter05.activities.Tugas;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerStaticFragment(View view) {
        Intent intent = new Intent(this, StaticActivity.class);
        startActivity(intent);
    }

    public void handlerDynamicFragment(View view) {
        Intent intent = new Intent(this, DynamicActivity.class);
        startActivity(intent);
    }

    public void handlerPraktikumFragment(View view) {
        Intent intent = new Intent(this, Tugas.class);
        startActivity(intent);
    }
}