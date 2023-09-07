/******************************************************************************

Данный класс содержит объекты типа Cat с именем и возрастом

*******************************************************************************/

public class ObjectsOfClass {
    public static void main(String[] args) {

        Cat barsikBefore = new Cat();
        barsikBefore.DisplayInfo();

        Cat barsikAfter = new Cat();
        barsikAfter.name = "Barsik posle";
        barsikAfter.age = 12431243;
        barsikAfter.DisplayInfo();

    }
}

class Cat{
    String name;
    int age;

    void DisplayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
