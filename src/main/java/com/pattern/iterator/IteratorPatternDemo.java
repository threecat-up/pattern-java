package com.pattern.iterator;


/**
*
* @author threecat
* @date 2023/4/21
*/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iterator = nameRepository.getIterator();iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
