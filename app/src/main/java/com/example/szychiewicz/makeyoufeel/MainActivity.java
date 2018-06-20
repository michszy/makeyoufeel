package com.example.szychiewicz.makeyoufeel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

// ui int intent thru constuctor


public class MainActivity extends AppCompatActivity {



    String TAG;
    final Emoji blank = new Emoji(0, "Blank", R.drawable.ic_launcher_background,'0','0');
    final Emoji sad = new Emoji(1,"Sad", R.drawable.verysad, 'B', 'S');
    final Emoji angry = new Emoji(2,"Angry", R.drawable.angry, 'B', 'A');
    final Emoji inLove = new Emoji(3,"In Love", R.drawable.inlove, 'S','L');
    final Emoji happy = new Emoji(4,"Happy", R.drawable.happy, 'G','H');
    final Emoji afraid = new Emoji(5, "Afraid", R.drawable.afraid, 'S', 'F');
    final Emoji suspisious = new Emoji(6,"Suspisious", R.drawable.suspisious,'B','S');
    final Emoji stressed = new Emoji(7,"Stressed", R.drawable.stressed, 'B','T');
    final Emoji unsatisfied = new Emoji(8,"Unsatisfied", R.drawable.usatisfied, 'S','U');

    Map<Integer, Emoji> EmojiMap = new HashMap<>();

    public static final String EXTRA_MESSAGE = "com.example.szychiewicz.makeyoufeel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView theQuestion = findViewById(R.id.textView);
        String howDoYouFeel = "How Do You Feel ?";
        theQuestion.setText(howDoYouFeel);

        EmojiMap.put(sad.getIdentification(), sad);
        EmojiMap.put(angry.getIdentification(), angry);
        EmojiMap.put(inLove.getIdentification(), inLove);
        EmojiMap.put(happy.getIdentification(), happy);
        EmojiMap.put(afraid.getIdentification(), afraid);
        EmojiMap.put(suspisious.getIdentification(), suspisious);
        EmojiMap.put(stressed.getIdentification(), stressed);
        EmojiMap.put(unsatisfied.getIdentification(), unsatisfied);

        ImageButton blankImageButton1 = findViewById(R.id.imageButton1);
        ImageButton blankImageButton2 = findViewById(R.id.imageButton2);
        ImageButton blankImageButton3 = findViewById(R.id.imageButton3);
        ImageButton blankImageButton4 = findViewById(R.id.imageButton4);
        ImageButton blankImageButton5 = findViewById(R.id.imageButton5);
        ImageButton blankImageButton6 = findViewById(R.id.imageButton6);
        ImageButton blankImageButton7 = findViewById(R.id.imageButton7);
        ImageButton blankImageButton8 = findViewById(R.id.imageButton8);

        blankImageButton1.setImageResource(sad.getResource());
        blankImageButton2.setImageResource(angry.getResource());
        blankImageButton3.setImageResource(inLove.getResource());
        blankImageButton4.setImageResource(happy.getResource());
        blankImageButton5.setImageResource(afraid.getResource());
        blankImageButton6.setImageResource(suspisious.getResource());
        blankImageButton7.setImageResource(stressed.getResource());
        blankImageButton8.setImageResource(unsatisfied.getResource());




    }




    public void answeringTheQuestion(View view) {

        Emoji clickedEmoji = blank;

        switch (view.getId()) {
            case R.id.imageButton1:
                clickedEmoji.setEmoji(sad);
                break;
            case R.id.imageButton2:
                clickedEmoji.setEmoji(angry);
                break;
            case R.id.imageButton3:
                clickedEmoji.setEmoji(inLove);
                break;
            case R.id.imageButton4:
                clickedEmoji.setEmoji(happy);
                break;
            case R.id.imageButton5:
                clickedEmoji.setEmoji(afraid);
                break;
            case R.id.imageButton6:
                clickedEmoji.setEmoji(suspisious);
                break;
            case R.id.imageButton7:
                clickedEmoji.setEmoji(stressed);
                break;
            case R.id.imageButton8:
                clickedEmoji.setEmoji(unsatisfied);
            break;
        default:


           }

        Emoji secondClickedEmoji = new Emoji(clickedEmoji.getIdentification(),clickedEmoji.getName(),clickedEmoji.getResource(),clickedEmoji.getDirection(),
               clickedEmoji.getDirection());

        Intent intent = new Intent(this, Why.class).putExtra("secondClickedEmoji", secondClickedEmoji);


        startActivity(intent);

    }



}
