package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ZweigeltrebeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zweigeltrebe);
        getWindow().setStatusBarColor(ContextCompat.getColor(ZweigeltrebeActivity.this,R.color.bckgColor));
    }
}