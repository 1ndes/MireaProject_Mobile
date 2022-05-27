package ru.mirea.syomin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button btnOk;
    private Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.textView);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCansel);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view){ tvOut.setText("Нажата кнопка ОК"); }
            };
        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка CANCEL");
            }
        };

        btnOk.setOnClickListener(oclBtnOk);
        btnCancel.setOnClickListener(oclBtnCancel);
    }
}