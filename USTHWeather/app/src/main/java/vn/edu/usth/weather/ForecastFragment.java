package vn.edu.usth.weather;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.Random;

public class ForecastFragment extends Fragment {
    public ForecastFragment() {

    }

    private static String [] dayName = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    private static int [] iconArray = {R.drawable.clouds, R.drawable.party_cloudy, R.drawable.storm, R.drawable.sun, R.drawable.wind};
    private static String [] weatherStatus = {"Cloudy", "Party Cloudy", "Thunderstorms", "Sunny", "Windy"};
    private Random rand = new Random();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forecast, container, false);
        
    }
}