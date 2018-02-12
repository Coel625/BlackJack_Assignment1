package edu.apsu.csci.blackjack_assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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
    public static final String SCORE_KEY = "score";

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

        if (view.getId() == R.id.imageButton1 || view.getId() == R.id.imageButton2 || view.getId() == R.id.imageButton3) {
            EditText et2 = (EditText) findViewById(R.id.editText2);


            EditText etStatic = (EditText) findViewById(R.id.editText);
            String etStaticString = etStatic.getText().toString();
            int etStaticInt = Integer.parseInt(etStaticString);

            if (counter == 0) {

                iv.setTag(images[r.nextInt(images.length)]);
                iv.setImageResource(images[getDrawableId(iv) % images.length]);
                if (getDrawableId(iv) == 0 || getDrawableId(iv) == 13 || getDrawableId(iv) == 26 || getDrawableId(iv) == 39) {
                    cardValue += 11;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 1 || getDrawableId(iv) == 14 || getDrawableId(iv) == 27 || getDrawableId(iv) == 40) {
                    cardValue += 2;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 2 || getDrawableId(iv) == 15 || getDrawableId(iv) == 28 || getDrawableId(iv) == 41) {
                    cardValue += 3;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 3 || getDrawableId(iv) == 16 || getDrawableId(iv) == 29 || getDrawableId(iv) == 42) {
                    cardValue += 4;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 4 || getDrawableId(iv) == 17 || getDrawableId(iv) == 30 || getDrawableId(iv) == 43) {
                    cardValue += 5;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 5 || getDrawableId(iv) == 18 || getDrawableId(iv) == 31 || getDrawableId(iv) == 44) {
                    cardValue += 6;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 6 || getDrawableId(iv) == 19 || getDrawableId(iv) == 32 || getDrawableId(iv) == 45) {
                    cardValue += 7;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 7 || getDrawableId(iv) == 20 || getDrawableId(iv) == 33 || getDrawableId(iv) == 46) {
                    cardValue += 8;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 8 || getDrawableId(iv) == 21 || getDrawableId(iv) == 34 || getDrawableId(iv) == 47) {
                    cardValue += 9;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 9 || getDrawableId(iv) == 10 || getDrawableId(iv) == 11 || getDrawableId(iv) == 12) {
                    cardValue += 10;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 22 || getDrawableId(iv) == 23 || getDrawableId(iv) == 24 || getDrawableId(iv) == 25) {
                    cardValue += 10;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 35 || getDrawableId(iv) == 36 || getDrawableId(iv) == 37 || getDrawableId(iv) == 38) {
                    cardValue += 10;
                    counter++;
                    et.setText(cardValue.toString());

                }
                else if (getDrawableId(iv) == 48 || getDrawableId(iv) == 49 || getDrawableId(iv) == 50 || getDrawableId(iv) == 51) {
                    cardValue += 10;
                    counter++;
                    et.setText(cardValue.toString());

                }
            }
            else if (counter == 1) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                if (et2Int == 0) {
                    Toast.makeText(this, "Now make a bet before continuing", Toast.LENGTH_LONG).show();
                } else {
                    iv2.setTag(images[r.nextInt(images.length)]);
                    iv2.setImageResource(images[getDrawableId(iv2) % images.length]);
                    if (getDrawableId(iv2) == 0 || getDrawableId(iv2) == 13 || getDrawableId(iv2) == 26 || getDrawableId(iv2) == 39) {
                        if ((21 - cardValue) >= 11) {
                            cardValue += 11;
                            counter++;
                            et.setText(cardValue.toString());

                        } else {
                            cardValue += 1;
                            counter++;
                            et.setText(cardValue.toString());

                        }
                    } else if (getDrawableId(iv2) == 1 || getDrawableId(iv2) == 14 || getDrawableId(iv2) == 27 || getDrawableId(iv2) == 40) {
                        cardValue += 2;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 2 || getDrawableId(iv2) == 15 || getDrawableId(iv2) == 28 || getDrawableId(iv2) == 41) {
                        cardValue += 3;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 3 || getDrawableId(iv2) == 16 || getDrawableId(iv2) == 29 || getDrawableId(iv2) == 42) {
                        cardValue += 4;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 4 || getDrawableId(iv2) == 17 || getDrawableId(iv2) == 30 || getDrawableId(iv2) == 43) {
                        cardValue += 5;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 5 || getDrawableId(iv2) == 18 || getDrawableId(iv2) == 31 || getDrawableId(iv2) == 44) {
                        cardValue += 6;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 6 || getDrawableId(iv2) == 19 || getDrawableId(iv2) == 32 || getDrawableId(iv2) == 45) {
                        cardValue += 7;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 7 || getDrawableId(iv2) == 20 || getDrawableId(iv2) == 33 || getDrawableId(iv2) == 46) {
                        cardValue += 8;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 8 || getDrawableId(iv2) == 21 || getDrawableId(iv2) == 34 || getDrawableId(iv2) == 47) {
                        cardValue += 9;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 9 || getDrawableId(iv2) == 10 || getDrawableId(iv2) == 11 || getDrawableId(iv2) == 12) {
                        cardValue += 10;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 22 || getDrawableId(iv2) == 23 || getDrawableId(iv2) == 24 || getDrawableId(iv2) == 25) {
                        cardValue += 10;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 35 || getDrawableId(iv2) == 36 || getDrawableId(iv2) == 37 || getDrawableId(iv2) == 38) {
                        cardValue += 10;
                        counter++;
                        et.setText(cardValue.toString());

                    } else if (getDrawableId(iv2) == 48 || getDrawableId(iv2) == 49 || getDrawableId(iv2) == 50 || getDrawableId(iv2) == 51) {
                        cardValue += 10;
                        counter++;
                        et.setText(cardValue.toString());

                    }
                }
            }
            else if (counter == 2) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv3.setTag(images[r.nextInt(images.length)]);
                iv3.setImageResource(images[getDrawableId(iv3) % images.length]);
                if (getDrawableId(iv3) == 0 || getDrawableId(iv3) == 13 || getDrawableId(iv3) == 26 || getDrawableId(iv3) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 1 || getDrawableId(iv3) == 14 || getDrawableId(iv3) == 27 || getDrawableId(iv3) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 2 || getDrawableId(iv3) == 15 || getDrawableId(iv3) == 28 || getDrawableId(iv3) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 3 || getDrawableId(iv3) == 16 || getDrawableId(iv3) == 29 || getDrawableId(iv3) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 4 || getDrawableId(iv3) == 17 || getDrawableId(iv3) == 30 || getDrawableId(iv3) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 5 || getDrawableId(iv3) == 18 || getDrawableId(iv3) == 31 || getDrawableId(iv3) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 6 || getDrawableId(iv3) == 19 || getDrawableId(iv3) == 32 || getDrawableId(iv3) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 7 || getDrawableId(iv3) == 20 || getDrawableId(iv3) == 33 || getDrawableId(iv3) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 8 || getDrawableId(iv3) == 21 || getDrawableId(iv3) == 34 || getDrawableId(iv3) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 9 || getDrawableId(iv3) == 10 || getDrawableId(iv3) == 11 || getDrawableId(iv3) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 22 || getDrawableId(iv3) == 23 || getDrawableId(iv3) == 24 || getDrawableId(iv3) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 35 || getDrawableId(iv3) == 36 || getDrawableId(iv3) == 37 || getDrawableId(iv3) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv3) == 48 || getDrawableId(iv3) == 49 || getDrawableId(iv3) == 50 || getDrawableId(iv3) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 3) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv4.setTag(images[r.nextInt(images.length)]);
                iv4.setImageResource(images[getDrawableId(iv4) % images.length]);
                if (getDrawableId(iv4) == 0 || getDrawableId(iv4) == 13 || getDrawableId(iv4) == 26 || getDrawableId(iv4) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 1 || getDrawableId(iv4) == 14 || getDrawableId(iv4) == 27 || getDrawableId(iv4) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 2 || getDrawableId(iv4) == 15 || getDrawableId(iv4) == 28 || getDrawableId(iv4) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 3 || getDrawableId(iv4) == 16 || getDrawableId(iv4) == 29 || getDrawableId(iv4) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 4 || getDrawableId(iv4) == 17 || getDrawableId(iv4) == 30 || getDrawableId(iv4) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 5 || getDrawableId(iv4) == 18 || getDrawableId(iv4) == 31 || getDrawableId(iv4) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 6 || getDrawableId(iv4) == 19 || getDrawableId(iv4) == 32 || getDrawableId(iv4) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 7 || getDrawableId(iv4) == 20 || getDrawableId(iv4) == 33 || getDrawableId(iv4) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 8 || getDrawableId(iv4) == 21 || getDrawableId(iv4) == 34 || getDrawableId(iv4) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 9 || getDrawableId(iv4) == 10 || getDrawableId(iv4) == 11 || getDrawableId(iv4) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 22 || getDrawableId(iv4) == 23 || getDrawableId(iv4) == 24 || getDrawableId(iv4) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 35 || getDrawableId(iv4) == 36 || getDrawableId(iv4) == 37 || getDrawableId(iv4) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv4) == 48 || getDrawableId(iv4) == 49 || getDrawableId(iv4) == 50 || getDrawableId(iv4) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 4) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv5.setTag(images[r.nextInt(images.length)]);
                iv5.setImageResource(images[getDrawableId(iv5) % images.length]);
                if (getDrawableId(iv5) == 0 || getDrawableId(iv5) == 13 || getDrawableId(iv5) == 26 || getDrawableId(iv5) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 1 || getDrawableId(iv5) == 14 || getDrawableId(iv5) == 27 || getDrawableId(iv5) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 2 || getDrawableId(iv5) == 15 || getDrawableId(iv5) == 28 || getDrawableId(iv5) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 3 || getDrawableId(iv5) == 16 || getDrawableId(iv5) == 29 || getDrawableId(iv5) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 4 || getDrawableId(iv5) == 17 || getDrawableId(iv5) == 30 || getDrawableId(iv5) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 5 || getDrawableId(iv5) == 18 || getDrawableId(iv5) == 31 || getDrawableId(iv5) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 6 || getDrawableId(iv5) == 19 || getDrawableId(iv5) == 32 || getDrawableId(iv5) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 7 || getDrawableId(iv5) == 20 || getDrawableId(iv5) == 33 || getDrawableId(iv5) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 8 || getDrawableId(iv5) == 21 || getDrawableId(iv5) == 34 || getDrawableId(iv5) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 9 || getDrawableId(iv5) == 10 || getDrawableId(iv5) == 11 || getDrawableId(iv5) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 22 || getDrawableId(iv5) == 23 || getDrawableId(iv5) == 24 || getDrawableId(iv5) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 35 || getDrawableId(iv5) == 36 || getDrawableId(iv5) == 37 || getDrawableId(iv5) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv5) == 48 || getDrawableId(iv5) == 49 || getDrawableId(iv5) == 50 || getDrawableId(iv5) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 5) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv6.setTag(images[r.nextInt(images.length)]);
                iv6.setImageResource(images[getDrawableId(iv6) % images.length]);
                if (getDrawableId(iv6) == 0 || getDrawableId(iv6) == 13 || getDrawableId(iv6) == 26 || getDrawableId(iv6) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 1 || getDrawableId(iv6) == 14 || getDrawableId(iv6) == 27 || getDrawableId(iv6) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 2 || getDrawableId(iv6) == 15 || getDrawableId(iv6) == 28 || getDrawableId(iv6) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 3 || getDrawableId(iv6) == 16 || getDrawableId(iv6) == 29 || getDrawableId(iv6) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 4 || getDrawableId(iv6) == 17 || getDrawableId(iv6) == 30 || getDrawableId(iv6) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 5 || getDrawableId(iv6) == 18 || getDrawableId(iv6) == 31 || getDrawableId(iv6) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 6 || getDrawableId(iv6) == 19 || getDrawableId(iv6) == 32 || getDrawableId(iv6) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 7 || getDrawableId(iv6) == 20 || getDrawableId(iv6) == 33 || getDrawableId(iv6) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 8 || getDrawableId(iv6) == 21 || getDrawableId(iv6) == 34 || getDrawableId(iv6) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 9 || getDrawableId(iv6) == 10 || getDrawableId(iv6) == 11 || getDrawableId(iv6) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 22 || getDrawableId(iv6) == 23 || getDrawableId(iv6) == 24 || getDrawableId(iv6) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 35 || getDrawableId(iv6) == 36 || getDrawableId(iv6) == 37 || getDrawableId(iv6) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv6) == 48 || getDrawableId(iv6) == 49 || getDrawableId(iv6) == 50 || getDrawableId(iv6) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 6) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv7.setTag(images[r.nextInt(images.length)]);
                iv7.setImageResource(images[getDrawableId(iv7) % images.length]);
                if (getDrawableId(iv7) == 0 || getDrawableId(iv7) == 13 || getDrawableId(iv7) == 26 || getDrawableId(iv7) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 1 || getDrawableId(iv7) == 14 || getDrawableId(iv7) == 27 || getDrawableId(iv7) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 2 || getDrawableId(iv7) == 15 || getDrawableId(iv7) == 28 || getDrawableId(iv7) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 3 || getDrawableId(iv7) == 16 || getDrawableId(iv7) == 29 || getDrawableId(iv7) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 4 || getDrawableId(iv7) == 17 || getDrawableId(iv7) == 30 || getDrawableId(iv7) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 5 || getDrawableId(iv7) == 18 || getDrawableId(iv7) == 31 || getDrawableId(iv7) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 6 || getDrawableId(iv7) == 19 || getDrawableId(iv7) == 32 || getDrawableId(iv7) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 7 || getDrawableId(iv7) == 20 || getDrawableId(iv7) == 33 || getDrawableId(iv7) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 8 || getDrawableId(iv7) == 21 || getDrawableId(iv7) == 34 || getDrawableId(iv7) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 9 || getDrawableId(iv7) == 10 || getDrawableId(iv7) == 11 || getDrawableId(iv7) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 22 || getDrawableId(iv7) == 23 || getDrawableId(iv7) == 24 || getDrawableId(iv7) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 35 || getDrawableId(iv7) == 36 || getDrawableId(iv7) == 37 || getDrawableId(iv7) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv7) == 48 || getDrawableId(iv7) == 49 || getDrawableId(iv7) == 50 || getDrawableId(iv7) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 7) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv8.setTag(images[r.nextInt(images.length)]);
                iv8.setImageResource(images[getDrawableId(iv8) % images.length]);
                if (getDrawableId(iv8) == 0 || getDrawableId(iv8) == 13 || getDrawableId(iv8) == 26 || getDrawableId(iv8) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 1 || getDrawableId(iv8) == 14 || getDrawableId(iv8) == 27 || getDrawableId(iv8) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 2 || getDrawableId(iv8) == 15 || getDrawableId(iv8) == 28 || getDrawableId(iv8) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 3 || getDrawableId(iv8) == 16 || getDrawableId(iv8) == 29 || getDrawableId(iv8) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 4 || getDrawableId(iv8) == 17 || getDrawableId(iv8) == 30 || getDrawableId(iv8) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 5 || getDrawableId(iv8) == 18 || getDrawableId(iv8) == 31 || getDrawableId(iv8) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 6 || getDrawableId(iv8) == 19 || getDrawableId(iv8) == 32 || getDrawableId(iv8) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 7 || getDrawableId(iv8) == 20 || getDrawableId(iv8) == 33 || getDrawableId(iv8) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 8 || getDrawableId(iv8) == 21 || getDrawableId(iv8) == 34 || getDrawableId(iv8) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 9 || getDrawableId(iv8) == 10 || getDrawableId(iv8) == 11 || getDrawableId(iv8) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 22 || getDrawableId(iv8) == 23 || getDrawableId(iv8) == 24 || getDrawableId(iv8) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 35 || getDrawableId(iv8) == 36 || getDrawableId(iv8) == 37 || getDrawableId(iv8) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv8) == 48 || getDrawableId(iv8) == 49 || getDrawableId(iv8) == 50 || getDrawableId(iv8) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 8) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv9.setTag(images[r.nextInt(images.length)]);
                iv9.setImageResource(images[getDrawableId(iv9) % images.length]);
                if (getDrawableId(iv9) == 0 || getDrawableId(iv9) == 13 || getDrawableId(iv9) == 26 || getDrawableId(iv9) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 1 || getDrawableId(iv9) == 14 || getDrawableId(iv9) == 27 || getDrawableId(iv9) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 2 || getDrawableId(iv9) == 15 || getDrawableId(iv9) == 28 || getDrawableId(iv9) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 3 || getDrawableId(iv9) == 16 || getDrawableId(iv9) == 29 || getDrawableId(iv9) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 4 || getDrawableId(iv9) == 17 || getDrawableId(iv9) == 30 || getDrawableId(iv9) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 5 || getDrawableId(iv9) == 18 || getDrawableId(iv9) == 31 || getDrawableId(iv9) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 6 || getDrawableId(iv9) == 19 || getDrawableId(iv9) == 32 || getDrawableId(iv9) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 7 || getDrawableId(iv9) == 20 || getDrawableId(iv9) == 33 || getDrawableId(iv9) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 8 || getDrawableId(iv9) == 21 || getDrawableId(iv9) == 34 || getDrawableId(iv9) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 9 || getDrawableId(iv9) == 10 || getDrawableId(iv9) == 11 || getDrawableId(iv9) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 22 || getDrawableId(iv9) == 23 || getDrawableId(iv9) == 24 || getDrawableId(iv9) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 35 || getDrawableId(iv9) == 36 || getDrawableId(iv9) == 37 || getDrawableId(iv9) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv9) == 48 || getDrawableId(iv9) == 49 || getDrawableId(iv9) == 50 || getDrawableId(iv9) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 9) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv10.setTag(images[r.nextInt(images.length)]);
                iv10.setImageResource(images[getDrawableId(iv10) % images.length]);
                if (getDrawableId(iv10) == 0 || getDrawableId(iv10) == 13 || getDrawableId(iv10) == 26 || getDrawableId(iv10) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 1 || getDrawableId(iv10) == 14 || getDrawableId(iv10) == 27 || getDrawableId(iv10) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 2 || getDrawableId(iv10) == 15 || getDrawableId(iv10) == 28 || getDrawableId(iv10) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 3 || getDrawableId(iv10) == 16 || getDrawableId(iv10) == 29 || getDrawableId(iv10) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 4 || getDrawableId(iv10) == 17 || getDrawableId(iv10) == 30 || getDrawableId(iv10) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 5 || getDrawableId(iv10) == 18 || getDrawableId(iv10) == 31 || getDrawableId(iv10) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 6 || getDrawableId(iv10) == 19 || getDrawableId(iv10) == 32 || getDrawableId(iv10) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 7 || getDrawableId(iv10) == 20 || getDrawableId(iv10) == 33 || getDrawableId(iv10) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 8 || getDrawableId(iv10) == 21 || getDrawableId(iv10) == 34 || getDrawableId(iv10) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 9 || getDrawableId(iv10) == 10 || getDrawableId(iv10) == 11 || getDrawableId(iv10) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 22 || getDrawableId(iv10) == 23 || getDrawableId(iv10) == 24 || getDrawableId(iv10) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 35 || getDrawableId(iv10) == 36 || getDrawableId(iv10) == 37 || getDrawableId(iv10) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv10) == 48 || getDrawableId(iv10) == 49 || getDrawableId(iv10) == 50 || getDrawableId(iv10) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 10) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv11.setTag(images[r.nextInt(images.length)]);
                iv11.setImageResource(images[getDrawableId(iv11) % images.length]);
                if (getDrawableId(iv11) == 0 || getDrawableId(iv11) == 13 || getDrawableId(iv11) == 26 || getDrawableId(iv11) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 1 || getDrawableId(iv11) == 14 || getDrawableId(iv11) == 27 || getDrawableId(iv11) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 2 || getDrawableId(iv11) == 15 || getDrawableId(iv11) == 28 || getDrawableId(iv11) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 3 || getDrawableId(iv11) == 16 || getDrawableId(iv11) == 29 || getDrawableId(iv11) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 4 || getDrawableId(iv11) == 17 || getDrawableId(iv11) == 30 || getDrawableId(iv11) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 5 || getDrawableId(iv11) == 18 || getDrawableId(iv11) == 31 || getDrawableId(iv11) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 6 || getDrawableId(iv11) == 19 || getDrawableId(iv11) == 32 || getDrawableId(iv11) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 7 || getDrawableId(iv11) == 20 || getDrawableId(iv11) == 33 || getDrawableId(iv11) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 8 || getDrawableId(iv11) == 21 || getDrawableId(iv11) == 34 || getDrawableId(iv11) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 9 || getDrawableId(iv11) == 10 || getDrawableId(iv11) == 11 || getDrawableId(iv11) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 22 || getDrawableId(iv11) == 23 || getDrawableId(iv11) == 24 || getDrawableId(iv11) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 35 || getDrawableId(iv11) == 36 || getDrawableId(iv11) == 37 || getDrawableId(iv11) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv11) == 48 || getDrawableId(iv11) == 49 || getDrawableId(iv11) == 50 || getDrawableId(iv11) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
            else if (counter == 11) {
                String et2String = et2.getText().toString();
                int et2Int = Integer.parseInt(et2String);

                iv12.setTag(images[r.nextInt(images.length)]);
                iv12.setImageResource(images[getDrawableId(iv12) % images.length]);
                if (getDrawableId(iv12) == 0 || getDrawableId(iv12) == 13 || getDrawableId(iv12) == 26 || getDrawableId(iv12) == 39) {
                    if ((21 - cardValue) >= 11) {
                        cardValue += 11;
                        counter++;
                    } else {
                        if ((21 - cardValue) >= 1) {
                            cardValue += 1;
                            counter++;
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                                if (intent.hasExtra(etStaticString)) {
                                    intent.putExtra(SCORE_KEY,etStaticString);
                                    startActivity(intent);
                                }
                                else {
                                    startActivity(intent);
                                }




                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());

                            cardValue = 0;
                            counter = 0;
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());

                        }
                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 1 || getDrawableId(iv12) == 14 || getDrawableId(iv12) == 27 || getDrawableId(iv12) == 40) {
                    if ((21 - cardValue) >= 2) {
                        cardValue += 2;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 2 || getDrawableId(iv12) == 15 || getDrawableId(iv12) == 28 || getDrawableId(iv12) == 41) {
                    if ((21 - cardValue) >= 3) {
                        cardValue += 3;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 3 || getDrawableId(iv12) == 16 || getDrawableId(iv12) == 29 || getDrawableId(iv12) == 42) {
                    if ((21 - cardValue) >= 4) {
                        cardValue += 4;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 4 || getDrawableId(iv12) == 17 || getDrawableId(iv12) == 30 || getDrawableId(iv12) == 43) {
                    if ((21 - cardValue) >= 5) {
                        cardValue += 5;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();

                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 5 || getDrawableId(iv12) == 18 || getDrawableId(iv12) == 31 || getDrawableId(iv12) == 44) {
                    if ((21 - cardValue) >= 6) {
                        cardValue += 6;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 6 || getDrawableId(iv12) == 19 || getDrawableId(iv12) == 32 || getDrawableId(iv12) == 45) {
                    if ((21 - cardValue) >= 7) {
                        cardValue += 7;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 7 || getDrawableId(iv12) == 20 || getDrawableId(iv12) == 33 || getDrawableId(iv12) == 46) {
                    if ((21 - cardValue) >= 8) {
                        cardValue += 8;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 8 || getDrawableId(iv12) == 21 || getDrawableId(iv12) == 34 || getDrawableId(iv12) == 47) {
                    if ((21 - cardValue) >= 9) {
                        cardValue += 9;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 9 || getDrawableId(iv12) == 10 || getDrawableId(iv12) == 11 || getDrawableId(iv12) == 12) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 22 || getDrawableId(iv12) == 23 || getDrawableId(iv12) == 24 || getDrawableId(iv12) == 25) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 35 || getDrawableId(iv12) == 36 || getDrawableId(iv12) == 37 || getDrawableId(iv12) == 38) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
                else if (getDrawableId(iv12) == 48 || getDrawableId(iv12) == 49 || getDrawableId(iv12) == 50 || getDrawableId(iv12) == 51) {
                    if ((21 - cardValue) >= 10) {
                        cardValue += 10;
                        counter++;
                    } else {
                        Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                        etStaticInt = etStaticInt - et2Int;
                        if (etStaticInt <= 0) {
                            etStaticInt = 0;
                            etStaticString = "0";
                            Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                            intent.putExtra(SCORE_KEY,etStaticString);
                            startActivity(intent);

                        }
                        cardValue = etStaticInt;
                        etStatic.setText(cardValue.toString());

                        cardValue = 0;
                        counter = 0;
                        iv.setImageResource(R.drawable.red_grid_card);
                        iv2.setImageResource(R.drawable.red_grid_card);
                        iv3.setImageResource(R.drawable.red_grid_card);
                        iv4.setImageResource(R.drawable.red_grid_card);
                        iv5.setImageResource(R.drawable.red_grid_card);
                        iv6.setImageResource(R.drawable.red_grid_card);
                        iv7.setImageResource(R.drawable.red_grid_card);
                        iv8.setImageResource(R.drawable.red_grid_card);
                        iv9.setImageResource(R.drawable.red_grid_card);
                        iv10.setImageResource(R.drawable.red_grid_card);
                        iv11.setImageResource(R.drawable.red_grid_card);
                        iv12.setImageResource(R.drawable.red_grid_card);
                        et2.setText(cardValue.toString());

                    }
                    et.setText(cardValue.toString());
                }
            }
        }
        else if (view.getId() == R.id.submit_button) {
            EditText etStatic = (EditText) findViewById(R.id.editText);
            String etStaticString = etStatic.getText().toString();
            int etStaticInt = Integer.parseInt(etStaticString);

            String etString = et.getText().toString();
            int etInt = Integer.parseInt(etString);

            EditText et2 = (EditText) findViewById(R.id.editText2);
            String et2String = et2.getText().toString();
            int et2Int = Integer.parseInt(et2String);
            if (etInt == 0) {
                Toast.makeText(this, "Please pick a card first", Toast.LENGTH_LONG).show();
            } else {
                if (et2Int == 0) {
                    Toast.makeText(this, "Make a bet before submitting", Toast.LENGTH_LONG).show();
                } else {
                    if (et2Int > etStaticInt) {
                        Toast.makeText(this, "You can't bet more than you have!", Toast.LENGTH_LONG).show();
                    } else {
                        if (getRandomBoolean()) {
                            Toast.makeText(this, "You won!", Toast.LENGTH_LONG).show();
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            etStaticInt = etStaticInt + et2Int;
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());
                            counter = 0;
                            cardValue = 0;
                            et.setText(cardValue.toString());
                            et2.setText(cardValue.toString());
                        } else {
                            Toast.makeText(this, "You lost", Toast.LENGTH_LONG).show();
                            iv.setImageResource(R.drawable.red_grid_card);
                            iv2.setImageResource(R.drawable.red_grid_card);
                            iv3.setImageResource(R.drawable.red_grid_card);
                            iv4.setImageResource(R.drawable.red_grid_card);
                            iv5.setImageResource(R.drawable.red_grid_card);
                            iv6.setImageResource(R.drawable.red_grid_card);
                            iv7.setImageResource(R.drawable.red_grid_card);
                            iv8.setImageResource(R.drawable.red_grid_card);
                            iv9.setImageResource(R.drawable.red_grid_card);
                            iv10.setImageResource(R.drawable.red_grid_card);
                            iv11.setImageResource(R.drawable.red_grid_card);
                            iv12.setImageResource(R.drawable.red_grid_card);
                            et2.setText(cardValue.toString());
                            etStaticInt = etStaticInt - et2Int;
                            if (etStaticInt <= 0) {
                                etStaticInt = 0;
                                Intent intent = new Intent(
                                        getApplicationContext(),
                                        HighscoreActivity.class);
                                startActivity(intent);
                            }
                            cardValue = etStaticInt;
                            etStatic.setText(cardValue.toString());
                            counter = 0;
                            cardValue = 0;
                            et.setText(cardValue.toString());
                            et2.setText(cardValue.toString());
                        }
                    }
                }
            }
        }
        else if (view.getId() == R.id.finish_button) {
            EditText etStatic = (EditText) findViewById(R.id.editText);
            String etStaticString = etStatic.getText().toString();
            int etStaticInt = Integer.parseInt(etStaticString);
            if (etStaticInt <= 0) {
                etStaticInt = 0;
                etStaticString = "0";
                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                intent.putExtra(SCORE_KEY,etStaticString);
                startActivity(intent);
            }
            else {
                Intent intent = new Intent(getApplicationContext(), HighscoreActivity.class);
                intent.putExtra(SCORE_KEY,etStaticString);
                startActivity(intent);
            }
        }
    }

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    private int getDrawableId(ImageView iv) {
        return ((Integer) iv.getTag() - 2130903039);
    }
}

