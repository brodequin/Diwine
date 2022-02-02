package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SylvanskezeleneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylvanskezelene);
        getWindow().setStatusBarColor(ContextCompat.getColor(SylvanskezeleneActivity.this,R.color.bckgColor));
    }
}