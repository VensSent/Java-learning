/*

1.Создать класс Friend с конструктором:
- Имя, возраст, пол

2.Создать класс Cat

Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)

Задача конструктора – сделать объект валидным. 
Например, если вес не известен, то нужно указать какой-нибудь средний вес. 
Кот не может ничего не весить. То же касательно возраста. 
А вот имени может и не быть (null). То же касается адреса: null.

*/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    Friend newFriend = new Friend("Ivan", 23, 70);
	    newFriend.displayInfo();
	}
}

class Friend{
    String name = null;
    int age , weight;
    
    public Friend(String nameFriend, int ageFriend, int weightFriend){
        this.name = nameFriend;
        this.age = ageFriend;
        this.weight = weightFriend;
    }
    
        public void displayInfo(){
        System.out.println(name + " " + age + " " + weight);
    }
}

class Cat{
    String name = null, address = null, colour = "demicolour";
    int weight = 5, age = 5;
    
    public Cat(String nameCat){
        this.name = nameCat;
    }
    
    public Cat(String nameCat, int weightCat, int ageCat){
        this.name = nameCat;
        this.weight = weightCat;
        this.age = ageCat;
    }
    
        public Cat(String nameCat, int ageCat){
        this.name = nameCat;
        this.age = ageCat;
    }
    
        public Cat(int weightCat, String colourCat){
        this.weight = weightCat;
        this.colour = colourCat;
    }
    
        public Cat(int weightCat, String colourCat,  String addressCat){
        this.weight = weightCat;
        this.colour = colourCat;
        this.address = addressCat;
    }
}
