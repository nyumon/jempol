package com.nyumon.jempol;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.SearchView;

public class SearchActivity extends AppCompatActivity {

    private ActionBar actionbar;
    private Toolbar toolbar;
    private SearchView searchbox;
    private InputMethodManager imm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.arrows);

        setTitle("");

        searchbox = (SearchView) findViewById(R.id.searchbox);

        searchbox.setIconifiedByDefault(true);
        searchbox.setFocusable(true);
        searchbox.setIconified(false);
        searchbox.requestFocus();
        searchbox.requestFocusFromTouch();

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED,0);

    }

    public boolean onOptionsItemSelected(MenuItem item){
        // Handle Back Button
        switch (item.getItemId()){

            case android.R.id.home:
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
