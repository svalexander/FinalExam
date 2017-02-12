package nyc.c4q.shannonalexander_navarro.finalexam.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import nyc.c4q.shannonalexander_navarro.finalexam.R;

public class LoginActivity extends AppCompatActivity {

    private String username;
    private String password;
    private EditText usernameET;
    private EditText passwordET;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = usernameET.getText().toString();
                password = passwordET.getText().toString();

                if (username.isEmpty()){
                    Toast.makeText(getBaseContext(), "Enter a username", Toast.LENGTH_SHORT).show();
                }
                 else if (password.isEmpty()){
                    Toast.makeText(getBaseContext(), "Enter a password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent profileIntent = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(profileIntent);
                }
            }
        });
    }

    private void initViews() {
        usernameET = (EditText) findViewById(R.id.userNameET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        submitBtn = (Button) findViewById(R.id.submitBtn);
    }

}
