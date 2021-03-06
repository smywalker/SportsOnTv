package com.smashedcontrollers.sportsontv;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.io.File;

public class Menu extends AppCompatActivity {
    //file object to store image
    private File imageFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    //All the methods for the image buttons
    public void onButtonClick(View view){
        Intent footballIntent = new Intent(this, Main2Activity.class);
        startActivity(footballIntent);
    }
    public void onBasketClick(View view){
        Intent basketIntent = new Intent(this,Basketball.class);
        startActivity(basketIntent);
        Toast basketToast = Toast.makeText(Menu.this ,"Fixtures", Toast.LENGTH_SHORT);
        basketToast.show();
    }
    public void onMusicClick(View view){
        Intent musicIntent = new Intent(this,Chants.class);
        startActivity(musicIntent);
    }
    public void onTubeClick(View view){
        Intent tubeIntent = new Intent(this,Tube.class);
        startActivity(tubeIntent);
    }
    public void onPictureClick(View view){
        Intent pictureIntent = new Intent(this,Picture.class);
        startActivity(pictureIntent);
    }
    public void onFeedbackClick(View view){
        Intent feedbackIntent = new Intent(this,Feedback.class);
        startActivity(feedbackIntent);
    }



}