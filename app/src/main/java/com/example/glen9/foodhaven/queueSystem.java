package com.example.glen9.foodhaven;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.glen9.foodhaven.R.*;

public class queueSystem extends AppCompatActivity {

    //SwipeRefreshLayout swipeRefreshLayout;
    //TextView refreshText;
    //juice;rice;banmian;thai;indian;western;muslim;drink
    TextView juiceNumber;
    TextView riceNumber;
    TextView banmianNumber;
    TextView thaiNumber;
    TextView indianNumber;
    TextView westernNumber;
    TextView muslimNumber;
    TextView drinkNumber;

    Button refresh;
    Button backButton;
    int[] images ={R.drawable.red_man,R.drawable.green_man, drawable.orange_man};
    ImageView currentImage;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_queue_system);
        juiceNumber = findViewById(R.id.fruitNumber);
        riceNumber = findViewById(R.id.riceNumber);
        banmianNumber = findViewById(R.id.banMianNumber);
        thaiNumber = findViewById(R.id.thaiNumber);
        indianNumber = findViewById(id.indianNumber);
        muslimNumber = findViewById(id.muslimNumber);
        drinkNumber = findViewById(id.drinkNumber);

        refresh = (Button) findViewById(id.refreshButton);
        currentImage = (ImageView) findViewById(id.fruitMan);
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImage.setImageResource(images[2]);
                juiceNumber.setText("0");
            }
        });
        backButton = (Button) findViewById(id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(queueSystem.this,menu_page.class);
                startActivity(intent);
            }
        });
    }

}

/*<android.support.v4.widget.SwipeRefreshLayout

        android:id="@+id/swipeRefresh"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

<TextView
            android:id="@+id/swipe"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:foregroundGravity="center"
                    android:gravity="bottom"
                    android:text="↓ ↓ Swipe down to refresh↓ ↓ "
                    android:textSize="20sp" />
</android.support.v4.widget.SwipeRefreshLayout>*/
//swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefresh);
//refreshText = (TextView) findViewById(R.id.swipe);


        /*swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onRefresh() {
                refreshText.setText("hey u did it!");
                redman.setVisibility(View.VISIBLE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                },3000);
            }
        });*/