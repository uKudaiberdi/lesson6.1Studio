package com.example.lesson61studio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Vhod, Vhod1, parol, najmi;

    private EditText et_parol,et_pochta;
    private Button voiti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_parol = findViewById(R.id.et_parol);
        et_pochta = findViewById(R.id.et_pochta);
        parol = findViewById(R.id.parol);
        najmi = findViewById(R.id.najmi);
        Vhod1 = findViewById(R.id.Vhod1);
        Vhod = findViewById(R.id.Vhod);
        voiti = findViewById(R.id.voiti);
        et_pochta.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_pochta.getText().toString().isEmpty()){
                    voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }
                else voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
            }
        });
        et_parol.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (et_parol.getText().toString().isEmpty()){
                    voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }
                else voiti.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
            }
        });
      voiti.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              if (et_parol.getText().toString().equals("admin")&&et_pochta.getText().toString().equals("admin")){
                  Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались",Toast.LENGTH_LONG).show();
                  voiti.setVisibility(View.INVISIBLE);
                  et_parol.setVisibility(View.INVISIBLE);
                  Vhod.setVisibility(View.INVISIBLE);
                  parol.setVisibility(View.INVISIBLE);
                  et_pochta.setVisibility(View.INVISIBLE);
                  najmi.setVisibility(View.INVISIBLE);
                  Vhod1.setVisibility(View.INVISIBLE);


              }
              else{
                  Toast.makeText(MainActivity.this, "Неправильный логин или пароль",Toast.LENGTH_LONG).show();
              }
          }
      });
    }
}