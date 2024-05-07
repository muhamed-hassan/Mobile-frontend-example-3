package com.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showCountriesButton = (Button) findViewById(R.id.show_countries_button);
        showCountriesButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToAvailableCountriesScreen();
            }
        });
    }

    public void goToAvailableCountriesScreen() {
        Intent intent = new Intent(this, AvailableCountriesActivity.class);
        startActivity(intent);
    }
}
