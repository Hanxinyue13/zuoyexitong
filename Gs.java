package zycl;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Gs {
	    public static void main(String[] args) throws IOException {
	    	 ArrayList<Gs> gs = new ArrayList<Gs>();
	        String ygs ="C:\\Users\\86156\\Desktop\\Java实训（实验代码）\\sx5\\ygs.txt";
	        FileReader fgs = new FileReader(ygs);
	        FileInputStream lm = new FileInputStream(ygs);                 //乱码处理
	        InputStreamReader lmm = new InputStreamReader(lm, "UTF-8");  
	        BufferedReader bgs = new BufferedReader(fgs);
	        
	        System.out.println("《长恨歌》"); 
	        
	        String line =bgs.readLine();

	        while (line!=null) {
	        	int count = 0;
		        char[] ch = line.toCharArray();
		        for(int i=1; i<=ch.length; i++) {
		            System.out.print(ch[i-1]);
		            if(i%7 == 0) {
		                count++;
		                if(count%2 == 0) {
		                    System.out.println("。");
		                }else {
		                    System.out.println("，");
		                }
			            Gs g = new Gs();
			            gs.add(g);
		            }	    

	         //   System.out.println(line);
	            line = bgs.readLine();
		        
		    }
	        }
	        bgs.close();
	        fgs.close();
 
	    }
}
