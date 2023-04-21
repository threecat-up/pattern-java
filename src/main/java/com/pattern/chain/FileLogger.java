package com.pattern.chain;

/**
*
* @author threecat
* @date 2023/4/21
*/
public class FileLogger extends AbstractLogger{

    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
