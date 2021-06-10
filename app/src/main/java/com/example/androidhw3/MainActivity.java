package com.example.androidhw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button button = findViewById(R.id.enter);
        TextView resultText = findViewById(R.id.resultView);
        EditText name = findViewById(R.id.name);
        CheckBox mon= findViewById(R.id.mon);
        CheckBox eng= findViewById(R.id.eng);
        CheckBox kor= findViewById(R.id.kor);
        ArrayList<String> Language;
        Language = new ArrayList<String>();

        mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mon.isChecked()) Language.add("Mongolia");
                else Language.remove("Mongolia");
            }
        });
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eng.isChecked()) Language.add("English");
                else Language.remove("English");
            }
        });
        kor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(kor.isChecked()) Language.add("Korea");
                else Language.remove("Korea");
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int selectid=radioGroup.getCheckedRadioButtonId();
                RadioButton select =(RadioButton)findViewById(selectid);
                String Name= name.getText().toString();
                StringBuilder sb= new StringBuilder();
                for (String txt: Language)
                    sb.append(txt).append(", ");
                resultText.setText("Name: "+Name+"\n"+"Gender: "+select.getText()+"\n"+"Known Languages:"+Language);
            }
        });
    }
}