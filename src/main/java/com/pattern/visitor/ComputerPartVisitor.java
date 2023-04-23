package com.pattern.visitor;

/**
*
* @author threecat
* @date 2023/4/23
*/
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
