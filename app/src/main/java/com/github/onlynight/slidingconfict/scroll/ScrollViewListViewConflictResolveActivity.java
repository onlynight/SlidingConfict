package com.github.onlynight.slidingconfict.scroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.onlynight.slidingconfict.R;

public class ScrollViewListViewConflictResolveActivity extends AppCompatActivity {

    private ListView list1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view_list_view_conflict_resolve);

        list1 = (ListView) findViewById(R.id.list1);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1);
        adapter1.addAll("list1_1", "list1_2", "list1_3", "list1_4", "list1_5",
                "list1_6", "list1_7", "list1_8", "list1_9", "list1_10", "list1_11",
                "list1_12", "list1_13", "list1_14");
        list1.setAdapter(adapter1);
    }
}
