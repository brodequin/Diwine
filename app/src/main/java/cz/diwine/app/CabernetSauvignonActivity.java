package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CabernetSauvignonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabernetsauvignon);
        getWindow().setStatusBarColor(ContextCompat.getColor(CabernetSauvignonActivity.this,R.color.bckgColor));
    }
}