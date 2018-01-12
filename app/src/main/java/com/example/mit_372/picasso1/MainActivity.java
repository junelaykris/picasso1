package com.example.mit_372.picasso1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    String s = "hello ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this).load("https://static.tumblr.com/2d06876adc91e4c88344aa9924b28a73/n93hc6n/u07n86n7c/tumblr_static_filename_640_v2.jpg")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .resize(600,600)
                .into(imageView);
        s = "capture camera";


    }
}
