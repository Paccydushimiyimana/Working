package me.paccymuhoza.working;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etname,etpass;
    Button bLOGIN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.editText1);
        etpass=findViewById(R.id.editText2);
        bLOGIN=findViewById(R.id.bLOGIN);
        bLOGIN=findViewById(R.id.bLOGIN);
        bLOGIN.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLOGIN:

                if(etname.getText().toString().equals("muhoza@gmail.com") && etpass.getText().toString().equals("pass"))
                {
                    startActivity(new Intent(this, Main2Activity.class));
                    Toast.makeText(getApplicationContext(), "Login successful!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Login error...", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
