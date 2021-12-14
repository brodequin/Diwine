package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CabernetDorsaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabernetdorsa);
        getWindow().setStatusBarColor(ContextCompat.getColor(CabernetDorsaActivity.this,R.color.bckgColorDetail));
    }
}