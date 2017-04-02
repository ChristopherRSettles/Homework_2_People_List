package com.example.chris.homework_2_people_list;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.UUID;

public class PersonActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "edu.waubonsee.android.criminalintent.crime_id";

    public static Intent newIntent(Context packageContext, UUID crimeId)
    {
        Intent intent = new Intent(packageContext, PersonActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }


    @Override
    protected Fragment createFragment(){
        UUID personId = (UUID)getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return PersonFragment.newInstance(personId);
    }
}
