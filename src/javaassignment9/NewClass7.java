package javaassignment9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewClass7 {
   
public static void main(String args[]) throws IOException{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("which to be copied");
    String inputfile=br.readLine();
    System.out.println("which to be copied");
    String outputfile=br.readLine();
    BufferedReader br1=new BufferedReader(new FileReader(inputfile));
       BufferedWriter wr= new BufferedWriter(new FileWriter(outputfile));

String str;
while((str=br1.readLine())!=null){
    System.out.println(""+str);
    wr.write(str, 0 ,str.length());
//wr.write(System.getProperty("lineseparator"));

    wr.flush();
    wr.close();
   
}
br.close();
}
}