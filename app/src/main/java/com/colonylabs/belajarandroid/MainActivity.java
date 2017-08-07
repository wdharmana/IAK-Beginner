package com.colonylabs.belajarandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edtUsername, edtPassword;

    String username, password;

    TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*

        Bila ingin mengganti layout, ikuti langkah berikut :

        (1). Ganti R.layout.activity_main menjadi R.layout.activity_relative
        (2). Select seluruh code dibawah setContentView dan lakukan Block Comment (Code > Comment with Block Comment)

         */


        btnLogin = (Button) findViewById(R.id.btnLogin);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);

        txtWelcome = (TextView) findViewById(R.id.txtWelcome);

        String welcome = "";

        /* Contoh penggunaan For dengan penambahan */
        for (int i = 0; i < 5; i++) {
            welcome += "Saya sedang belajar Android-" + i + "\n";
        }

        /* Contoh penggunaan For dengan pengurangan */
        for (int j = 4; j > 0; j--) {
            welcome += "Saya menggunakan Android Studio-" + j + "\n";
        }

        /* Contoh penggunaan WHILE */
        int k = 0;
        while(k<5) {
            welcome += "Saya sedang mencoba While-" + k + "\n";
            k++;
        }

        txtWelcome.setText(welcome);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = edtUsername.getText().toString();
                password = edtPassword.getText().toString();

                String data_username = "iakbali";
                String data_password = "123456";

                if (edtUsername.getText().length() < 1) {

                    edtUsername.setError("Username wajib diisi!");

                } else if (edtPassword.getText().length() < 1) {

                    edtPassword.setError("Password wajib diisi!");

                } else {


                    if (username.equals(data_username) && password.equals(data_password)) {
                        Toast.makeText(
                                MainActivity.this,
                                "OK! Anda berhasil login.",
                                Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(
                                MainActivity.this,
                                "Kombinasi username dan password salah!",
                                Toast.LENGTH_LONG).show();
                    }

                }


            }
        });

    }
}
