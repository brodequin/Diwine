package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MuskatmoravskyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muskatmoravsky);
        getWindow().setStatusBarColor(ContextCompat.getColor(MuskatmoravskyActivity.this,R.color.bckgColor));
    }
}