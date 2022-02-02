package cz.diwine.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class AuxerroisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auxerrois);
        getWindow().setStatusBarColor(ContextCompat.getColor(AuxerroisActivity.this,R.color.bckgColor));
    }
}