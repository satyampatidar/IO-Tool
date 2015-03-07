/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment9;

import java.io.File;

/**
 *
 * @author Owner
 */
public class NewClass9 {
    public static void main(String args[]){
    String s = args[0];
        File f = new File(s);
        System.out.println("\nDirectory is there : " + f.isDirectory());
        if (f.exists() && f.isDirectory()) {

            String str[] = f.list();
            for (int i = 0; i < str.length; i++) {
                System.out.println("Content of Directory : " + str[i]);
                File f1 = new File(f, str[i]);
                f1.setReadOnly();
                if (f1.isDirectory()) {
                    String str1[] = f1.list();

                    for (int j = 0; j < str1.length; j++) {
                        System.out.println("File is : " + str1[j]);
                    }
                }
            }

        }}
    
}
