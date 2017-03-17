package com.bearever.slidebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SlideButton slideButton = (SlideButton) findViewById(R.id.slide_button);
        final TextView textView = (TextView) findViewById(R.id.text_view);

        slideButton.setOnSlideButtonClickListener(new SlideButton.OnSlideButtonClickListener() {
            @Override
            public void onClicked(boolean isChecked) {
                if (isChecked)
                    textView.setText("SlideButton On!");
                else textView.setText("SlideButton Off!");
            }
        });

    }
}
