package com.pattern.strategy;

/**
*
* @author threecat
* @date 2023/4/23
*/
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
