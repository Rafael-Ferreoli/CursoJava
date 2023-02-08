package application;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o caminho do arquivo:");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        System.out.println("getName: "+ path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());
        sc.close();

        /*
        AULA PASTAS

        System.out.println("digite o caminho da pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("pastas:");
        for (File folder : folders){
            System.out.println("folder");
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("arquivos:");
        for (File file : files){
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\novaPasta").mkdir();
        System.out.println("criado com sucesso: " + success);
        sc.close();
        */
    }
}