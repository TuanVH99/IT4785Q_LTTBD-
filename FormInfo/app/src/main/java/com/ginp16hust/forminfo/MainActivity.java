package com.ginp16hust.forminfo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText vFullName, vStudentCode, vDob, vPhoneNumber, vEmail;
    CheckBox accepted;
    Button submitBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vFullName = findViewById(R.id.full_name);



        vStudentCode = findViewById(R.id.student_code);



        vDob = findViewById(R.id.dob);


        vPhoneNumber = findViewById(R.id.phone_number);



        vEmail = findViewById(R.id.email);




        accepted = findViewById(R.id.checkBox4);

        submitBtn = findViewById(R.id.button1);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullName  = vFullName.getText().toString();
                String studentCode  = vStudentCode.getText().toString();
                String dob  = vDob.getText().toString();
                String phoneNumber  = vPhoneNumber.getText().toString();
                String email  = vEmail.getText().toString();

                if(fullName == null || fullName.trim().isEmpty()){
                    vFullName.setBackgroundColor(0x20ff0000);
                } else                 if(studentCode == null || studentCode.trim().isEmpty()){
                    vStudentCode.setBackgroundColor(0x20ff0000);
                } else                if(dob == null || dob.trim().isEmpty()){
                    vDob.setBackgroundColor(0x20ff0000);
                } else                 if(phoneNumber == null || phoneNumber.trim().isEmpty()){
                    vPhoneNumber.setBackgroundColor(0x20ff0000);
                } else                if(email == null || email.trim().isEmpty()){
                    vEmail.setBackgroundColor(0x20ff0000);
                } else                if(accepted.isChecked()){
                    showToast(v,"Form submitted, wait for response!");
                } else {
                    showToast(v,"Please fill all requested fields!");
                }
            }
        });
    }
    public void showToast(View view, String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
        toast.show();
    }

}