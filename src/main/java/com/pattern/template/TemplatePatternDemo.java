package com.pattern.template;

/**
*
* @author threecat
* @date 2023/4/23
*/
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
