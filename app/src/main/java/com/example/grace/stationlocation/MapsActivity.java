package com.example.grace.stationlocation;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    //hardcoded locations
    private MarkerOptions[] locationMarkers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
        MarkerOptions location1 = new MarkerOptions().position(new LatLng(38.80, -76.9390)).title("Tambre Hu");
        MarkerOptions location2 = new MarkerOptions().position(new LatLng(39.2, -76.9389)).title("Cassie Quach");
        MarkerOptions location3 = new MarkerOptions().position(new LatLng(38, -76.921)).title("Grace Qian");
        MarkerOptions location4 = new MarkerOptions().position(new LatLng(38.3, -76.950)).title("Anthea Li");
        locationMarkers = new MarkerOptions[4];
        locationMarkers[0] = location1;
        locationMarkers[1] = location2;
        locationMarkers[2] = location3;
        locationMarkers[3] = location4;

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.addMarker(locationMarkers[1]);
        //fills the map with pins
        for(int k = 0; k<locationMarkers.length; k++){
            mMap.addMarker(locationMarkers[k]);
        }

//        //current location is UMD (hardcoded)
        LatLng currentLocation = new LatLng(38.9860, -76.9389);
        MarkerOptions currentLocationMarkerOption = new MarkerOptions().position(currentLocation).title("You are here").icon(BitmapDescriptorFactory
                .defaultMarker(BitmapDescriptorFactory.HUE_CYAN));;
        mMap.addMarker(currentLocationMarkerOption);
//        //moves map to current location, zooms in city which is represented by "10"
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 10));



//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}
