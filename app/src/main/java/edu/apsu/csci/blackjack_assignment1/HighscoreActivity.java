package edu.apsu.csci.blackjack_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HighscoreActivity extends Activity {

    public class Score {
        private String name;
        private String score;

        public Score(String name, String score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public String getScore() {
            return score;
        }

        @Override
        public String toString() {
            return name + " " + score;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        Intent intent = getIntent();
        String score = intent.getStringExtra(GameActivity.SCORE_KEY);
          Score[] SCORES = {
                new Score("YOU",score),
                new Score("TEC","1400"),
                new Score("ESN","1300"),
                new Score("EMA","1100"),
                new Score("TIS","1000"),
                new Score("ROL","900"),
                new Score("ODM","800"),
                new Score("USP","700"),
                new Score("ODM","600"),
                new Score("ODM","500")};

        TextView tv = (TextView) findViewById(R.id.tv_name_1);
        tv.setText(SCORES[0].getName());
        tv = (TextView) findViewById(R.id.tv_score_1);
        tv.setText(SCORES[0].getScore());
        tv = (TextView) findViewById(R.id.tv_name_2);
        tv.setText(SCORES[1].getName());
        tv = (TextView) findViewById(R.id.tv_score_2);
        tv.setText(SCORES[1].getScore());
        tv = (TextView) findViewById(R.id.tv_name_3);
        tv.setText(SCORES[2].getName());
        tv = (TextView) findViewById(R.id.tv_score_3);
        tv.setText(SCORES[2].getScore());
        tv = (TextView) findViewById(R.id.tv_name_4);
        tv.setText(SCORES[3].getName());
        tv = (TextView) findViewById(R.id.tv_score_4);
        tv.setText(SCORES[3].getScore());
        tv = (TextView) findViewById(R.id.tv_name_5);
        tv.setText(SCORES[4].getName());
        tv = (TextView) findViewById(R.id.tv_score_5);
        tv.setText(SCORES[4].getScore());
        tv = (TextView) findViewById(R.id.tv_name_6);
        tv.setText(SCORES[5].getName());
        tv = (TextView) findViewById(R.id.tv_score_6);
        tv.setText(SCORES[5].getScore());
        tv = (TextView) findViewById(R.id.tv_name_7);
        tv.setText(SCORES[6].getName());
        tv = (TextView) findViewById(R.id.tv_score_7);
        tv.setText(SCORES[6].getScore());
        tv = (TextView) findViewById(R.id.tv_name_8);
        tv.setText(SCORES[7].getName());
        tv = (TextView) findViewById(R.id.tv_score_8);
        tv.setText(SCORES[7].getScore());
        tv = (TextView) findViewById(R.id.tv_name_9);
        tv.setText(SCORES[8].getName());
        tv = (TextView) findViewById(R.id.tv_score_9);
        tv.setText(SCORES[8].getScore());
        tv = (TextView) findViewById(R.id.tv_name_10);
        tv.setText(SCORES[9].getName());
        tv = (TextView) findViewById(R.id.tv_score_10);
        tv.setText(SCORES[9].getScore());

        Button b = (Button) findViewById(R.id.return_button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        StartActivity.class);
                startActivity(intent);
            }
        });
    }
}
