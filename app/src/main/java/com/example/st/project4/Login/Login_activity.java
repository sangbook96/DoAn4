package com.example.st.project4.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.st.project4.MainActivity;
import com.example.st.project4.R;

/**
 * Created by ST on 25-thg 1-18.
 */

public class Login_activity extends Activity {
    EditText edt_UserName, edt_Password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        anhXa();

    }

    public void anhXa() {
        findViewById(R.id.btLogin).setOnClickListener(fct);
        findViewById(R.id.btRegisn).setOnClickListener(fct);
        edt_UserName = findViewById(R.id.edt_UserName);
        edt_Password = findViewById(R.id.edt_Password);
    }

    View.OnClickListener fct = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btLogin:
                    Log.d("", "Login");
                    String username = edt_UserName.getText().toString().trim();
                    String pass = edt_Password.getText().toString().trim();
                    Toast.makeText(Login_activity.this, "Login" + username + "-" + pass, Toast.LENGTH_SHORT).show();
                    Intent in1 = new Intent(getApplication(), MainActivity.class);
                    startActivity(in1);
                    break;
                case R.id.btRegisn:
                    Intent in = new Intent(getApplication(), Regisn_activity.class);
                    startActivity(in);
                    Toast.makeText(Login_activity.this, "Đăng ký", Toast.LENGTH_SHORT).show();
                    Log.d("", "");
                    break;

            }
        }
    };
}
