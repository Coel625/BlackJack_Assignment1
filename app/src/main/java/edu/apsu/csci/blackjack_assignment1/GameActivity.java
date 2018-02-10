package edu.apsu.csci.blackjack_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int ids[]={R.id.hit_btn, R.id.hold_btn, R.id.schuffle_btn, R.id.deal_btn, R.id.score_button};
        for (int id : ids) {
            Button btn=(Button) findViewById(id);
            btn.setOnClickListener((View.OnClickListener) this);
        }
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.score_button) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HighscoreActivity.class);
                startActivity(intent);
            }
        }
    }

