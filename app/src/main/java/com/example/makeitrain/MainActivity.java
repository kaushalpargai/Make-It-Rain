package com.example.makeitrain;

import static com.example.makeitrain.R.color.orange;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.icu.text.NumberFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    //private Button makeItRain;
    //private Button showInfo;
    //git ki practice
    private TextView moneyValue;
    private int moneyCounter=0;
    //another layout button
//private Button newButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );
        //makeItRain=findViewById(R.id.buttonMakeItRain);
        moneyValue=findViewById(R.id.moneyValue);
       // moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this,
          //      R.color.orange));

       // showInfo=findViewById(R.id.buttonShowInfo);
        //makeItRain.setOnClickListener(v -> Log.d("MainActivity","onClick: Make it rain"));
   // another layout things down
    //newButton=findViewById(R.id.button);
        //newButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View v) {
           //     Log.d("New Button","onClick: Hlo!!");
          //  }
        //});
    }

    public void showMoney(View view) {
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance();

        moneyCounter+=1000;
        moneyValue.setText(String.valueOf(numberFormat.format(moneyCounter)));
        //Log.d("MIR","onClick: Make it rain "+moneyCounter);
        switch(moneyCounter){
            case 20000:
                moneyValue.setTextColor(ContextCompat.getColor(MainActivity.this,
                            R.color.orange));
                break;
            case 30000:
                moneyValue.setTextColor(Color.MAGENTA);
                break;
            case 40000:
                moneyValue.setTextColor(Color.BLUE);
                break;
            default:
                moneyValue.setTextColor(Color.BLACK);



        }
    }

    public void showInfo(View view) {
        //Toast.makeText(MainActivity.this,R.string.app_info,Toast.LENGTH_SHORT)
               //.show();
        Snackbar.make(moneyValue,R.string.app_info,Snackbar.LENGTH_LONG)
                .setAction("More", v -> {
                    Log.d("Snack","showInfo: Snackbar More");
                })
                .show();
    }
}