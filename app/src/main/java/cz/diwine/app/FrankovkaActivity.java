package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class FrankovkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frankovka);
        getWindow().setStatusBarColor(ContextCompat.getColor(FrankovkaActivity.this,R.color.bckgColor));
    }
}