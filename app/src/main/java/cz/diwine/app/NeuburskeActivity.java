package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class NeuburskeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neuburske);
        getWindow().setStatusBarColor(ContextCompat.getColor(NeuburskeActivity.this,R.color.bckgColor));
    }
}