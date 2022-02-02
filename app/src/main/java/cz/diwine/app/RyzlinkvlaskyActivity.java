package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class RyzlinkvlaskyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryzlinkvlasky);
        getWindow().setStatusBarColor(ContextCompat.getColor(RyzlinkvlaskyActivity.this,R.color.bckgColor));
    }
}