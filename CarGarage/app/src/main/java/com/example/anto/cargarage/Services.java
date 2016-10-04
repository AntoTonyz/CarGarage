package com.example.anto.cargarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Services extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        Button snext=(Button)findViewById(R.id.snext);

        snext.setOnClickListener(
                new Button.OnClickListener(

                ) {
                    @Override
                    public void onClick(View v)
                    {
                        Intent sintent=new Intent(getApplicationContext(),Employees.class);
                        startActivity(sintent);
                    }
                }
        );




    }

}
