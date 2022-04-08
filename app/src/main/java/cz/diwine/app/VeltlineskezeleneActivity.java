package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class VeltlineskezeleneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veltlinskezelene);
        getWindow().setStatusBarColor(ContextCompat.getColor(VeltlineskezeleneActivity.this,R.color.bckgColor));
    }
}