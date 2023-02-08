package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //AULA 3
        String path = "C:\\Users\\rafae\\IdeaProjects\\cursoJava\\cursoLerArquivo\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        /*
        //AULA 2
        String path = "C:\\Users\\rafae\\IdeaProjects\\cursoJava\\cursoArquivo\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
*/

        /*
        //AULA 1
        File file = new File ("C:\\Users\\rafae\\IdeaProjects\\cursoJava\\cursoArquivo\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if(sc != null){
                sc.close();
            }
        }
        */

    }
}