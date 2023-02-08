import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[] { "bom dia","boa tarde","boa noite"};
        String path = "C:\\Users\\rafae\\IdeaProjects\\cursoJava\\cursoEscreverArquivo\\out.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}