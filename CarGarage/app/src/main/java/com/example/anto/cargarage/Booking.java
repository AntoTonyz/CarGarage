package com.example.anto.cargarage;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Booking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Spinner spinner1=(Spinner)findViewById(R.id.spinner1);

        String[] vehicles = new String[]{"Vehicle","Bus", "Truck", "Matatu","Personal Cars","Bikes"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, vehicles);
        spinner1.setAdapter(adapter);
        Spinner spinner2=(Spinner)findViewById(R.id.spinner2);


        String[] Employees=new String[]{"Employee","John","Mark","Ken","Joshua","Kim"};

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,Employees);
        spinner2.setAdapter(adapter1);

    }

}

