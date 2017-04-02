package com.example.chris.homework_2_people_list;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Chris on 3/21/2017.
 */

public class PersonList {
    private static PersonList sPersonList;

    private List<Person> mPersons;

    public static PersonList get(Context context){
        if(sPersonList == null){
            sPersonList = new PersonList(context);
        }
        return sPersonList;
    }

    private PersonList(Context context){
        mPersons = new ArrayList<>();
//        for(int i = 0; i < 100; i++){
//            Person person = new Person();
//            person.setSolved((i%2 == 0));
//            person.setTitle("Person #" + i);
//            mPersons.add(person);
//        }
    }

    public List<Person> getPersons(){
        return mPersons;
    }

    public Person getPerson(UUID personId){
        for(int i = 0; i < mPersons.size(); i++){
            if (mPersons.get(i).getID().equals(personId)){
                return mPersons.get(i);
            }
        }

        return null;
    }
}
