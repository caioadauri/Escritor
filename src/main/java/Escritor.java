import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Escritor {
    public static void main(String args[]){
        try{
            FileOutputStream arquivo = new FileOutputStream("arquivo.txt");
            PrintWriter pr = new PrintWriter(arquivo);

            pr.println("Linha 1 Coluna 1 ; Linha 1 Coluna 2 ; Linha 1 Coluna 3");
            pr.println("Linha 2 Coluna 1 ; Linha 2 Coluna 2 ; Linha 2 Coluna 3");
            pr.println("Linha 3 Coluna 1 ; Linha 3 Coluna 2 ; Linha 3 Coluna 3");

            pr.close();
            arquivo.close();
        }catch(Exception e){
            System.out.println("Erro ao escrever o arquivo");
        }
    }
}
