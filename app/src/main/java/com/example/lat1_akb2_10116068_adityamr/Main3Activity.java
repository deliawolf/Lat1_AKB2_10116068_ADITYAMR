package com.example.lat1_akb2_10116068_adityamr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    EditText Nama;
    Button selanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Nama = (EditText) findViewById(R.id.inputtext2);

        selanjutnya = (Button) findViewById(R.id.button3);
        selanjutnya.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button3:
                String nama = Nama.getText().toString();


                Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                intent.putExtra("nama",nama);

                startActivity(intent);

        }
    }
}