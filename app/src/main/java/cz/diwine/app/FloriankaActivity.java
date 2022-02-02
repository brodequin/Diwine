package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class FloriankaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_florianka);
        getWindow().setStatusBarColor(ContextCompat.getColor(FloriankaActivity.this,R.color.bckgColor));
    }
}