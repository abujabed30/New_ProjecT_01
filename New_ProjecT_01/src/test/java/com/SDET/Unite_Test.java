package com.SDET;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Unite_Test {


    // Run | Debug
@Test

    public void testlogin1(){
        Unite myunittest = new  Unite();
        Assert.assertEquals(0,myunittest.userLogin("abu12","abu@12"));
    }




    // Run | Debug

@Test
    public void testlogin2(){
        Unite myunittest =new Unite();
        Assert.assertEquals(1,myunittest.userLogin("abu","abu@12"));
    }

}
