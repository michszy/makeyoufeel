package com.example.szychiewicz.makeyoufeel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Why extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why);

        Intent intent = getIntent();

        Emoji secondClickedEmoji = (Emoji) intent.getSerializableExtra("secondClickedEmoji");

        String name = secondClickedEmoji.getName();


//        Questions sad = new Questions("Did somebody hurt you?", 1,"N");

        TextView title = findViewById(R.id.textView2);







        title.setText(name);
    }
}
