package cz.diwine.app;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class PalavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palava);
        getWindow().setStatusBarColor(ContextCompat.getColor(PalavaActivity.this,R.color.bckgColor));
    }
}