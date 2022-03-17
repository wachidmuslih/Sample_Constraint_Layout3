package com.example.sampleconstraintlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.zip.DataFormatException;

public class ActivityRegister extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fab = findViewById(R.id.fabSimpan);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNama.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty() ||
                edtEmail.getText().toString().isEmpty() ||
                edtPassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty()){

                    //menampilkan pesan dari notifikasi jika selueurh edit text wajib diisi
                    Snackbar.make(view, "Wajib diisi!", Snackbar.LENGTH_LONG).show();

                }
                else
                {
                    //membuat kondisi untuk mengecek apakah isi dari edit tezt password dan repass sama atau tidak
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString())){
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil....", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else{
                        Snackbar.make(view, "Password dan Repassword harus sama!", Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
        
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //membuat kondisi juka yang dipilih adalah id mnDaftar
        if (item.getItemId() == R.id.mnDaftar)
        {
            //method untuk memanggil cativity "ActivityRegister"
            Intent i = new Intent(getApplicationContext(), ActivityRegister.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Method untuk menampilkan menu
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


}