/*

1. Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.

2. Статические методы: int getCatCount() и setCatCount(int)
Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int), 
с помощью которых можно получить/изменить количество котов (переменную catCount)

*/

public class Main
{
	public static void main(String[] args) {
	    int count = 0;
	    
        Cat ncat1 = new Cat();
        Cat ncat2 = new Cat();
        ncat1.displayCount();
        ncat2.displayCount();
        
        count = ncat1.getCatCount();
        count = 5;
        ncat1.setCatCount(count);
	}
}

class Cat{
    static int catCount = 0;
    
    public Cat(){
        catCount++;
    }
    
    public void displayCount(){
        System.out.println(catCount);
    }
    
    public static int getCatCount(){
        return catCount;
        
    }
    
    public static void setCatCount(int count){
        catCount = count;
        System.out.println(catCount);
    }    
}
