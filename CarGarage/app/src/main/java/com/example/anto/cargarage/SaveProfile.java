package com.example.anto.cargarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SaveProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        Button save=(Button)findViewById(R.id.save);

        save.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent sintent=new Intent(getApplicationContext(),Login.class);
                        startActivity(sintent);
                    }
                }
        );

    }

}
