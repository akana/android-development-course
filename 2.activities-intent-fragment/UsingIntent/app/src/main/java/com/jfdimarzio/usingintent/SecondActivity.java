package com.jfdimarzio.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String name = this.getIntent().getStringExtra("name");
        int age = this.getIntent().getIntExtra("age",10);
        String info = name + " : " + age;
        TextView studentInfo = (TextView) this.findViewById(R.id.student_info);
        studentInfo.setText(info);
    }
    public void onClick(View view) {
        Intent data = new Intent();
        //---get the EditText view---
        EditText txt_username = (EditText)findViewById(R.id.txtUsername);
        //---set the data to pass back---
        data.setData(Uri.parse( txt_username.getText().toString()));
        setResult(RESULT_OK, data);
        //---closes the activity---
        finish();
    }
}
