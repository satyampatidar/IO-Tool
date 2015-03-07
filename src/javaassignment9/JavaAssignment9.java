package javaassignment9;

import java.io.File;

public class JavaAssignment9 {

    public static void main(String[] args) {
        String s=args[0];
        File f=new File(s);
        long lg=f.lastModified();
        java.util.Date d=new java.util.Date(lg);
        if (f.exists()){
            System.out.println("File name is : "+f.getName()+"\nParent is : "+f.getParent()+"\nLast modified at : "+d+"\nAbsolute Path is : "+f.getAbsolutePath()+"\nName of File is : "+f.getName());
        }      
    }
}
