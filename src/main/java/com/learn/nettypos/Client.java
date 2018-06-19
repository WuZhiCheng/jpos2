package com.learn.nettypos;

import com.github.kpavlov.jreactive8583.client.Iso8583Client;
import com.solab.iso8583.IsoMessage;
import com.solab.iso8583.MessageFactory;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/**
 * All rights Reserved, Designed By a.96bill.com
 *
 * @version V1.0
 * @Title: *.java
 * @Package com
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: wuzhicheng
 * @date: 21:26 2018/6/19/019
 * @company:北京今汇在线
 */
public class Client {
    public static void main(String[] args) throws Exception{
        MessageFactory<IsoMessage> factory = new  MessageFactory();
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",9000);

        Iso8583Client client = new Iso8583Client(socketAddress,factory);
        client.init();
        client.connect();
        IsoMessage isoMessage =new IsoMessage();
        isoMessage.setBinaryBitmap(false);
        client.send(isoMessage);

    }
}
