package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText editTextName;
Button b;
TextView t;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName =(EditText)findViewById(R.id.PName);
        b = (Button)findViewById(R.id.Hbutton);
        t = (TextView)findViewById(R.id.T);
b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

         st = editTextName.getText().toString();
 sentData(st);

    }
}
        );
    }

    private void sentData(String st){

        t.setText("Hello, "+st);
    }

}