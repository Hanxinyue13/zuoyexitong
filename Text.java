package zycl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Text {
	    public static void main(String[] args) throws IOException {
	        //1：键盘输入数据，把数据封装成学生对象，存储到集合中
	        //2: 创建学生集合
	        ArrayList<Student> students = new ArrayList<Student>();
	        ArrayList<Gs> gs = new ArrayList<Gs>();
	        for (int i = 0; i < 2; i++) {
	            Scanner sc = new Scanner(System.in);
	            //键盘输入数据
	            System.out.println("请输入姓名：");
	            String name = sc.nextLine();
	            System.out.println("请输入班级：");
	            String classs = sc.nextLine();
	            System.out.println("请输入学号：");
	            int id = sc.nextInt();
	            //把数据封装成学生对象
	            Student s = new Student();
	            s.setName(name);
	            s.setClasss(classs);
	            s.setId(id);
	            //存储到集合中
	            students.add(s);
	        }
	        System.out.println("录入完毕！");
	        //3：目的地Student.txt
	        File destPath = new File("C:\\Users\\86156\\Desktop\\Java实训（实验代码）\\sx5\\xsxx.txt");
	        // 获取集合中的每一个Student对象
	        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));
	        bw.write("姓名\t");
	        bw.write("班级\t");
	        bw.write("学号\t");
	        bw.write("古诗\t");
	        bw.newLine();
	        bw.flush();

	        for (Student s : students) {
	            //6: 把Student信息存储到文本文件中
	            //数据源Student s
	            //目的地xsxx.txt
	            String name = s.getName();
	            String classs = s.getClasss();
	            int id = s.getId();

	            bw.write(name + "\t");
	            bw.write(classs + "\t");
	            bw.write(id + "\t");
	            bw.newLine();
	            bw.flush();
	        }

	        //释放资源
	        bw.close();
	        
	        
	    }
}
