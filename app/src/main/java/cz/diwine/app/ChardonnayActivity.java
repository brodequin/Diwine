package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ChardonnayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chardonnay);
        getWindow().setStatusBarColor(ContextCompat.getColor(ChardonnayActivity.this,R.color.bckgColor));
    }
}