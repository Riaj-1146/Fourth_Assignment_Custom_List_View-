package com.example.smart_phone_application_assignment_04;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TouristPlaceAdapter extends ArrayAdapter<TouristPlace> {

    public TouristPlaceAdapter(Context context, ArrayList<TouristPlace> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TouristPlace currentPlace = getItem(position);

        TextView nameTextView = convertView.findViewById(R.id.placeName);
        TextView descriptionTextView = convertView.findViewById(R.id.placeDescription);
        ImageView imageView = convertView.findViewById(R.id.placeImage);

        if (currentPlace != null) {
            nameTextView.setText(currentPlace.getName());
            descriptionTextView.setText(currentPlace.getDescription());
            imageView.setImageResource(currentPlace.getImageResId());
        }

        return convertView;
    }
}
