package com.example.st.project4.Login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;

import com.example.st.project4.R;

/**
 * Created by ST on 25-thg 1-18.
 */

public class Regisn_activity extends Activity{
    EditText edtUserName_DK,edtPass_DK,edtPass_DK_config,edt_Email,edt_SDT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        anhXa();
    }
    protected void anhXa(){
        findViewById(R.id.btSign_Up).setOnClickListener(fct);
        edtUserName_DK=findViewById(R.id.edt_UserName_DK);
        edtPass_DK=findViewById(R.id.edt_Password_DK);
        edtPass_DK_config=findViewById(R.id.edt_Password_DK_config);
        edt_Email=findViewById(R.id.edt_Email);
        edt_SDT=findViewById(R.id.edt_SDT);

    }

    View.OnClickListener fct=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btSign_Up:
                    Intent in=new Intent(getApplication(),Login_activity.class);
                    startActivity(in);
                    break;

            }
        }
    };
}
