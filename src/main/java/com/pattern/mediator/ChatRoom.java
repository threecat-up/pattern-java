package com.pattern.mediator;

import java.util.Date;

/**
*
* @author threecat
* @date 2023/4/22
*/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + "[" + user.getName() + "] : " + message);
    }
}
