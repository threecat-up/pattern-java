package com.pattern.visitor;

/**
*
* @author threecat
* @date 2023/4/23
*/
public class Mouse implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
