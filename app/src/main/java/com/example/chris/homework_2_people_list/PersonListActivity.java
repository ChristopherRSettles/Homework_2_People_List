package com.example.chris.homework_2_people_list;

import android.support.v4.app.Fragment;

/**
 * Created by Chris on 3/21/2017.
 */

public class PersonListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new PersonListFragment();
    }
}
