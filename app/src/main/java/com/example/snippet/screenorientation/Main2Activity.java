
// Create the Second Activity
//
// 1. In the Project window, right-click the app folder.
// 2. Select New > Activity > Empty Activity.
// 3. In New Android Activity window, click finish.

package com.example.snippet.screenorientation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
