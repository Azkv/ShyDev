package com.shy.azarkovic.shy;

import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.nlopez.smartlocation.OnLocationUpdatedListener;
import io.nlopez.smartlocation.SmartLocation;

public class Main extends AppCompatActivity implements OnLocationUpdatedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SmartLocation.with(this).location().oneFix().start(this);
    }

    @Override
    public void onLocationUpdated(Location location) {
        Log.v("locator", "Acc: " + location.getAccuracy() + " LAT:" + location.getLatitude());
    }
}
