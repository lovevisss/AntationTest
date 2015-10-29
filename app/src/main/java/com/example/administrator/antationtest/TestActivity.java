package com.example.administrator.antationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_test)
public class TestActivity extends AppCompatActivity {

    String[] arr_data = {"慕课网1","慕课网1","慕课网1","慕课网1"};
    @ViewById
    ListView list_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_test);
    }

    @AfterViews
    void setList_view()
    {
        ArrayAdapter<String> arr_adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arr_data);
        list_view.setAdapter(arr_adapter);
    }
}
