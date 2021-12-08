package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class AlibernetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alibernet);
        getWindow().setStatusBarColor(ContextCompat.getColor(AlibernetActivity.this,R.color.bckgColorDetail));
    }
}