package veronika.exercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button previewButton = findViewById(R.id.button);
        previewButton.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                final EditText editText = findViewById(R.id.editText);
                String finalText = editText.getText().toString();
                Log.i(TAG,finalText);
                Main2Activity.start(MainActivity.this, finalText);

            }
        });
    }
}
