package com.mcablylx.mckiera.autolayoutdemo;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by Mckiera on 2016-05-03.
 * 继承AutoLayoutActivity
 */
public class MainActivity extends AutoLayoutActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if(getSupportActionBar()!=null)
           this.getSupportActionBar().hide();
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(new LvAdapter());
    }

    public class LvAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 50;
        }

        @Override
        public Object getItem(int position) {
            return new Object();
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = View.inflate(MainActivity.this, R.layout.do_work_list_item, null);
            return convertView;
        }
    }
}
