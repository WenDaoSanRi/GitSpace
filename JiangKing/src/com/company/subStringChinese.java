/*
 * @(#)subStringChinese 2017 10:05
 *
 * Copyright (c) 2017 - Business Intelligence Info. Tech.
 *
 * JiNan
 * All rights reserved.
 */
package com.company;

/**
 * @author gejiang
 * @Title subStringChinese.java
 * @date 2017/8/8 10:05
 * @Description 截取中文字符，用于快速格式化
 */
//     System.out.print('\u4e00');
//    System.out.print('\u9fa5');

// 把 这unicode编码 两个边界汉字（最大和最小）转换成 十进制
//   int i= Integer.parseInt("4e00",16);
//   int j= Integer.parseInt("9fa5",16);
//   获取它们之间的差值
//   System.out.println(i-j);
//
// 试验字符串的 compereTo方法 比较 这两个汉字
//   System.out.println("一".compareTo("\u9fa5"));


public class subStringChinese {

    public static void main (String[] args) {

        String s="send an e-mail  发送电子邮件 s dffd 我们dfsdf我们的sdfl的sk";
        int chinIndex1=0;
        int chinIndex2;
for(int inde= chinIndex1;inde<s.length()-1;inde++){
        for (int index = chinIndex1;index<s.length()-1;index++) {

            // 将每一个角标的字符(字母 汉字 空格等)一次转换成字符串
            String w=s.substring(index, index+1);
            //System.out.println(w);
            //  而java采用unicode编码，汉字的范围是 "\u4e00"（一）到"\u9fa5"（龥）
            if(w.compareTo("\u4e00")>0&&w.compareTo("\u9fa5")<0){
                //System.out.println("第一个中文的索引位置:"+index);
                chinIndex1=index;
                // 获取第一个汉字索引位置 跳出循环
                break;
            }
        }
        for(int i=chinIndex1;i<s.length()-1;i++){
            if(s.substring(i, i+1).compareTo("\u4e00")>0&&s.substring(i, i+1).compareTo("\u9fa5")<0){
                    //System.out.println(s.substring(i, i+1));
            }else {
                chinIndex2=i;
                System.out.println(s.substring(chinIndex1, chinIndex2));
                chinIndex1=chinIndex2;
                break;
            }
        }

}

    }
}