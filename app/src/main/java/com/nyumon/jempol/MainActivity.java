package com.nyumon.jempol;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import fragment.FiveFragment;
import fragment.FourFragment;
import fragment.OneFragment;
import fragment.ThreeFragment;
import fragment.TwoFragment;

public class MainActivity extends AppCompatActivity {

    private MenuItem mSearchAction;
    private boolean isSearchOpened = false;
    private EditText edtSeach;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.time1,
            R.drawable.people1,
            R.drawable.left1,
            R.drawable.music1,
            R.drawable.gear1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);


        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void NewPost(View view){
        Intent intent = new Intent(this, NewPostActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new OneFragment(), "ONE");
        adapter.addFrag(new TwoFragment(), "TWO");
        adapter.addFrag(new ThreeFragment(), "Three");
        adapter.addFrag(new FourFragment(), "Four");
        adapter.addFrag(new FiveFragment(), "Five");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }


        /*@Override
        public boolean onPrepareOptionsMenu(Menu menu) {
            mSearchAction = menu.findItem(R.id.action_search);
            return super.onPrepareOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int id = item.getItemId();

            switch (id) {
                case R.id.action_settings:
                    return true;
                case R.id.action_search:
                    handleMenuSearch();
                    return true;
            }

            return super.onOptionsItemSelected(item);
        }


        protected void handleMenuSearch(){
            ActionBar action = getSupportActionBar(); //get the actionbar

            if(isSearchOpened){ //test if the search is open

                action.setDisplayShowCustomEnabled(false); //disable a custom view inside the actionbar
                action.setDisplayShowTitleEnabled(true); //show the title in the action bar

                //hides the keyboard
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(edtSeach.getWindowToken(), 0);

                //add the search icon in the action bar
                mSearchAction.setIcon(getResources().getDrawable(R.drawable.tool));

                isSearchOpened = false;
            } else { //open the search entry

                action.setDisplayShowCustomEnabled(true); //enable it to display a
                // custom view in the action bar.
                action.setCustomView(R.layout.search_bar);//add the custom view
                action.setDisplayShowTitleEnabled(false); //hide the title

                edtSeach = (EditText)action.getCustomView().findViewById(R.id.edtSearch); //the text editor

                //this is a listener to do a search when the user clicks on search button
                edtSeach.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                            doSearch();
                            return true;
                        }
                        return false;
                    }
                });


                edtSeach.requestFocus();

                //open the keyboard focused in the edtSearch
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(edtSeach, InputMethodManager.SHOW_IMPLICIT);


                //add the close icon
                mSearchAction.setIcon(getResources().getDrawable(R.drawable.avatar));

                isSearchOpened = true;
            }
        }

        @Override
        public void onBackPressed() {
            if(isSearchOpened) {
                handleMenuSearch();
                return;
            }
            super.onBackPressed();
        }

        private void doSearch() {
//
        }
*/
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {

            // return null to display only the icon
            return null;
        }


    }
}


