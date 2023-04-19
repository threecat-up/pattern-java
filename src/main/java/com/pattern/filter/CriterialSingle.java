package com.pattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
*
* @author threecat
* @date 2023/4/19
*/
public class CriterialSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
