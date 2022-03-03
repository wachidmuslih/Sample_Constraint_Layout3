package com.example.sampleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    //Insialisasi
    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password, email, pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menghubungkan variabel dengan componen pada layout
        btnLogin = findViewById(R.id.btSignin);

        edemail = findViewById(R.id.edEmail);

        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Validation();

                //Toast t = Toast.makeText(getApplicationContext(), "email anda: "+ nama+ " dan Password anda: "+password+ "", Toast.LENGTH_LONG);
                //t.show();
            }
        });
    }

    public void Validation()
    {
        //menyimpan input di edittext ke dalam variabel
        nama = edemail.getText().toString();

        password = edpassword.getText().toString();

//        // isi variabel email dan pwd
//        email = "admin@gmail.com";
//
//        pwd = "123456";

        if( nama.isEmpty() && password.isEmpty())
        {
            edemail.setError("Email diperlukan!");
            edpassword.setError("Password diperlukan!");
        }
        if ( nama.equals("admin@gmail.com") && password.equals("123456"))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "LOGIN SUKSES", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0,0);
            toast.show();
        }
        else if ( !nama.equals("admin@gmail.com") && password.equals("123456"))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "EMAIL SALAH", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0,0);
            toast.show();
        }
        else if ( nama.equals("admin@gmail.com") && !password.equals("123456"))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "PASSWORD SALAH", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0,0);
            toast.show();
        }
        else if ( !nama.equals("admin@gmail.com") && !password.equals("123456"))
        {
            Toast toast = Toast.makeText(getApplicationContext(), "EMAIL DAN PASSWORD SALAH", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0,0);
            toast.show();
        }

    }
}