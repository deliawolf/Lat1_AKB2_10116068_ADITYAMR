package com.example.lat1_akb2_10116068_adityamr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//NIM   : 10116068
//NAMA  : Aditya Maulana R
//KELAS : AKB2
//Tanggal   Buat    :
//Change LOG 03-04-2019 07:00 AM
// 1. activity_main and MainActivity
//Change LOG 03-04-2019 12:00 AM
//2. activity_main2 and MainActivity2
//Change LOG 03-04-2019 04:00 PM
//3. Activity_main3 and MainActivity3
//Chane LOG 04-04-2019 11:00 PM
//4. Activity_main4 and MainActivity4

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class ));
            }
        });
    }
}
