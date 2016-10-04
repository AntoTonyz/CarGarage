package com.example.anto.cargarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profile=(Button)findViewById(R.id.profile);
        Button exprofile=(Button)findViewById(R.id.exprofile);

        profile.setOnClickListener(
                new Button.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(getApplicationContext(), BusinessInfo.class);
                        startActivity(intent);
                    }


                }

        );

        exprofile.setOnClickListener(
                new Button.OnClickListener()
                {


                    @Override
                    public void onClick(View v)
                    {
                        Intent exprof=new Intent(getApplicationContext(),Login.class);
                        startActivity(exprof);
                    }
                }


        );





    }
}
