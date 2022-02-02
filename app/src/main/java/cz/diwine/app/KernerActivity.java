package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class KernerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerner);
        getWindow().setStatusBarColor(ContextCompat.getColor(KernerActivity.this,R.color.bckgColor));
    }
}