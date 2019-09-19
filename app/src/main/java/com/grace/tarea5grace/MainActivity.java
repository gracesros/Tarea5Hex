package com.grace.tarea5grace;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String colorHex = "#000000";
    SeekBar rColor, bColor, gColor;
    TextView rtextView, btextView, gtextView, textColor;
    View colorSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View colorSample = findViewById(R.id.colorSample);
        colorSample.setBackgroundColor(Color.parseColor(colorHex));

        rColor = findViewById(R.id.rColor);
        bColor = findViewById(R.id.bColor);
        gColor = findViewById(R.id.gColor);

        textColor = findViewById(R.id.textColor);
        rtextView = findViewById(R.id.rtextView);
        btextView = findViewById(R.id.btextView);
        gtextView = findViewById(R.id.gtextView);

        bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                btextView.setText("Green " + progress);
                String hex = "#" + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress()) + ColorUtils.decimalToHex(rColor.getProgress());
                textColor.setText(hex);
                colorSample.setBackgroundColor(Color.parseColor(hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                rtextView.setText("Blue " + progress);
                String hex = "#" + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress()) + ColorUtils.decimalToHex(rColor.getProgress());
                colorSample.setBackgroundColor(Color.parseColor(hex));
                textColor.setText(hex);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                gtextView.setText("Red " + progress);
                String hex = "#" + ColorUtils.decimalToHex(gColor.getProgress()) + ColorUtils.decimalToHex(bColor.getProgress()) + ColorUtils.decimalToHex(rColor.getProgress());
                textColor.setText(hex);
                colorSample.setBackgroundColor(Color.parseColor(hex));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        String hexValue = "0" + ColorUtils.decimalToHex(0) + ColorUtils.decimalToHex(128) + ColorUtils.decimalToHex(0);
        System.out.println(hexValue);
        Color.parseColor("#000000");
    }
}
