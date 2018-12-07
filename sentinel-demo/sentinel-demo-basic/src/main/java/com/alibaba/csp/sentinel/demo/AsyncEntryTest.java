package com.alibaba.csp.sentinel.demo;

import com.alibaba.csp.sentinel.AsyncEntry;
import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.junit.Test;

/**
 * @author zhengzechao
 * @date 2018/11/30
 * Email ooczzoo@gmail.com
 */
public class AsyncEntryTest {
    public static void main(String[] args) {
        try {
            AsyncEntry entry1 = SphU.asyncEntry("resource1");
            AsyncEntry entry2 = SphU.asyncEntry("resource2");

//            Entry entry1 = SphU.entry("resource1");
//            Entry entry2 = SphU.entry("resource2");
            entry2.exit();
            entry1.exit();

            System.out.println("as");

        } catch (BlockException e) {
            e.printStackTrace();
        }
    }



}
