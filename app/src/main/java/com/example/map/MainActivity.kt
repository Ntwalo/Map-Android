package com.example.map

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.common.MapboxOptions
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.MapView

class MainActivity : AppCompatActivity() {

    private lateinit var mapView: MapView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MapboxOptions.accessToken = "pk.eyJ1IjoibnR3YWxvMjgiLCJhIjoiY20wYzF3djdoMGVzdTJxcjB3bzJpbHMyaiJ9.hrNjYHltIB9P5aplKbZ04w"

        // Create a map programmatically and set the initial camera
        mapView = MapView(this)
        mapView.mapboxMap.setCamera(
            CameraOptions.Builder()
                .center(Point.fromLngLat(24.6727, -28.4793))
                .pitch(0.0)
                .zoom(2.0)
                .bearing(0.0)
                .build()
        )
        // Add the map view to the activity (you can also add it to other views as a child)
        setContentView(mapView)

        setContentView(R.layout.activity_main)
    }
}