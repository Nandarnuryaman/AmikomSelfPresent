package com.example.lenovo.amikomselfpresent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class hal_code extends AppCompatActivity {
    TextView kodepresensi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_code);
        Button btn = (Button) findViewById(R.id.btn_absen);

       kodepresensi  = (TextView)findViewById(R.id.Kode) ;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if (kodepresensi.getText().toString().equals("8581")){
                        Intent il = new Intent(getApplicationContext(),presensi_berhasil.class);
                        startActivity(il);
                    }

                    else{
                        Intent il = new Intent(getApplicationContext(),gagal.class);
                        startActivity(il);
                    }
                }
            }});

    }

}