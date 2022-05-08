package hcmute.spkt.nhom03.foody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText edtPassword;
    ImageButton imgButtonShowPass,imgButtonHidePass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_signin);
        mapping();
    }
    public void mapping(){
        edtPassword = (EditText)findViewById(R.id.editTextPassword_login);
        imgButtonHidePass = (ImageButton) findViewById(R.id.imageButtonHidePass_login);
        imgButtonShowPass = (ImageButton) findViewById(R.id.imageButtonShowPass_login);
    }

    public void registerClick(View view){
        startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
    }

    public void homeClick(View view){
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void showPassword(View view) {
        edtPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        imgButtonShowPass.setVisibility(view.INVISIBLE);
        imgButtonHidePass.setVisibility(view.VISIBLE);
    }

    public void hidePassword(View view) {
        edtPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        imgButtonShowPass.setVisibility(view.VISIBLE);
        imgButtonHidePass.setVisibility(view.INVISIBLE);
    }
}
