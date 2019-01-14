package com.example.ashwanithakur.loginemail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText t1,t2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        t1=findViewById(R.id.ed1);

        t2=findViewById(R.id.ed2);

        b1=findViewById(R.id.b1);



       b1.setOnClickListener(new View.OnClickListener() {

           String s1=t1.getText().toString();
           String s2=t2.getText().toString();


           @Override
           public void onClick(View v) {
               String s1=t1.getText().toString();
               String s2=t2.getText().toString();

               if(s1.equals("ashwani@gla.ac.in")||s2.equals("aps")) {
                   Toast.makeText(login.this,  s1 + " ," + s2, Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Toast.makeText(login.this, "", Toast.LENGTH_SHORT).show();


               }




           }
       });







    }
}
