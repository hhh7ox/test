package com.qf.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * create by hhh7ox on 2022/5/23 13:14
 */

@Component
public class FireMan {

    @EventListener
    public void onEvent(Fire fire){
        System.out.println("监听到了fire"+fire.getAddress());
    }

}
