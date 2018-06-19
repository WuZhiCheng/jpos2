package com.learn.nettypos;

import com.github.kpavlov.jreactive8583.IsoMessageListener;
import com.github.kpavlov.jreactive8583.server.Iso8583Server;
import com.solab.iso8583.IsoMessage;
import com.solab.iso8583.MessageFactory;
import io.netty.channel.ChannelHandlerContext;

/**
 * All rights Reserved, Designed By a.96bill.com
 *
 * @version V1.0
 * @Title: *.java
 * @Package com
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: wuzhicheng
 * @date: 21:15 2018/6/19/019
 * @company:北京今汇在线
 */
public class Server {
    public static void main(String[] args) throws Exception {
        MessageFactory<IsoMessage> factory = new  MessageFactory();
        Iso8583Server iso8583Server = new Iso8583Server(9000,factory);
        iso8583Server.init();
        iso8583Server.start();
        iso8583Server.addMessageListener(new IsoMessageListener() {
            @Override
            public boolean applies(IsoMessage isoMessage) {
                return false;
            }

            @Override
            public boolean onMessage(ChannelHandlerContext channelHandlerContext, IsoMessage isoMessage) {
                return false;
            }
        });
    }

}
