package com.example.toggelswitchbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{

    ToggleButton toggle_btn;
    Switch switch_btn;
    Button btn_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle_btn=(ToggleButton) findViewById(R.id.toggle_btn);
        switch_btn=(Switch) findViewById(R.id.switch_btn);
        btn_submit=(Button) findViewById(R.id.btn_submit);

    }
    public void getallvalues(View view)
    {
        if(toggle_btn.isChecked())
        {
            Toast.makeText(this,"wifi is on",Toast.LENGTH_LONG).show();
        }

        else
        {
            Toast.makeText(this,"wifi is off",Toast.LENGTH_LONG).show();
        }

        if(switch_btn.isChecked())
        {
            Toast.makeText(this,"wifi is onn",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(this,"Wifi is off ",Toast.LENGTH_LONG).show();
        }
    }
}