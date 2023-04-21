package com.pattern.chain;

/**
*
* @author threecat
* @date 2023/4/21
*/
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error console::Logger: " + message);
    }
}
