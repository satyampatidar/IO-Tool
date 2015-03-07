/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment9;

import java.io.Serializable;

/**
 *
 * @author Owner
 */
public class Friend implements Serializable{
  String name,phone;

    public Friend() {
    }

    public Friend(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Friend{" + "name=" + name + ", phone=" + phone + '}';
    }
  
}
