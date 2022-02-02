package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SvatovavrineckeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svatovavrinecke);
        getWindow().setStatusBarColor(ContextCompat.getColor(SvatovavrineckeActivity.this,R.color.bckgColor));
    }
}