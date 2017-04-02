package com.example.chris.homework_2_people_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Chris on 3/21/2017.
 */

public class PersonListFragment extends Fragment {

    private RecyclerView mPersonRecyclerView;

    private PersonAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_person_list, container, false);

        mPersonRecyclerView = (RecyclerView) view.findViewById(R.id.person_recycler_view);

        mPersonRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        updateUI();

        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
        updateUI();
    }

    private void updateUI() {
        PersonList personList = PersonList.get(getActivity());
        List<Person> persons = personList.getPersons();


        if (mAdapter == null) {
            mAdapter = new PersonAdapter(persons);
            mPersonRecyclerView.setAdapter(mAdapter);

        }
        else{
            mAdapter.notifyDataSetChanged();
        }
    }

    private class PersonHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
//        private TextView mTitleTextView;
//        private TextView mDateTextView;
//        private CheckBox mSolvedCheckBox;
        private Person mPerson;


        public PersonHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            mPerson.setImageView((ImageView) itemView.findViewById(R.id.person_image));
            //Not sure if I should put this here or in Person Fragment

//            mTitleTextView = (TextView) itemView.findViewById(R.id.list_item_person_title_text_view);
//            mDateTextView = (TextView) itemView.findViewById(R.id.list_item_person_date_text_view);
//            mSolvedCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_person_solved_check_box);
            //Yo. Why can we just do this and not view.findViewByID????? Why you gotta mix it up??
        }
        public void bindPerson(Person person)
        {
            mPerson = person;
//            mTitleTextView.setText(mPerson.getTitle());
//            mDateTextView.setText(mPerson.getDate().toString());
//            mSolvedCheckBox.setChecked(mPerson.isSolved());
        }

        @Override
        public void onClick(View v) {
            Intent intent = PersonActivity.newIntent(getActivity(),mPerson.getID());
            startActivity(intent);
        }
    }


    private class PersonAdapter extends RecyclerView.Adapter<PersonHolder>
    {

        private List<Person> mPersons;

        public PersonAdapter(List<Person> persons)
        {
            mPersons = persons;
        }

        @Override
        public PersonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
            View view = layoutInflater.inflate(R.layout.list_item_person, parent, false);
            //I feel like I would have had no idea what the previous statement said to me.
            return new PersonHolder(view);
        }

        @Override
        public void onBindViewHolder(PersonHolder holder, int position) {
            Person person = mPersons.get(position);
            holder.bindPerson(person);
        }

        @Override
        public int getItemCount() {
            return mPersons.size();
        }
    }
}
