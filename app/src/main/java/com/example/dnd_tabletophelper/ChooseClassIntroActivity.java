package com.example.dnd_tabletophelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ChooseClassIntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        TextView tileTextView = findViewById(R.id.textActivity_title);  //Title
        ImageView imageView = findViewById(R.id.section_1_ImageView); //Image
        TextView textView = findViewById(R.id.section_1_textView); //1st Section of text
        Button button = findViewById(R.id.nextButton); //Next Button

        tileTextView.setText(R.string.chooseClassScreenTitle);
        imageView.setImageResource(R.drawable.choose_class);
        textView.setText(R.string.chooseClassDescription);
        button.setText(R.string.chooseClassScreenButtonString);
    }

    public void onNextButtonClicked(View view) {
        Intent intent = new Intent(this, ChooseClassMenuActivity.class);
        startActivity(intent);
    }
}
