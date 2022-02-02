package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class PortugalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugal);
        getWindow().setStatusBarColor(ContextCompat.getColor(PortugalActivity.this,R.color.bckgColor));
    }
}