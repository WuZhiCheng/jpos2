package com.learn.jpos;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISORequestListener;
import org.jpos.iso.ISOSource;

/**
 * All rights Reserved, Designed By a.96bill.com
 *
 * @version V1.0
 * @Title: *.java
 * @Package com
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: wuzhicheng
 * @date: 18:28 2018/6/19
 * @company:北京今汇在线
 */
public class Listener implements ISORequestListener{

    @Override
    public boolean process(ISOSource isoSource, ISOMsg isoMsg) {
        System.out.println("isoMsg:::"+isoMsg);
        return false;
    }
}
