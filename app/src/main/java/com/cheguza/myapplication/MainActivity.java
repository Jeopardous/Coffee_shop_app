package com.cheguza.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener()
                {
                    public void onItemClick(AdapterView<?> listView, View v, int position, long id)
                    {
                        if (position == 0) {
                            Intent intent = new Intent(MainActivity.this,DrinkCategoryActivity.class);
                            startActivity(intent);
                        }
                    }
                };
//Add the listener to the list view ---Page 232
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
