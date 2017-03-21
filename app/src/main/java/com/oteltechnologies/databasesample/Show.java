package com.oteltechnologies.databasesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.List;

/**
 * Created by Qvertz on 1/6/2017.
 */

public class Show extends AppCompatActivity {
    RecyclerView recycler;
    LinearLayoutManager linear;
    MyAdapter adaptr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        recycler = (RecyclerView) findViewById(R.id.recycle_view);
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        showData();

    }

    private void showData() {
        DatabaseHandler db = new DatabaseHandler(getApplicationContext());
        List<UserData> labels = db.getAllLabels();
        linear = new LinearLayoutManager(this);
        recycler.setLayoutManager(linear);
        adaptr = new MyAdapter(labels, getApplicationContext());
        recycler.setAdapter(adaptr);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; goto parent activity.
                this.finish();
                return true;
            default:

                return super.onOptionsItemSelected(item);
        }
    }
}
