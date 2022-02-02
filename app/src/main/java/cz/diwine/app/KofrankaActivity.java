package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class KofrankaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kofranka);
        getWindow().setStatusBarColor(ContextCompat.getColor(KofrankaActivity.this,R.color.bckgColor));
    }
}