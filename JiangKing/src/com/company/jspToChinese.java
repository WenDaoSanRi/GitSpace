/*
 * @(#)jspToChinese 2017 16:33
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
 * @Title jspToChinese.java
 * @date 2017/8/9 16:33
 * @Description 取出jsp中所有的中文
 */

public class jspToChinese extends Thread {
    String wordChinese;
    private String filePath;
    /**
     * @Title:
     * @Description: 构造器
     * @author gejiang
     * @date 2017/6/8 10:15
     * @return 返回类型
     */
    public jspToChinese(String filePath) {
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
        File readFile = new File("C:\\ADpan\\WorkSpaceHome\\IDEAspace\\JiangKing\\FileFolder\\jspToChinese\\jsp.txt");/*要读取的文件地址*/
        String line = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(readFile));
            PrintWriter writer = new PrintWriter(file);
            int num=1;//记录行数
            while ((line = reader.readLine()) != null) {

                this.getChinese(line,writer);
            }
            reader.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        // 启动线程调用线程类的start()方法
        new jspToChinese("C:\\ADpan\\WorkSpaceHome\\IDEAspace\\JiangKing\\FileFolder\\jspToChinese\\chinese.txt").start();/*要写入的文件地址*/

    }

    public void getChinese(String line,PrintWriter writer){
        String s=line;
        int chinIndex1=0;
        int chinIndex2=0;
        int endIndex=0;
        for(int inde= 0;inde<s.length();inde++){
            for (int index = chinIndex2;index<s.length();index++) {

                String w=s.substring(index, index+1);
                if(w.compareTo("\u4e00")>0&&w.compareTo("\u9fa5")<0){
                    chinIndex1=index;
                    break;
                }
                endIndex=index+1;

            }
            for(int i=chinIndex1;i<s.length();i++){
                if(endIndex==s.length()){//如果最后一个字符不是汉字
                    break;
                }
                if(s.substring(i, i+1).compareTo("\u4e00")>0&&s.substring(i, i+1).compareTo("\u9fa5")<0){//是中文
                    System.out.println("---------------"+s.substring(i, i+1)+"--------------------");
                    wordChinese=s.substring(i, i+1);
                    if(i+1==s.length()){//如果最后一个字符是中文
                        writer.println(s.substring(chinIndex1, i+1));
                        System.out.println(s.substring(chinIndex1, i+1));
                        inde=s.length()+1;//跳出此行
                        break;
                    }

                }else {//不是中文
                    chinIndex2=i;
                    String chinese=s.substring(chinIndex1, chinIndex2);
                    if(!chinese.equals("")){
                        System.out.println(chinese);
                        writer.println(s.substring(chinIndex1, chinIndex2));
                    }
                    chinIndex1=chinIndex2;
                    inde= chinIndex2+1;
                    //chinIndex2=0;
                    break;
                }
            }

        }
    }

}