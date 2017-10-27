package com.example.professor.aspetpix3;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {


    ImageView pet;
    Button cat, dog, bunny;
    Drawable cat1, cat2, dog1, dog2, bunny1, bunny2;
    boolean toggle = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MyTag","set layout");

        pet = (ImageView) findViewById(R.id.view1);
        cat = (Button) findViewById (R.id.buttonCat);
        dog = (Button) findViewById (R.id.buttonDog);
        bunny = (Button) findViewById (R.id.buttonBunny);

        cat1 = ContextCompat.getDrawable(this, R.drawable.cat1);
        cat2 = ContextCompat.getDrawable(this, R.drawable.cat2);
        dog1 = ContextCompat.getDrawable(this, R.drawable.dog1);
        dog2 = ContextCompat.getDrawable(this, R.drawable.dog2);
        bunny1 = ContextCompat.getDrawable(this, R.drawable.bunny1);
        bunny2 = ContextCompat.getDrawable(this, R.drawable.bunny2);


        cat.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Log.d("MyTag", "onClick ");
                showCat(v);
                v.setVisibility(View.VISIBLE);
                Log.d("MyTag", "exit showCat");
            }
        });

        dog.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Log.d("MyTag", "onClick ");
                showDog(v);
                v.setVisibility(View.VISIBLE);
                Log.d("MyTag", "exit showDog");
            }
        });
        bunny.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Log.d("MyTag", "onClick ");
                showBunny(v);
                v.setVisibility(View.VISIBLE);
                Log.d("MyTag", "exit showBunny");
                
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }



    public void showCat(View v){

        if (toggle)
            pet.setImageDrawable(cat1);
        else
            pet.setImageDrawable(cat2);


        toggle = !toggle;


    }
    public void showDog(View v){

        if (toggle)
            pet.setImageDrawable(dog1);
        else
            pet.setImageDrawable(dog2);


        toggle = !toggle;


    }
    public void showBunny(View v){

        if (toggle)
            pet.setImageDrawable(bunny1);
        else
            pet.setImageDrawable(bunny2);


        toggle = !toggle;


    }

}