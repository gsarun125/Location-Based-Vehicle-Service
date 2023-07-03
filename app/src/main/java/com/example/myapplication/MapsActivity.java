package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.myapplication.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button Find = findViewById(R.id.find);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
        float zoomLevel = 18.0f;
        // Add a marker in Sydney and move the camera
        LatLng you = new LatLng(8.1668, 77.4142);
        mMap.addMarker(new MarkerOptions().position(you).title("you"));

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel));

        Button  Find = findViewById(R.id.find);
        Find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CircleOptions circleOptions = new CircleOptions()
                        .center(you)
                        .radius(2000) // Set the radius of the circle in meters
                        .strokeWidth(5) // Set the stroke width of the circle's outline
                        .strokeColor(Color.RED) // Set the color of the circle's outline
                        .fillColor(Color.argb(70, 255, 0, 0)); // Set the color of the circle's fill

// Add the circle to the map
                Circle circle = googleMap.addCircle(circleOptions);

                float zoomLevel1= 14.0f;
                LatLng p1 = new LatLng(8.159942934984509, 77.40584661610872);
                mMap.addMarker(new MarkerOptions().position(p1).title("Indian oil petrol"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel1));

                LatLng  p2= new LatLng(8.163224565052522, 77.40764906916665);
                mMap.addMarker(new MarkerOptions().position(p2).title("hp"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel1));

                LatLng  p3= new LatLng(8.163224565052522, 77.40764906916665);
                mMap.addMarker(new MarkerOptions().position(p3).title("hp"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel1));

                LatLng  p4= new LatLng(8.162374901854678, 77.41275608943396);
                mMap.addMarker(new MarkerOptions().position(p4).title("Bharat Petroleum"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel1));

                LatLng  p5= new LatLng(8.16859830788742, 77.41939725095601);
                mMap.addMarker(new MarkerOptions().position(p5).title("Indian oil petrol"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel1));

                LatLng  p6= new LatLng(8.17352595822994, 77.41174747913679);
                mMap.addMarker(new MarkerOptions().position(p6).title("Bharat Petroleum"));
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(you, zoomLevel1));


            }
        });

    }

}