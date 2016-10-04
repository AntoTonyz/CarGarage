package com.example.anto.cargarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button nlogin=(Button)findViewById(R.id.nlogin);
        nlogin.setOnClickListener(
                new Button.OnClickListener(

                ) {
                    @Override
                    public void onClick(View v) {

                        Intent nintent=new Intent(getApplicationContext(),Dashboard.class);
                        startActivity(nintent);

                    }
                }
        );
    }

}
