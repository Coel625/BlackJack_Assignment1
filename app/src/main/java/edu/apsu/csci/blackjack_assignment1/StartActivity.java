package edu.apsu.csci.blackjack_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        int ids[]={R.id.play_button};
        for (int id : ids) {
            Button btn=(Button) findViewById(id);
            btn.setOnClickListener(this);
        }
    }
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.play_button) {
                    Intent intent=new Intent(
                            getApplicationContext(),
                            GameActivity.class);
                    startActivity(intent);
                }
            }
    }
