package ru.mirea.syomin.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(getApplicationContext(),
                "Здравствуй MIREA!\nСемин Сергей Борисович",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}