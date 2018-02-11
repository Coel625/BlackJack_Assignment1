package edu.apsu.csci.blackjack_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends Activity
implements View.OnClickListener{

    int counter = 0;
    Integer cardValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Button b = (Button) findViewById(R.id.submit_button);
        b.setOnClickListener(this);

        b = (Button) findViewById(R.id.finish_button);
        b.setOnClickListener(this);

        ImageButton ib = (ImageButton) findViewById(R.id.imageButton1);
        ib.setOnClickListener(this);

        ib = (ImageButton) findViewById(R.id.imageButton2);
        ib.setOnClickListener(this);

        ib = (ImageButton) findViewById(R.id.imageButton3);
        ib.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        EditText et = (EditText) findViewById(R.id.editText3);

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
        ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
        ImageView iv4 = (ImageView) findViewById(R.id.imageView4);
        ImageView iv5 = (ImageView) findViewById(R.id.imageView5);
        ImageView iv6 = (ImageView) findViewById(R.id.imageView6);
        ImageView iv7 = (ImageView) findViewById(R.id.imageView7);
        ImageView iv8 = (ImageView) findViewById(R.id.imageView8);
        ImageView iv9 = (ImageView) findViewById(R.id.imageView9);
        ImageView iv10 = (ImageView) findViewById(R.id.imageView10);
        ImageView iv11 = (ImageView) findViewById(R.id.imageView11);
        ImageView iv12 = (ImageView) findViewById(R.id.imageView12);

        Integer[] images = {
                R.drawable.clubs_ace, R.drawable.clubs_2, R.drawable.clubs_3, R.drawable.clubs_4,
                R.drawable.clubs_5, R.drawable.clubs_6, R.drawable.clubs_7, R.drawable.clubs_8,
                R.drawable.clubs_9, R.drawable.clubs_10, R.drawable.clubs_jack, R.drawable.clubs_queen,
                R.drawable.clubs_king, R.drawable.spades_ace, R.drawable.spades_2, R.drawable.spades_3,
                R.drawable.spades_4, R.drawable.spades_5, R.drawable.spades_6, R.drawable.spades_7,
                R.drawable.spades_8, R.drawable.spades_9, R.drawable.spades_10, R.drawable.spades_jack,
                R.drawable.spades_queen, R.drawable.spades_king, R.drawable.hearts_ace, R.drawable.hearts_2,
                R.drawable.hearts_3, R.drawable.hearts_4, R.drawable.hearts_5, R.drawable.hearts_6,
                R.drawable.hearts_7, R.drawable.hearts_8, R.drawable.hearts_9, R.drawable.hearts_10,
                R.drawable.hearts_jack, R.drawable.hearts_queen, R.drawable.hearts_king, R.drawable.diamonds_ace,
                R.drawable.diamonds_2, R.drawable.diamonds_3, R.drawable.diamonds_4, R.drawable.diamonds_5,
                R.drawable.diamonds_6, R.drawable.diamonds_7, R.drawable.diamonds_8, R.drawable.diamonds_9,
                R.drawable.diamonds_10, R.drawable.diamonds_jack, R.drawable.diamonds_queen, R.drawable.diamonds_king
        };

        Random r = new Random();

        if (view.getId() == R.id.imageButton1) {
            if (counter == 0) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 1) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 2) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 3) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 4) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 5) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 6) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 7) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 8) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 9) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 10) {
                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 11) {
                iv12.setTag(images[r.nextInt(images.length)]);
                iv12.setImageResource(images[getDrawableId(iv12) % images.length]);
                if (getDrawableId(iv12) == 0 || getDrawableId(iv12) == 13 || getDrawableId(iv12) == 26 || getDrawableId(iv12) == 39) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 11;
                    } else {
                        if ((21 - cardValue) > 1) {
                            cardValue += 1;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            cardValue = 0;
                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    if ((21 - cardValue) > 2) {
                        cardValue += 2;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    if ((21 - cardValue) > 3) {
                        cardValue += 3;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    if ((21 - cardValue) > 4) {
                        cardValue += 4;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    if ((21 - cardValue) > 5) {
                        cardValue += 5;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    if ((21 - cardValue) > 6) {
                        cardValue += 6;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    if ((21 - cardValue) > 7) {
                        cardValue += 7;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    if ((21 - cardValue) > 8) {
                        cardValue += 8;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    if ((21 - cardValue) > 9) {
                        cardValue += 9;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    if ((21 - cardValue) > 10) {
                        cardValue += 10;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        cardValue = 0;
                    }
                    et.setText(cardValue.toString());
                }
            }
        }
        else if (view.getId() == R.id.imageButton2) {
            if (counter == 0) {
                iv.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 1) {
                iv2.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 2) {
                iv3.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 3) {
                iv4.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 4) {
                iv5.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 5) {
                iv6.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 6) {
                iv7.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 7) {
                iv8.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 8) {
                iv9.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 9) {
                iv10.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 10) {
                iv11.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 11) {
                iv12.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
        }
        else if (view.getId() == R.id.imageButton3) {
            if (counter == 0) {
                iv.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 1) {
                iv2.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 2) {
                iv3.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 3) {
                iv4.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 4) {
                iv5.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 5) {
                iv6.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 6) {
                iv7.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 7) {
                iv8.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 8) {
                iv9.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 9) {
                iv10.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 10) {
                iv11.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
            else if (counter == 11) {
                iv12.setImageResource(images[r.nextInt(images.length)]);
                counter++;
            }
        }
        else if (view.getId() == R.id.submit_button) {
            if (getRandomBoolean()) {
                Toast.makeText(this, "You won", Toast.LENGTH_LONG).show();
                cardValue = 0;
            }
            else {
                Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                cardValue = 0;
            }
        }
        else if (view.getId() == R.id.finish_button) {
            Intent intent = new Intent(
                    getApplicationContext(),
                    HighscoreActivity.class);
            startActivity(intent);
        }
    }

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    private int getDrawableId(ImageView iv) {
        return ((Integer) iv.getTag() - 2130903039);
    }
}

