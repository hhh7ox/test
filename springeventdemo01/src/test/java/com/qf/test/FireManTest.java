package com.qf.test;

import com.qf.event.Fire;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create by hhh7ox on 2022/5/23 13:17
 */
public class FireManTest {

    @Test
    public void testFireMan(){
        Fire fire = new Fire("ss");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.publishEvent(fire);
    }

}
