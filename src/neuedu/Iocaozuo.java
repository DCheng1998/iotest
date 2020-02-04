package neuedu;

import java.io.*;

public class Iocaozuo {
    public static void main(String[] args) {
        File file=new File("D:\\iopractice\\text.txt");
        //输入流
        InputStream is=null;
        {
            try {
                is = new FileInputStream(file);
                byte[] b=new byte[(int)file.length()];
                is.read(b);
                for(byte a:b){
                    System.out.println((char)a);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }


}
