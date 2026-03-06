import java.io.*;
public class loops {
    public static void main(String[] args){

// for loop
        for (int i =0 ; i<=10 ; i++){
            System.out.print(i + " ");
        int i = 0;

// while loop
        while (i<=10) {
            System.out.print(i+" ");
            i++;
        }

// do While loop
        int i =0;
        do{
            System.out.print(i +" ");
            i++;
        }while(i<=10);
// infite loop of for loop
        for(int i =0; i<=5; i--){
            System.out.println(i+" ");
        }

// infinite while loop
        while (true) {
            System.out.print("Basic Example of Infinite loop.");
        }
    }
}
    