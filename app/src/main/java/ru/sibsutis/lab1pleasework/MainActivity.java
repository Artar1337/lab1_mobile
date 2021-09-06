package ru.sibsutis.lab1pleasework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static int Max(int v1, int v2){
        if(v2>v1)
            return v2;
        return v1;
    }

    public static int Min(int v1, int v2){
        if(v2<v1)
            return v2;
        return v1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}