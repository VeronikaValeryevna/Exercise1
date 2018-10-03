package veronika.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.app.Activity;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    private static final String text= "";
    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView finalTextMain = findViewById(R.id.textView);
        finalTextMain.setText(getIntent().getStringExtra(text));


        Button previewButton = findViewById(R.id.button);
        previewButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"nika15@yahoo.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "subject");
                email.putExtra(Intent.EXTRA_TEXT, "message");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }
        });
    }


    public static void start(Activity activity, String finalText) {
        final Intent intent = new Intent(activity, Main2Activity.class);
        intent.putExtra(text, finalText);
        activity.startActivity(intent);
    }
    }
