package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class VeltlineskecerveneraneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veltlinskecervenerane);
        getWindow().setStatusBarColor(ContextCompat.getColor(VeltlineskecerveneraneActivity.this,R.color.bckgColor));
    }
}