package com.fabiohideki.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "EXTRA_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        TextView textView = findViewById(R.id.tv_joke);


        String joke = getIntent().getStringExtra(EXTRA_JOKE);

        if (!("").equals(joke)) {
            textView.setText(joke);
        }

    }
}
