package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   RatingBar ratingBar;
   Button button;
   TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView=findViewById(R.id.textView);
        ratingBar=findViewById(R.id.ratingBar);
        button=findViewById(R.id.button);

    }

        public void submit(View view)
        {
            float ratingValue= ratingBar.getRating();
             //int numofstars= ratingBar.getNumStars();

             if (ratingValue<=1)
                 textView.setText(" Rating"+ratingValue+"\n We will tr better next time");
             else if (ratingValue<=2)
                 textView.setText(" Rating"+ratingValue+"\n We are constantly improving");
             else if (ratingValue<=3)
                 textView.setText(" Rating"+ratingValue+"\n Hope we are doing better");
             else if (ratingValue<=4)
                 textView.setText(" Rating"+ratingValue+"\n Thanks that was good");
             else if (ratingValue<=5)
                 textView.setText(" Rating"+ratingValue+"\n Thankyou very much we will make sure to provide more services");




        }



}
