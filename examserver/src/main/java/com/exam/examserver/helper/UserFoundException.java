package com.exam.examserver.helper;

public class UserFoundException extends Exception{
    public UserFoundException(){
        super("User with this username already there.");
    }

    public UserFoundException(String msg){
        super(msg);
    }
}
