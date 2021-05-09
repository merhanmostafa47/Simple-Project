package android.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.btn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText1 = findViewById(R.id.edt_txt1);
                EditText editText2 = findViewById(R.id.edt_txt2);

                String message1 = editText1.getText().toString();
                String message2 = editText2.getText().toString();

                if (message1.isEmpty()) {
                    Toast.makeText(MainActivity.this, "you must enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(message2.isEmpty()){
                    Toast.makeText(MainActivity.this, "you must enter your passward", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://www.linkedin.com/feed/"));
                    startActivity(intent);
                }
            }
        });


    }
}