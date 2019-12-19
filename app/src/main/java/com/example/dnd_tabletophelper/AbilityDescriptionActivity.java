package com.example.dnd_tabletophelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AbilityDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        String title = getIntent().getStringExtra("title");
        String string = getIntent().getStringExtra("string");

        TextView tileTextView = findViewById(R.id.textActivity_title);  //Title
        ImageView imageView = findViewById(R.id.section_1_ImageView); //Image
        TextView textView = findViewById(R.id.section_1_textView); //1st Section of text
        Button button = findViewById(R.id.nextButton); //Next Button

        tileTextView.setText(title);
        imageView.getLayoutParams().height = 0;
        textView.setText(Html.fromHtml(string));
        button.setVisibility(View.INVISIBLE);
    }
}
