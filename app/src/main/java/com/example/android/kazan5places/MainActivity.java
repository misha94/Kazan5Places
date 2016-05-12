package com.example.android.kazan5places;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Метод вызывается при нажатии на кнопку "начать", при этом проверяется ввёл ли пользователь своё имя, если поле ввода осталось пустым -
     * выскакивает уведомление
     */

    public void startButton (View view) {

        EditText textEditable = (EditText) findViewById(R.id.edit_text);
        String name = textEditable.getText().toString();

        if (name. length () == 0){

            Context context = getApplicationContext();
            CharSequence text = "Вы должны ввести своё имя";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        else if (name. length () != 0) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("editName", name);
            startActivity(intent);
        }
    }

}
