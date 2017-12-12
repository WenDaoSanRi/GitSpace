/*
 * @(#)GetProCodeAndEventId 2017 12:04
 *
 * Copyright (c) 2017 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.company;

/**
 * @author gejiang
 * @Title GetProCodeAndEventId.java
 * @date 2017/7/27 12:04
 * @Description 截取字符串
 */

public class GetProCodeAndEventId {

    public static void main(String[] args){
          String proCodeAndEventId="6.28.FUND402283456855838721";
        int index=proCodeAndEventId.indexOf("FUND");
        String proCode=proCodeAndEventId.substring(0,index+4);
        System.out.println(proCode);

        String eventId=proCodeAndEventId.substring(index+4,proCodeAndEventId.length());
        System.out.println(eventId);

    }
}