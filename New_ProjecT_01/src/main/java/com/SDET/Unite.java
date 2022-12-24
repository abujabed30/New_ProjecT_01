package com.SDET;

import java.util.ResourceBundle;

public class Unite {


    public int userLogin(String in_user,String in_pswd ){

        ResourceBundle rb = ResourceBundle.getBundle("config");
        String Username=rb.getString("Username");
        String Password =rb.getString("Password");

        if (in_user.equals(Username)&& in_pswd.equals(Password))
            return 1;
        else
            return 0;

    }



}
