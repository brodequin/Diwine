package cz.diwine.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;

public class AromatickeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aromaticke);
        getWindow().setStatusBarColor(ContextCompat.getColor(AromatickeActivity.this,R.color.bckgColor));


    }
}