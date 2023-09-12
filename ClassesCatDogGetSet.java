/*

1. Создать класс Cat

Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).

2. Реализовать метод fight

Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) == true , то cat2.fight(cat1) == false

3. Геттеры и сеттеры для класса Dog

Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    boolean result;
	
    	Cat barsic = new Cat();
    	barsic.name = "Barsik";
    	barsic.age = 7;
    	barsic.weight = 9;
    	barsic.strenght = 120;
    	barsic.displayInfo();
    	
    	Cat vaska = new Cat();
    	vaska.name = "Vaska";
    	vaska.age = 5;
    	vaska.weight = 6;
    	vaska.strenght = 80;
    	vaska.displayInfo();
	    
	    result = fight(barsic.strenght, vaska.strenght, barsic.name, vaska.name);
	    System.out.println(result);
	    
	    Dog goodboy = new Dog();
	    goodboy.displayInfo();
	    goodboy.setName("Good boy");
	    goodboy.setAge(8);
	    
	    String dogName = goodboy.getName();
	    int dogAge = goodboy.getAge();
	    System.out.println(dogName + " " + dogAge);
	
	}
	
	public static boolean fight(int strenght1, int strenght2, String name1, String name2){
	    boolean result;
	    
	    System.out.printf("%s beat %s?", name1, name2);
	    System.out.println();
	    
	    if (strenght1>strenght2){
	        result = true;
	    } 
	    else result = false;
	    
	    return result;
	}
	
	
}

class Cat{
    String name;
    int age, weight, strenght;
    
    public void displayInfo(){
        System.out.printf("Name: %s; Age: %d years; Weight: %d kg; Strenght: %d percent.", name, age, weight, strenght);
        System.out.println();
    }
}

class Dog{
    String name;
    int age;
    
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void displayInfo(){
        System.out.printf("Name: %s; Age: %d years.", name, age);
        System.out.println();
    }
    
}
