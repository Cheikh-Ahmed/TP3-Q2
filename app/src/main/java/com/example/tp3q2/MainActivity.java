package com.example.tp3q2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtlogin;
    private EditText txtpassword;
    private Button connect;
     private Fragment fragment;
    String login_str="cheikh@gmail.com";
    String passwd_str="Cheikhahmed8$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        connect.setOnClickListener(this);
    }
    private void initViews() {
     connect=findViewById(R.id.tvconnect);
        txtlogin=findViewById(R.id.login);
        txtpassword=findViewById(R.id.password);

    }

    @Override
    public void onClick(View v) {
        String inputpassword =txtpassword.getText().toString();
        String inputemail =txtlogin.getText().toString();
        if(v.getId() == R.id.tvconnect){
            System.out.println("hello");
            Log.i("DEBUG",txtlogin.getText()+"/"+txtpassword.getText());
            if(validatePassword(inputpassword,txtpassword)&&validateEmail(inputemail,txtlogin)&&(inputemail.equals(login_str))&&(inputpassword.equals(passwd_str))){
                Log.v("Verbose","login Avece success ");
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.fragment_layout,  new WelcomeFragment())
                        .commit();
            }
        }
    }
    public static boolean validateEmail(String email,EditText edittext)
    {
        boolean isValid = false;

       // String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        String expression = "^[A-Za-z0-9_-]{2,}@\\w{3,}\\.(com|net|org)$";

        //String expression = "[A-Za-z0-9_-]+@(gmail|hotmail|yahoo)\.com$";

        CharSequence inputStr = email;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches())
        {
            isValid = true;
        }
        else{
            edittext.requestFocus();
            edittext.setError("Veuillez saisir un email valide !");        }

        return isValid;
}

    public static boolean validatePassword(String password,EditText edittext)
    {
        boolean isValid = false;

        // String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        String expression = "^(?=.{8,40}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";

       // String expression = "^/d[A-Z][a-z][$#<>/?]$";

        CharSequence inputStr = password;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if(matcher.matches())
        {
            isValid = true;
        }
        else{
            edittext.requestFocus();
            edittext.setError("Veuillez saisir un mot de passe valide !");        }

        return isValid;
    }

}