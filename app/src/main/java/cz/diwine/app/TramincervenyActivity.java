package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class TramincervenyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tramincerveny);
        getWindow().setStatusBarColor(ContextCompat.getColor(TramincervenyActivity.this,R.color.bckgColor));
    }
}