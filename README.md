# JAVA
模拟学生作业处理  
## 阅读程序
```
```  
## 实验目的  
1、使用JAVA编写简单的语句程序同时加深对软件的使用。  
2、在实验中对文件内容的写入与读取、存储等Java语句进行理解。  
3、实际操作感受写入读取与存储语句的运用。  
## 实验过程  
第一步-创建新的JAVA项目  
第二步-创建Gs、Student、Text三个类  
第三步-编写Gs、Student、Text三个类  
第四步-输入输出输入语句。  
第五步-运行程序。  
## 核心方法  
例：
```
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
```  
## 实验结果
![](https://github.com/Hanxinyue13/zuoyexitong/blob/main/Text1.PNG)
![](https://github.com/Hanxinyue13/zuoyexitong/blob/main/Text2.PNG)
![](https://github.com/Hanxinyue13/zuoyexitong/blob/main/Text%E7%BB%93%E6%9E%9C1.PNG)
![](https://github.com/Hanxinyue13/zuoyexitong/blob/main/Text%E7%BB%93%E6%9E%9C2%EF%BC%88xsxx%E6%96%87%E4%BB%B6%EF%BC%89.PNG)
![](https://github.com/Hanxinyue13/zuoyexitong/blob/main/ygstxt%E6%96%87%E4%BB%B6.PNG)
![](https://github.com/Hanxinyue13/zuoyexitong/blob/main/Gs%E7%BB%93%E6%9E%9C.PNG)

## 实验感想  
本次实验的实验点很多，覆盖了很多的知识点并且对之前的内容也做了复习。  
