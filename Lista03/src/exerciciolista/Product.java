/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolista;

/**
 *
 * @author 120114567
 */
public class Product {
    public int id;
    public String name;
    public String desc;
    public int quantity;
    public double value;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
           
    public String getName() {
        return this.name;
    }
       
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDesc() {
        return this.desc;
    }
       
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int getQuantity() {
        return this.quantity;
    }

    public void serQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getValue() {
        return value;
    }

    public void serValue(double value) {
        this.value = value;
    }
}
