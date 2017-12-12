package com.company;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
/**
 * @Title Main
 * @author gejiang
 * @date 2017/6/8 10:13
 * @Description 截取一个文件中每一行“=”之前的部分读到另外一个文件中
 */
public class Main extends Thread {
    private String filePath;
    /**
    * @Title:
    * @Description: 构造器
    * @author gejiang
    * @date 2017/6/8 10:15
    * @return 返回类型
    */
    public Main(String filePath) {
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
        File readFile = new File("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/bi-order_zh_CN.txt");/*要读取的文件地址*/
        String line = null;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(readFile));
            PrintWriter writer = new PrintWriter(file);
            int num=1;//记录行数
            while ((line = reader.readLine()) != null) {
                int index=line.indexOf("=");
                System.out.println(num++);
                System.out.println("索引为"+index);
                if(index!=-1){
                    String str=line.substring(0,index+1);
                    writer.println(str);
                    System.out.println(str);
                }else {
                    writer.println();
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
        new Main("C:/ADpan/WorkSpaceHome/IDEAspace/JiangKing/FileFolder/bi.txt").start();/*要写入的文件地址*/

    }
}
