/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author pupil
 */
public class Customer implements Serializable{
    private String fname;
    private String lname;
    private int money;
    
    public Customer(){
   
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    @Override
    public String toString() {
        return "Customer:\n" + "firstname: "  + fname + ", lastname: " + lname +  ", money: " + money;
    }
  
}
