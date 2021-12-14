package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CabernetMoraviaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabernetmoravia);
        getWindow().setStatusBarColor(ContextCompat.getColor(CabernetMoraviaActivity.this,R.color.bckgColorDetail));
    }
}