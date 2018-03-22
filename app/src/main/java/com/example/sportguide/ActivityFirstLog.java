package com.example.sportguide;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.IntDef;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresPermission;
import android.support.annotation.StringDef;
import android.support.annotation.StyleRes;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ActivityFirstLog extends AppCompatActivity {


    private EditText nickName;
    private EditText password;
    private EditText checkpassword;
    private EditText mail;
    private EditText checkMail;
    private Button registerButton;
    private TextView passwordSatus;

    private static Context contextOfFirstLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first_login);
        contextOfFirstLog = (Context) this;
        nickName = (EditText) findViewById(R.id.nameVisibleNick);
        password = (EditText) findViewById(R.id.passwordText);
        checkpassword = (EditText) findViewById(R.id.confirmPasswordText);
        mail = (EditText) findViewById(R.id.emailLogfield);
        checkMail = (EditText) findViewById(R.id.emailConfirmfield);
        registerButton = (Button) findViewById(R.id.registeButton);
        passwordSatus = (TextView) findViewById(R.id.passwordSatus);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String exptions= evrrithingConfirmed();
             if (exptions=="") {
                    Intent intent = new Intent(contextOfFirstLog, MainActivity.class);
                    MainActivity.setRegistred(true);
                    startActivity(intent);
                } else {
                    Snackbar.make(view,exptions,Snackbar.LENGTH_LONG).show();
                    passwordSatus.setText(exptions);}
        }});
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                setSatustext();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        checkpassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (isPasswortconfirmed()) {
                    passwordSatus.setText("Password is same");
                    checkpassword.setBackgroundColor(Color.WHITE);
                } else {
                    passwordSatus.setText("Passworts are not same");
                }
            }
        });

    }

    public boolean isNickOk() {
        return nickName.length() > 4;
    }

    public boolean isMailCorrect() {
        String mailAdres = mail.getText().toString();
        for (int i = 0; i < mailAdres.length(); i++) {
            if (mailAdres.charAt(i) == ('@')) {
                mail.setBackgroundColor(Color.WHITE);
                return true;

            }
        }
        return false;
    }

    public boolean isEmailConfirmed() {
        return (mail.getText().toString().equals(checkMail.getText().toString()));
    }

    public boolean isPasswortconfirmed() {
        return (password.getText().toString().equals(checkpassword.getText().toString()));
    }

    public void setSatustext() {
        boolean okPassword = false;
        if (isPasswordStrong()) {
            String passwordString = password.getText().toString();
            for (int i = 0; i < passwordString.length(); i++) {
                try {
                    Integer.parseInt(String.valueOf(passwordString.charAt(i)));
                    okPassword = true;


                } catch (Exception e) {
                    continue;
                }

            }
            if (okPassword) {
                passwordSatus.setText("Password: is strong");
            } else {
                passwordSatus.setText("Password: need some Digit");
            }
        } else {
            passwordSatus.setText("Password: is weak");
        }
    }

    private boolean isPasswordStrong() {
        String passwordString = password.getText().toString();
        if (passwordString.length() > 5) {
            password.setBackgroundColor(Color.WHITE);
            return true;

        }
        return false;
    }

    public String evrrithingConfirmed() {
        String errorString = "\n";
        if (isNickOk()) {
            if (isMailCorrect()) {
                if (isEmailConfirmed()) {
                    if (isPasswordStrong()) {
                        if (isPasswortconfirmed()) {
                            return "";
                        } else {
                            errorString += "paswords are not in match";
                            checkpassword.setBackgroundColor(Color.RED);
                        }
                    } else {
                        errorString += "weak password";
                        password.setBackgroundColor(Color.RED);
                    }
                } else {
                    checkMail.setBackgroundColor(Color.RED);
                    errorString += "\n not Same mail";
                }
            } else {
                errorString += "\n Incorect mail";
                mail.setBackgroundColor(Color.RED);
            }
        } else {
            errorString += "Nickname have to have 5 chars";
            nickName.setBackgroundColor(Color.RED);
        }
        return errorString;
    }
}


