package androidarena.tab;

import androidarena.tab.R;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.FragmentTransaction;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
	ViewPager Tab;
    TabPagerAdapter TabAdapter;
	ActionBar actionBar;
	ActionBar.TabListener tabListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        
        TabAdapter = new TabPagerAdapter(getSupportFragmentManager());
        Tab = (ViewPager)findViewById(R.id.pager);
		Tab.setOnPageChangeListener(
				new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar = getActionBar();
						actionBar.setSelectedNavigationItem(position);
					}
				});
		Tab.setAdapter(TabAdapter);
        
        actionBar = getActionBar();
		//Enable Tabs on Action Bar
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        tabListener = new ActionBar.TabListener(){
			@Override
			public void onTabReselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "Tab selected", 2000).show();
			}

			@Override
			 public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
	            Tab.setCurrentItem(tab.getPosition());
	        }

			@Override
			public void onTabUnselected(android.app.ActionBar.Tab tab,
					FragmentTransaction ft) {
				// TODO Auto-generated method stub
			}
		};

		// remove actionbar
		actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
		actionBar.setDisplayShowHomeEnabled(false);
		actionBar.setDisplayShowTitleEnabled(false);

		ActionBar.Tab tabHome = getTab(R.drawable.home);
		tabHome.getIcon().setAlpha(125);



		// add tab
		actionBar.addTab(tabHome);
		actionBar.addTab(getTab(R.drawable.app));
		actionBar.addTab(getTab(R.drawable.search));
		actionBar.addTab(getTab(R.drawable.reminder));
		actionBar.addTab(getTab(R.drawable.human));
    }

	private ActionBar.Tab getTab(int drawable){
		return actionBar.newTab().setTabListener(tabListener).setIcon(drawable);
	}



    
}
