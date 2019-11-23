package com.example.dnd_tabletophelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCreateCharacterButtonClicked(View view) {
        Intent intent = new Intent(this, ChooseClassIntroActivity.class);
        startActivity(intent);
    }
}
