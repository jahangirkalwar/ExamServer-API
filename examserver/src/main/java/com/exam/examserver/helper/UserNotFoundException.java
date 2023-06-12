package com.exam.examserver.helper;

import com.exam.examserver.model.User;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("user with username not found..");
    }

    public UserNotFoundException(String msg){
        super(msg);
    }
}
