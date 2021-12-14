package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class CabernetcortisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cabernetcortis);
        getWindow().setStatusBarColor(ContextCompat.getColor(CabernetcortisActivity.this,R.color.bckgColorDetail));
    }
}