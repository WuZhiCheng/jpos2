package com.learn.jpos;

import org.jpos.q2.Q2;

/**
 * All rights Reserved, Designed By a.96bill.com
 *
 * @version V1.0
 * @Title: *.java
 * @Package com
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: wuzhicheng
 * @date: 18:27 2018/6/19
 * @company:北京今汇在线
 */
public class Server {
    public static void main(String[] args) {
        Q2 q = new Q2();
        q.start();
    }
}
