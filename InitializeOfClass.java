/*

Создать класс Friend

Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Friend newFriend = new Friend();
	    
	    newFriend.initialize("Ivan");
	    String nameOfFriend = newFriend.getName();
	    System.out.println(nameOfFriend);
	    
	    newFriend.initialize("Ivan", 'm');
	    nameOfFriend = newFriend.getName();
	    char sexOfFriend = newFriend.getSex();
	    System.out.println(nameOfFriend + " " + sexOfFriend);
	    
	    newFriend.initialize("Ivan", 'm', 23);
	    nameOfFriend = newFriend.getName();
	    sexOfFriend = newFriend.getSex();
	    int ageOfFriend = newFriend.getAge();
	    System.out.println(nameOfFriend + " " + sexOfFriend + " " + ageOfFriend);
	   
	}


}

class Friend{
    String name;
    char sex;
    int age;
    
    public void initialize(String friendName){
        this.name = friendName;
    }
    
    public void initialize(String friendName, char friendSex){
        this.name = friendName;
        this.sex = friendSex;
    }
    
    public void initialize(String friendName, char friendSex, int friendAge){
        this.name = friendName;
        this.sex = friendSex;
        this.age = friendAge;
    }
    
    public String getName(){
        return name;
    }
    
    public char getSex(){
        return sex;
    }
    
    public int getAge(){
        return age;
    }
    
    
}
