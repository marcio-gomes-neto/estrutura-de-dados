/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista05;

/**
 *
 * @author 120114567
 */
public class person {
    
    int id;
    String name;
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    
}
