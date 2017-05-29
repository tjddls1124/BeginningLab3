package com.example.tjddl.beginninglab3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout)findViewById(R.id.Linear1);
        textView = (TextView)findViewById(R.id.TextView);
        button = (Button)findViewById(R.id.button);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menuBlue)
            linearLayout.setBackgroundColor(Color.BLUE);
        if(item.getItemId() == R.id.menuRed)
            linearLayout.setBackgroundColor(Color.RED);
        if(item.getItemId() ==  R.id.textBig){
            textView.setTextSize(40);
            item.setChecked(true);
        }

        if(item.getItemId()==R.id.textSmall){
            textView.setTextSize(20);
            item.setChecked(true);
        }
        float rotate = 0;
        if(item.getItemId()==R.id.menu_BtRotate){
            rotate+=30;
            button.setRotation(rotate);
        }
        float a= 2;
        if(item.getItemId()==R.id.menu_BtScale){
            button.setScaleX(a);
            button.setScaleY(a);
        }


        return super.onOptionsItemSelected(item);

    }
}
