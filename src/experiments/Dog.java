/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author etherdesign
 */
public class Dog implements Pet {
    
    private String mood;
    private String name;
    private int age;
 
    public Dog() {
        
    }
    
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void Pet() {
        System.out.println("The dog pants happily.");
        this.setMood("happy");
    }
    
    @Override
    public void Feed() {
        System.out.println(name + " eats thier Dog Chow.");
        this.setMood("full");
    }
    
}
