package neuedu;

import java.io.*;

public class Iocaozuo {
    public static void main(String[] args) {
        File file=new File("D:\\iopractice\\text.txt");
        //字节流输入
//        InputStream is=null;
//        {
//            try {
//                is = new FileInputStream(file);
//                byte[] b=new byte[(int)file.length()];
//                is.read(b);
//                for(byte a:b){
//                    System.out.print((char)a);
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//                try {
//                    is.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
       //字符流输入
//        Reader reader=null;
//        try {
//            reader=new FileReader(file);
//            char[] chars=new char[(int)file.length()];
//            reader.read(chars);
//            System.out.println(new String(chars));//把char数组转换为字符串
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//      字符流输出(会覆盖掉原来的内容所以在加个append true)
//        OutputStream out= null;
//        try {
//            out = new FileOutputStream(file,true);
//            out.write("abcdefg".getBytes());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
     //字符流输出
//        Writer writer=null;
//        try {
//            writer=new FileWriter(file,true);
//            writer.write("higklmn,中文");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                writer.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//  文件的复制
        File file2=new File("D:\\iopractice\\text.txt");
        File out=new File("D:\\iopractice\\a\\"+file2.getName());
        char[] chars=new char[512];
        Reader reader=null;
        Writer writer=null;
        try {
            reader=new FileReader(file2);
            writer=new FileWriter(out);
            int a=reader.read(chars);
            while (a!=-1){
                writer.write(new String(chars),0,a);
                a=reader.read(chars);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
}
