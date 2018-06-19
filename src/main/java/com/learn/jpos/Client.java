package com.learn.jpos;

import org.jpos.iso.ISOChannel;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.channel.ASCIIChannel;
import org.jpos.iso.packager.ISO87APackager;
import org.jpos.util.LogSource;
import org.jpos.util.Logger;
import org.jpos.util.SimpleLogListener;

/**
 * All rights Reserved, Designed By a.96bill.com
 *
 * @version V1.0
 * @Title: *.java
 * @Package com
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: wuzhicheng
 * @date: 10:55 2018/6/12
 * @company:北京今汇在线
 */
public class Client {
    public static void main(String[] args) throws Exception {

        Logger logger = new Logger();
        logger.addListener (new SimpleLogListener(System.out));
        ISOChannel channel = new ASCIIChannel(
                "localhost", 9000, new ISO87APackager()
        );
        ((LogSource)channel).setLogger (logger, "channel");
        channel.connect ();
        ISOMsg m = new ISOMsg();
        m.setMTI ("0800");
        m.set (3, "000000");
        m.set (41, "00000001");
        m.set (70, "301");
        channel.send (m);
        ISOMsg r = channel.receive ();
        channel.disconnect ();
    }
}
