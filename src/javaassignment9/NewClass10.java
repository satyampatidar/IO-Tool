
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Owner
 */
public class NewClass10 {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        String s = args[0];
        int ctr=0;
        //InputStream io=new
        File f = new File(s);
        if (f.exists()) {
            BufferedReader br1 = new BufferedReader(new FileReader(f));

            int i=0;
            while ((i = br1.read()) != -1) {
                char c=(char)i;
               if((c>='a' && c<='z')||(c>='A' && c<='Z')){
                  ctr++; 
                }




            }
            System.out.println(""+ctr);
        }
        
    }
}
