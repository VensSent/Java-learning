/*

1. Каждый метод должен возвращать свой StackTrace

Написать пять методов, 
которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.

*/
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args) {
	 
	    method1();

	}
	
    static StackTraceElement[] method1(){
        method2();
        
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }
    
    static StackTraceElement[] method2(){
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }
    
    static StackTraceElement[] method3(){
        method4();
        
        StackTraceElement[] stack = Tread.currentThread().getStackTrace();
        return stack;
    }
    static StackTraceElement[] method4(){
        method5();
        
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }
    
        static StackTraceElement[] method5(){
        method5();
        
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack;
    }
}
