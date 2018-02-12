package edu.apsu.csci.blackjack_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Comparator;

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
        public class Sortbyscore implements Comparator<Score> {
        // Used for sorting in ascending order of
        // roll number
        public int compare(Score a, Score b) {
            return Integer.parseInt(b.score) - Integer.parseInt(a.score);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);
        Intent intent = getIntent();
        String score = intent.getStringExtra(GameActivity.SCORE_KEY);
          Score[] SCORES = {
                new Score("YOU!",score),
                new Score("TECA","1400"),
                new Score("ESNB","1300"),
                new Score("OCTD","1200"),
                new Score("EMAC","1100"),
                new Score("TISE","1000"),
                new Score("ROLF","900"),
                new Score("ODMG","800"),
                new Score("USPH","700"),
                new Score("IMEI","600"),
                new Score("ROLJ","501")};

          Arrays.sort(SCORES, new Sortbyscore());

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
