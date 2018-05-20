
// Set the same orientation for both activities

package com.example.snippet.screenorientation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // control
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference control
        button = findViewById(R.id.button);

        // button click event
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                // Create intent, use the intent to start activity.
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
