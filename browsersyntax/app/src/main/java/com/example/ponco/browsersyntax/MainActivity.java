package com.example.ponco.browsersyntax;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConnectInternetTask c1;
    static TextView myText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myText = (TextView)findViewById(R.id.myResult);
    }

    public void doSomething(View view) {
        EditText a;
        String b,c;
        Spinner s;

        c1 = new ConnectInternetTask(this);
        a = (EditText)findViewById(R.id.editText);
        b = a.getText().toString();
        s = (Spinner)findViewById(R.id.spinner);
        c = s.getSelectedItem().toString();
        c1.execute(c+b);
    }
}
