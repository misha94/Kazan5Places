package com.example.android.kazan5places;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Михаил on 31.03.2016.
 */
public class SportsActivity extends AppCompatActivity {

    boolean kazanArena = true;
    boolean taNeftArena = true;
    boolean centralStadium = true;
    boolean tennisAcademy = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_activity);

        ImageView kazanArenaImage = (ImageView)findViewById(R.id.kazan_arena_image);
        kazanArenaImage.setImageResource(R.drawable.kazan_arena);

        ImageView tatNeftImage = (ImageView)findViewById(R.id.tat_neft_image);
        tatNeftImage.setImageResource(R.drawable.tatneft);

        ImageView centralStadiumImage = (ImageView)findViewById(R.id.central_stadium_image);
        centralStadiumImage.setImageResource(R.drawable.central);

        ImageView tennis = (ImageView)findViewById(R.id.tennisView);
        tennis.setImageResource(R.drawable.tennis);
    }
    public void kazanArenaDescription (View view) {
        if (kazanArena) {

            TextView kazanArenaTextView = (TextView) findViewById(R.id.kazan_arena_text);
            kazanArenaTextView.setText(R.string.kazanArenaText);
            Button kazanArenaButton = (Button) findViewById(R.id.kazan_arena_button);
            kazanArenaButton.setText("Скрыть описание");
            kazanArena = false;
        }else {
            TextView kazanArenaTextView = (TextView) findViewById(R.id.kazan_arena_text);
            kazanArenaTextView.setText("");
            Button kazanArenaButton = (Button) findViewById(R.id.kazan_arena_button);
            kazanArenaButton.setText("открыть описание");
            kazanArena = true;
        }
    }

    public void tatNeftArenaDescription (View view) {
        if (taNeftArena) {

            TextView tatNeftArenaTextView = (TextView) findViewById(R.id.tat_neft_text);
            tatNeftArenaTextView.setText(R.string.tatNeftArenaText);
            Button tatNeftArenaButton = (Button) findViewById(R.id.tat_neft_button);
            tatNeftArenaButton.setText("Скрыть описание");
            taNeftArena = false;
        }else {
            TextView tatNeftArenaTextView = (TextView) findViewById(R.id.tat_neft_text);
            tatNeftArenaTextView.setText("");
            Button tatNeftArenaButton = (Button) findViewById(R.id.tat_neft_button);
            tatNeftArenaButton.setText("открыть описание");
            taNeftArena = true;
        }
    }

    public void centralSradiumDescription (View view) {
        if (centralStadium) {

            TextView centralStadiumTextView = (TextView) findViewById(R.id.central_stadium_text);
            centralStadiumTextView.setText(R.string.centralStadiumText);
            Button kazanArenaButton = (Button) findViewById(R.id.central_stadium_button);
            kazanArenaButton.setText("Скрыть описание");
            centralStadium = false;
        }else {
            TextView centralStadiumTextView = (TextView) findViewById(R.id.central_stadium_text);
            centralStadiumTextView.setText("");
            Button centralStadiumButton = (Button) findViewById(R.id.central_stadium_button);
            centralStadiumButton.setText("открыть описание");
            centralStadium = true;
        }
    }
    public void tennisAcademyDescription (View view) {
        if (tennisAcademy) {

            TextView tennisAcademyTextView = (TextView) findViewById(R.id.tennis_text);
            tennisAcademyTextView.setText(R.string.tennisAcademy);
            Button tennisAcademyButton = (Button) findViewById(R.id.tennis_button);
            tennisAcademyButton.setText("Скрыть описание");
            tennisAcademy = false;
        }else {
            TextView tennisAcademyTextView = (TextView) findViewById(R.id.tennis_text);
            tennisAcademyTextView.setText("");
            Button tennisAcademyButton = (Button) findViewById(R.id.tennis_button);
          tennisAcademyButton.setText("открыть описание");
            tennisAcademy = true;
        }
    }
}