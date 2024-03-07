import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static void main(String []args){
        main2();
        main3();
        main4();
        try{
            File Obj = new File("myfile.txt");
            if(Obj.createNewFile()){
                System.out.println("Congrats File created Successfully"+Obj.getName());
            } else {
                System.out.println("This file already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main2(){
        try{
            FileWriter obj = new FileWriter("myfile.txt");
            obj.write("Welcome to the world of File Handling");
            obj.close();
            System.out.println("Congrats! You successfully wrote to the file.");
        } catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    } 

    public static void main3(){
        try{
            File Obj = new File("myfile.txt");
            Scanner myReader = new Scanner(Obj);
        
            while(myReader.hasNextLine()){
                String myData = myReader.nextLine();
                System.out.println(myData);
            }   
            myReader.close();
        } catch (IOException e){
        System.out.println("An error ocurred.");
        e.printStackTrace();
        }
    }

    public static void main4(){
        File myObj = new File("myfile.txt");
        if(myObj.delete()){
            System.out.println(myObj.getName()+" Files delete successfully.");
        }
    }

}
