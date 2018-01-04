package com.example.lenovo.amikomselfpresent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView email, password;

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
           Button btn = (Button) findViewById(R.id.btnLogin);

           email = (TextView)findViewById(R.id.userEmail) ;
           password = (TextView)findViewById(R.id.userPassword);

           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if (email.getText().toString().equals("8581") && password.getText().toString().equals("admin")){
                       Intent il = new Intent(getApplicationContext(),profile_mahasiswa.class);
                       startActivity(il);
                   }else{
                       Toast.makeText(getApplicationContext(),"Username dan password salah", Toast.LENGTH_SHORT).show();
                   }
               }
           });
    }

}
