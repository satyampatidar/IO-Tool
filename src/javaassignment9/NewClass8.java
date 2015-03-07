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
public class NewClass8 {

    public static void main(String[] args) {
        String s = args[0];
        File f = new File(s);
                if (f.exists() && f.isDirectory()) {

            String str[] = f.list();
 for (int i = 0; i < str.length; i++) {
     
                File f1 = new File(f, str[i]);
                if (f1.isDirectory()) {
                    String str1[] = f1.list();

                    for (int j = 0; j < str1.length; j++) {
                      File f2=new File(f1,str1[j]);
                      
                      f2.delete();
                    }
                }
                f1.delete();

    }
                }
    f.delete();
    }}