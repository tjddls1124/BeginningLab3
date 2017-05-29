package com.example.tjddl.beginninglab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    EditText et;
    ImageView iv;
    float r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et = (EditText)findViewById(R.id.editText);
        iv = (ImageView)findViewById(R.id.imageView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu2,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        float a= Float.parseFloat(et.getText().toString());

        if(item.getItemId() == R.id.menu_rotate){
            r+=a;
            iv.setRotation(r);
        }
        if(item.getItemId() == R.id.menu_flower){
            iv.setImageResource(R.drawable.flower);
            item.setChecked(true);
        }


        if(item.getItemId() == R.id.menu_hapari){
            iv.setImageResource(R.drawable.hapari);   item.setChecked(true);
        }

        if(item.getItemId() == R.id.menu_mountain){
            iv.setImageResource(R.drawable.mountain);   item.setChecked(true);
        }


        return super.onOptionsItemSelected(item);
    }
}
