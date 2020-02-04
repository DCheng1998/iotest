package neuedu;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        File file=new File("D:\\iopractice\\a\\text.txt");
//        Student stu=new Student();
//        stu.setAge(11);
//        stu.setName("李明");
//        OutputStream out=null;
//        ObjectOutputStream oos=null;
//        try {
//            out=new FileOutputStream(file);
//            oos=new ObjectOutputStream(out);
//            oos.writeObject(stu);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                oos.close();
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        InputStream is=null;
        ObjectInputStream ois=null;
        try {
            is=new FileInputStream(file);
            ois=new ObjectInputStream(is) ;
            Student stu2=(Student)ois.readObject();
            System.out.println(stu2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


}
