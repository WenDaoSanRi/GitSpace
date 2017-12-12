/*
 * @(#)ToolSpan 2017 17:34
 *
 * Copyright (c) 2017 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * @author gejiang
 * @Title ToolSpan.java
 * @date 2017/7/11 17:34
 * @Description 将标签<span class="EN"><span/>及中间的内容呢删除
 */

public class ToolSpan extends Thread {


    private String filePath;
    /**
     * @Title:
     * @Description: 构造器
     * @author gejiang
     * @date 2017/6/8 10:15
     * @return 返回类型
     */
    public ToolSpan(String filePath) {
        this.filePath = filePath;
    }
    /**
     * @Title:
     * @Description: 线程继承父类run方法
     * @author gejiang
     * @date 2017/6/8 10:15
     * @return 返回类型
     * @throws
     */
    @Override
    public void run() {
        File file = new File(filePath);
        File readFile = new File("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/TooSpan/spanEN.txt");/*要读取的文件地址*/
        String line = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(readFile));
            PrintWriter writer = new PrintWriter(file);
            int num=1;//记录行数
            while ((line = reader.readLine()) != null) {
                int index=line.indexOf("<span class=\"EN\">");//找到某字符的索引
                System.out.println(num++);
                System.out.println("索引为"+index);


                if(index!=-1){//如果有此字符,输入标签之前的和之后的内容
                    //从此索引开始查找
                    int index2=line.indexOf("</span>",index+14);
                    String str=line.substring(0,index)+line.substring(index2+7,line.length());
                    writer.println(str);
                    System.out.println(str);
                }else {//如果没有此字符，输入本行内容
                    writer.println(line);
                    System.out.println("\n");
                }
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {

        // 启动线程调用线程类的start()方法
        new ToolSpan("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/TooSpan/spanNoEn.txt").start();/*要写入的文件地址*/

    }


}