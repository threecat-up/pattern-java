package com.pattern.visitor;

/**
*
* @author threecat
* @date 2023/4/23
*/
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
