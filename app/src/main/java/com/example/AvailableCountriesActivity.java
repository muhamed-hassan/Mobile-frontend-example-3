package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AvailableCountriesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_available_countries);

        // To show back-arrow along with wiring this child to its parent-activity in AndroidManifest.xml
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // InMemoryDataSource that should be replaced later with real DB-calls over the network
        String countries[] = {"Saudi arabia", "United kingdom", "Australia", "Russia", "United states", "France"};

        ListView listView = (ListView) findViewById(R.id.countries_list_view);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, countries);
        listView.setAdapter(arrayAdapter);
    }
}
