/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Owner
 */
public class NewClass3 {

    public static void main(String args[]) throws IOException {
        String name[] = new String[4];
        String phone[] = new String[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("DATA.txt"));
        Friend f=null;
        System.out.println("Enter Name and Phone Number : ");
  
        for (int i = 0; i < 4; i++) {
            name[i] = br.readLine();
            phone[i] = br.readLine();
            f = new Friend(name[i], phone[i]);
        }
        out.writeObject(f);
    }
}
