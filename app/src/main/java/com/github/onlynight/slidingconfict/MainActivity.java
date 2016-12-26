package com.github.onlynight.slidingconfict;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.onlynight.slidingconfict.scroll.ScrollViewListViewConflictActivity;
import com.github.onlynight.slidingconfict.scroll.ScrollViewListViewConflictResolveActivity;
import com.github.onlynight.slidingconfict.viewpager.ViewPagerInViewPagerActivity;

public class MainActivity extends AppCompatActivity {

    private ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list1 = (ListView) findViewById(R.id.list1);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1);
        adapter1.addAll("ScrollView with ListView Conflict",
                "ScrollView with ListView Conflict Resolve",
                "ViewPager in ViewPager Conflict");
        list1.setAdapter(adapter1);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                jump(i);
            }
        });
    }

    private void jump(int i) {
        switch (i) {
            case 0: {
                startActivity(new Intent(MainActivity.this,
                        ScrollViewListViewConflictActivity.class));
            }
            break;
            case 1: {
                startActivity(new Intent(MainActivity.this,
                        ScrollViewListViewConflictResolveActivity.class));
            }
            break;
            case 2: {
                startActivity(new Intent(MainActivity.this,
                        ViewPagerInViewPagerActivity.class));
            }
            break;
        }
    }
}
