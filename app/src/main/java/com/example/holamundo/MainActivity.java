package com.example.holamundo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView hora = findViewById(R.id.lblHora);
        TextView fecha = findViewById(R.id.lblFecha);
        cambiarhora(hora,fecha);
    }




    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void cambiarhora(TextView hora,TextView fecha){

        LocalDateTime localDate = LocalDateTime.now();

        int año = localDate.getYear();
        int mes = localDate.getMonthValue();
        int dia = localDate.getDayOfMonth();
        int hours  = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();



        hora.setText("Time \n" +hours + ":" + minutes);
        fecha.setText("Date \n" + dia + "/" + mes + "/" + año );
    }
}