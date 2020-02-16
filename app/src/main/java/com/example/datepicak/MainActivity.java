package com.example.datepicak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    public Button button;
    public DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.CurentdateId);
        button=findViewById(R.id.buttonId);
        datePicker=findViewById(R.id.datepicarId);

        textView.setText(changeDate());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(changeDate());
            }
        });
    }

    String changeDate()
    {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getMonth()+"/");
        stringBuilder.append(datePicker.getYear()+"/");

      return   stringBuilder.toString();


    }
}
