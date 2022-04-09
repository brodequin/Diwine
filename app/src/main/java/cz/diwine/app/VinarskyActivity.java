package cz.diwine.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VinarskyActivity extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinarsky);
        getWindow().setStatusBarColor(ContextCompat.getColor(VinarskyActivity.this,R.color.bckgColor));

        textView = findViewById(R.id. slovnik);


       // textView.setText(Html.fromHtml(getStringResourceByName("slovnikobsah")));


        new BackgroundTask(VinarskyActivity.this) {

            String text = "";

            @Override
            public void doInBackground() {

                //put you background code
                //same like doingBackground
                //Background Thread

                text= getTermsString();
            }

            @Override
            public void onPostExecute() {

                textView.setText(Html.fromHtml(text));

                //hear is result part same
                //same like post execute
                //UI Thread(update your UI widget)
            }
        }.execute();


    }

    private String getStringResourceByName(String aString) {
        String packageName = getPackageName();
        int resId = getResources().getIdentifier(aString, "string", packageName);
        return getString(resId);
    }

    private String getTermsString() {
        StringBuilder termsString = new StringBuilder();
        BufferedReader reader;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(getAssets().open("slovnikobsah.txt")));

            String str;
            while ((str = reader.readLine()) != null) {
                termsString.append(str);
            }

            reader.close();
            return termsString.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}