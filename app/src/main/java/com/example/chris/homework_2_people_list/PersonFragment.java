package com.example.chris.homework_2_people_list;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.UUID;

/**
 * Created by Chris on 3/4/2017.
 */

public class PersonFragment extends Fragment {

    private static final String ARG_CRIME_ID = "person_id";

    private Person mPerson;
//    private EditText mTitleField;
//    private Button mDateButton;
//    private CheckBox mSolvedCheckbox;


    public static PersonFragment newInstance(UUID personId){
        Bundle args = new Bundle();
        args.putSerializable(ARG_CRIME_ID, personId);

        PersonFragment fragment = new PersonFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        UUID personId = (UUID) getArguments().getSerializable(ARG_CRIME_ID);
        mPerson = PersonList.get(getActivity()).getPerson(personId);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_person, container, false);



/*        mTitleField = (EditText) v.findViewById(R.id.person_title);
        mTitleField.setText(mPerson.getTitle());

        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPerson.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mDateButton = (Button) v.findViewById(R.id.person_date);
        String formattedDate = (String) DateFormat.format("EEEE, MMM d, yyyy",mPerson.getDate());
        mDateButton.setText(formattedDate);
        mDateButton.setEnabled(false);

        mSolvedCheckbox = (CheckBox) v.findViewById(R.id.person_solved);
        mSolvedCheckbox.setChecked(mPerson.isSolved());
        mSolvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mPerson.setSolved(isChecked);
            }
        });*/


        return v;
    }
}
