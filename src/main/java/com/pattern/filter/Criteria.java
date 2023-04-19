package com.pattern.filter;

import java.util.List;

/**
*
* @author threecat
* @date 2023/4/19
*/
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
