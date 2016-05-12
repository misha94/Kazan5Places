package com.example.android.kazan5places;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Михаил on 12.05.2016.
 */
public class ArchitectureActivity extends AppCompatActivity {
    boolean view1 = true;
    boolean view2 = true;
    boolean view3 = true;
    boolean view4 = true;
    boolean view5 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /**
         * Заполнение текстом и картинками готового XML шаблона
         */

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports_activity);

        TextView header = (TextView) findViewById(R.id.header);
        header.setText("Архитектура");

        TextView description1 = (TextView) findViewById(R.id.description1);
        description1.setText("Башня Сююмбике");

        TextView description2 = (TextView) findViewById(R.id.description2);
        description2.setText("Спасская башня");

        TextView description3 = (TextView) findViewById(R.id.description3);
        description3.setText("Петропавловский собор");

        TextView description4 = (TextView) findViewById(R.id.description4);
        description4.setText("Благовещенский собор Казанского кремля");

        TextView description5 = (TextView) findViewById(R.id.description5);
        description5.setText("Кул-Шариф");

        ImageView ImageView1 = (ImageView) findViewById(R.id.image_view_1);
        ImageView1.setImageResource(R.drawable.tower);

        ImageView ImageView2 = (ImageView) findViewById(R.id.image_view_2);
        ImageView2.setImageResource(R.drawable.spass_tower);

        ImageView ImageView3 = (ImageView) findViewById(R.id.image_view_3);
        ImageView3.setImageResource(R.drawable.sobor);

        ImageView ImageView4 = (ImageView) findViewById(R.id.image_view_4);
        ImageView4.setImageResource(R.drawable.church_in_kremlin);

        ImageView ImageView5 = (ImageView) findViewById(R.id.image_view_5);
        ImageView5.setImageResource(R.drawable.kulsharif);
    }

    /**
     * Методы вызываются, когда происходит нажатие на кнопки и показывается информация, при повторном нажатия информация исчезает
     */

    public void button1(View view) {
        if (view1) {

            TextView kazanArenaTextView = (TextView) findViewById(R.id.text_view_1);
            kazanArenaTextView.setText(R.string.tower);
            Button kazanArenaButton = (Button) findViewById(R.id.button_view_1);
            kazanArenaButton.setText(R.string.close);
            view1 = false;
        } else {
            TextView kazanArenaTextView = (TextView) findViewById(R.id.text_view_1);
            kazanArenaTextView.setText("");
            Button kazanArenaButton = (Button) findViewById(R.id.button_view_1);
            kazanArenaButton.setText(R.string.open);
            view1 = true;
        }
    }

    public void button2(View view) {
        if (view2) {

            TextView tatNeftArenaTextView = (TextView) findViewById(R.id.text_view_2);
            tatNeftArenaTextView.setText(R.string.spassTower);
            Button tatNeftArenaButton = (Button) findViewById(R.id.button_view_2);
            tatNeftArenaButton.setText(R.string.close);
            view2 = false;
        } else {
            TextView tatNeftArenaTextView = (TextView) findViewById(R.id.text_view_2);
            tatNeftArenaTextView.setText("");
            Button tatNeftArenaButton = (Button) findViewById(R.id.button_view_2);
            tatNeftArenaButton.setText(R.string.open);
            view2 = true;
        }
    }

    public void button3(View view) {
        if (view3) {

            TextView centralStadiumTextView = (TextView) findViewById(R.id.text_view_3);
            centralStadiumTextView.setText(R.string.sobor);
            Button kazanArenaButton = (Button) findViewById(R.id.button_view_3);
            kazanArenaButton.setText(R.string.close);
            view3 = false;
        } else {
            TextView centralStadiumTextView = (TextView) findViewById(R.id.text_view_3);
            centralStadiumTextView.setText("");
            Button centralStadiumButton = (Button) findViewById(R.id.button_view_3);
            centralStadiumButton.setText(R.string.open);
            view3 = true;
        }
    }

    public void button4(View view) {
        if (view4) {

            TextView tennisAcademyTextView = (TextView) findViewById(R.id.text_view_4);
            tennisAcademyTextView.setText(R.string.churchInKremlin);
            Button tennisAcademyButton = (Button) findViewById(R.id.button_view_4);
            tennisAcademyButton.setText(R.string.close);
            view4 = false;
        } else {
            TextView tennisAcademyTextView = (TextView) findViewById(R.id.text_view_4);
            tennisAcademyTextView.setText("");
            Button tennisAcademyButton = (Button) findViewById(R.id.button_view_4);
            tennisAcademyButton.setText(R.string.open);
            view4 = true;
        }
    }

    public void button5(View view) {
        if (view5) {

            TextView tennisAcademyTextView = (TextView) findViewById(R.id.text_view_5);
            tennisAcademyTextView.setText(R.string.kulSharif);
            Button tennisAcademyButton = (Button) findViewById(R.id.button_view_5);
            tennisAcademyButton.setText(R.string.close);
            view5 = false;
        } else {
            TextView tennisAcademyTextView = (TextView) findViewById(R.id.text_view_5);
            tennisAcademyTextView.setText("");
            Button tennisAcademyButton = (Button) findViewById(R.id.button_view_5);
            tennisAcademyButton.setText(R.string.open);
            view5 = true;
        }
    }
}
