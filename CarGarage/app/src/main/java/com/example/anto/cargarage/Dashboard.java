package com.example.anto.cargarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ImageButton bookings=(ImageButton)findViewById(R.id.bookings);
        bookings.setOnClickListener(
                new ImageButton.OnClickListener(

                ) {
                    @Override
                    public void onClick(View v) {

                        Intent uintent=new Intent(getApplicationContext(),Booking.class);
                        startActivity(uintent);
                    }
                }
        );


    }

}
