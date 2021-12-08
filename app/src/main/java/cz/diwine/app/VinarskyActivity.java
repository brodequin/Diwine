package cz.diwine.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

public class VinarskyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinarsky);
        getWindow().setStatusBarColor(ContextCompat.getColor(VinarskyActivity.this,R.color.bckgColorDetail));
    }
}