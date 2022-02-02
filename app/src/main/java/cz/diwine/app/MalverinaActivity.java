package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MalverinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malverina);
        getWindow().setStatusBarColor(ContextCompat.getColor(MalverinaActivity.this,R.color.bckgColor));
    }
}