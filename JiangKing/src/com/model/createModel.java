package com.model;
import com.modelFile.Tool;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
/**
 * @Title Main
 * @author gejiang
 * @date 2017/6/8 10:13
 * @Description 使用方法：
 *                1.用persistence生成的model类，数字类型全是Long类型的，要改为Bigdecimal类型的才可以，将所有Long类型的字段全都复制到longCloumn文件中
 *                2.用Database中的generate pojos.clj生成一个实体类，然后将字段的内容复制到modelFile1文件中，运行此类
 *                由于generate pojos.clj生成的字段没有区分number类型字段
 *
 *
 */
public class createModel extends Thread {
    private String filePath;
    /**
     * @Title:
     * @Description: 构造器
     * @author gejiang
     * @date 2017/6/8 10:15
     * @return 返回类型
     */
    public createModel(String filePath) {
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
        File readFile = new File("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/createModel/modelFile1");/*要读取的文件地址*/

        File file2 = new File("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/createModel/daoMapperFile");
        File readColumnFile = new File("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/createModel/longColumn");

        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(readFile));
            PrintWriter writer = new PrintWriter(file);
            PrintWriter writer2 = new PrintWriter(file2);
            int num=1;//记录行数
            while ((line = reader.readLine()) != null) {
                int index=line.indexOf(";");
                System.out.println(num++);
                System.out.println("索引为"+index);
                if(index!=-1) {
                    String str = line.substring(0, index);
                    String[] arr = str.trim().split("\\s+");//先去空格再拆分

                    if (!arr[2].equals("create_dt") || !arr[2].equals("modify_dt") || !arr[2].equals("create_by") || !arr[2].equals("modify_by")) {

                        //<result column="MIN_INV_AMT" property="minIncAmt"/>
                        String daoMapperResult="<result column=\""+arr[2].toUpperCase()+"\" property=\"";

                        writer.println("@Column(name = " + "\"" + arr[2] + "\")");
                        String[] arrColumn = arr[2].trim().split("_");
                        int _length = arrColumn.length;
                        //0个_
                        String strtype = "";
                        String strComn = "";
                        if (arrColumn.length == 1) {
                            if (arr[2].equals("String")) {
                                strtype = "private String";
                            } else if (arr[1].equals("java.sql.Date")) {
                                strtype = "private Date";
                            } else {//
                                strtype = "private String";
                            }
                            strComn=arr[2];
                        } else if (arrColumn.length > 1) {
                            //多个_
                            if (arr[1].equals("String")) {
                                strtype = "private String";
                            } else if (arr[1].equals("java.sql.Date")) {
                                strtype = "private Date";
                            } else {//
                                strtype = "private String";
                            }
                            strComn = new Tool().lineToHump1(arr[2]);
                        }
                        BufferedReader columnReader = new BufferedReader(new FileReader(readColumnFile));
                        String line2 = null;
                        int longCount=0;
                        while ((line2 = columnReader.readLine()) != null) {
                            int index2=line2.indexOf(";");
                            String str_C = line2.substring(0, index2);
                            String[] arr_C = str_C.trim().split("\\s+");//先去空格再拆分
                            if(arr_C[2].equals(strComn)){
                                longCount+=1;
                            }
                        }
                        if(longCount>0){
                            strtype="private BigDecimal";
                        }
                        writer.println(strtype + " " + strComn+";");
                        daoMapperResult=daoMapperResult+strComn+"\"/>";
                        writer2.println(daoMapperResult);
                }
                }else {
                    writer.println();
                    System.out.println("\n");
                }
            }
            reader.close();
            writer.close();
            writer2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 启动线程调用线程类的start()方法
        new createModel("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/createModel/modelFile2").start();/*要写入的文件地址*/
    }
}
