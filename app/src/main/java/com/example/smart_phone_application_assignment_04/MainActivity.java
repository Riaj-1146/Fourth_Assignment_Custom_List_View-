package com.example.smart_phone_application_assignment_04;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.touristPlacesListView);


        ArrayList<TouristPlace> places = new ArrayList<>();
        places.add(new TouristPlace("Niladri Lake", "A scenic lake near the border", R.drawable.niladri));
        places.add(new TouristPlace("Shimul Bagan", "A red silk cotton tree garden", R.drawable.shimul_bagan));
        places.add(new TouristPlace("Jadukata River", "A magical river with crystal clear water", R.drawable.jaduka));
        places.add(new TouristPlace("Haor Bilas", "A beautiful haor ecosystem", R.drawable.haor_bilas));


        TouristPlaceAdapter adapter = new TouristPlaceAdapter(this, places);
        listView.setAdapter(adapter);
    }
}