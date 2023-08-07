package com.example.uploaddata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText rollno, name, coursse, time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        rollno = (EditText) findViewById(R.id.rollno);
        name = (EditText) findViewById(R.id.name);
        coursse = (EditText) findViewById(R.id.course);
        time = (EditText) findViewById(R.id.time);

        String roll = rollno.getText().toString().trim();
        String nmae = name.getText().toString().trim();
        String course = coursse.getText().toString().trim();
        String times = time.getText().toString().trim();

        dataholder obj = new dataholder(nmae, course , times);
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("student");
        node.child(roll) .setValue(obj);
        rollno.setText("");
        name.setText("");
        coursse.setText("");
        time.setText("");

        Toast.makeText(this, "data upload", Toast.LENGTH_SHORT).show();


/*
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference root = db.getReference();
        root.setValue(edit.getText().toString());
        edit.setText("");
        Toast.makeText(this, "data upload", Toast.LENGTH_SHORT).show();*/


    }
}