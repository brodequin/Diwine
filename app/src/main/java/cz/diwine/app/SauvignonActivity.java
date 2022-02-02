package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SauvignonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sauvignon);
        getWindow().setStatusBarColor(ContextCompat.getColor(SauvignonActivity.this,R.color.bckgColor));
    }
}