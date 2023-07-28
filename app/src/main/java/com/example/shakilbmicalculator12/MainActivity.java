package com.example.shakilbmicalculator12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editweight,editwtF,edithtI;
        Button btncal;
        TextView textres;
        LinearLayout li;
        editweight =findViewById(R.id.editweight);
        editwtF=findViewById(R.id.editwtF);
        edithtI=findViewById(R.id.edithtI);
        btncal=findViewById(R.id.btncal);
        textres=findViewById(R.id.textres);
        li=findViewById(R.id.layoutid);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int wt= Integer.parseInt(editweight.getText().toString());
               int wft= Integer.parseInt(editwtF.getText().toString());
               int in= Integer.parseInt(edithtI.getText().toString());

               int totallin=wft*12+in;
               double totallcm=totallin*2.53;
               double totalmet=totallcm/100;

               double bmi=wt/(totalmet*totalmet);

               if(bmi>25){

                   textres.setText("\t\t\t\t\t\t\t\t\t\t"+"   You are OverWeight"+"\n\n"+"Your BMI score "+bmi);
                   li.setBackgroundColor(getResources().getColor(R.color.teal_700));


               }else if(bmi<18){

                   textres.setText("\t\t\t\t\t\t\t\t"+"    You are UnderWeight"+"\n\n"+"Your BMI score "+bmi);
                   li.setBackgroundColor(getResources().getColor(R.color.purple_200));
               }else{

                   textres.setText("\t\t\t\t\t\t\t\t\t\t"+"      You are Healthy"+"\n\n"+"Your BMI score "+bmi);
                   li.setBackgroundColor(getResources().getColor(R.color.pp));
               }
            }
        });



    }
}