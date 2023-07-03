package com.qf.test;

import com.qf.staticproxy.FD;
import com.qf.staticproxy.ZJ;
import org.junit.Test;

/**
 * create by hhh7ox on 2022/5/18 17:19
 */
public class StaticProxyTest {
    @Test
    public void testStaticProxy(){
        ZJ zj = new ZJ();
        zj.setSellable(new FD());
        zj.qht();
        zj.jq();
    }
}
