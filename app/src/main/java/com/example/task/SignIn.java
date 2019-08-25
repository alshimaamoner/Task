package com.example.task;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.example.task.API.ApiManager;
import com.example.task.Base.BaseActivity;
import com.example.task.Model.LoginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignIn extends BaseActivity {
    private EditText email;
    private EditText pass;
    private TextView forget;
   Button login;
    private TextView textView,register;
    String Email="",Pass="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        initView();
        login.setOnClickListener(onClickListener);
        forget.setOnClickListener(forgetListener);
        register.setOnClickListener(registerListener);



    }

    View.OnClickListener forgetListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(SignIn.this,ForgetPassActivity.class));

        }
    };
    View.OnClickListener registerListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(SignIn.this,Register.class));

        }
    };
View.OnClickListener onClickListener=new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if(email.getText().toString().equals("") && pass.getText().length()==0){
            email.setError("Enter Valid Email");
            pass.setError("Enter a Valid password");
        }
       else if(email.getText().toString().equals("")){
            email.setError("Enter Valid Email");

        }
       else if(pass.getText().length()==0){
            pass.setError("Enter a Valid password");
        }else{

            ApiManager.getAPIs().getAccess(email.getText().toString(),pass.getText().toString()).enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                    if(response.isSuccessful()) {
                        if (response.body().getStatus() == 1) {
                            showConfirmationMessage("العمليه",  response.body().getMessage(), "موافق", new MaterialDialog.SingleButtonCallback() {
                                @Override
                                public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {
                                    startActivity(new Intent(SignIn.this,MainPage.class));
                                    finish();
                                }
                            });
                        }
                    }else {
                        showMessage("العمليه",response.body().getMessage(),"موافق");
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    showMessage("ERROR",t.getLocalizedMessage(),"ok");

                }
            });

        }




    }
};
    private void initView() {
        email =  findViewById(R.id.email);
        pass =  findViewById(R.id.pass);
        forget =  findViewById(R.id.forget);
        login =  findViewById(R.id.loginbtn);
        textView=findViewById(R.id.textView);
        register=findViewById(R.id.registerlink);
    }
}
