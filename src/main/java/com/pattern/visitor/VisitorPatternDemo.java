package com.pattern.visitor;

/**
*
* @author threecat
* @date 2023/4/23
*/
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
