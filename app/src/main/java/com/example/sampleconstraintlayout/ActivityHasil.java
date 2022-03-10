package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Deklarasi variabel TextView
        TextView txEmail, txPassword;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        //hubungkan variabel dengan component text view
        txEmail = findViewById(R.id.tvEmail);

        txPassword = findViewById(R.id.tvPassword);

        //deklarasi variabel bundle untuk mengambil pesan melalui intent
        Bundle bundle = getIntent().getExtras();

        //membuat variabel untuk menyimpan data yg dikirim dari activity sebelumnya
        String email = bundle.getString("a");

        String pass = bundle.getString("b");

        //menampilkan value dari variabel kedalam txEmail maupun txPassword
        txEmail.setText(email);

        txPassword.setText(pass);

    }
}