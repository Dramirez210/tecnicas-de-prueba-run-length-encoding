package asciiart;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AsciiArt {
  
    public static void printContent(String path)throws IOException {
        Files.readAllLines(Paths.get(path)).stream().forEach(System.out::println);
    }
    
    public static String read(String path) throws IOException{
        return new String(Files.readAllBytes(Paths.get(path)));
    }
    
    public static String compress(String text){
        StringBuilder result = new StringBuilder ();
        int n = text.length();
        for (int i = 0; i < n; i++) {
            // Count occurrences of current character
            int count = 1;
            while (i < n - 1 &&
                   text.charAt(i) == text.charAt(i + 1)) {
                count++;
                i++;
            }
            //Save count and char
            result.append(count);
            result.append(text.charAt(i));  
        }
        return result.toString();
    }
    
    public static String decompress(String text) {
        int count = 0;
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                count = count * 10 + c - '0';
            } else {
                if (count == 0) {
                    count = 1;
                }
                while (count > 0) {
                    resultado.append(c);
                    count--;
                }
            }
        }
        return resultado.toString();
    }
      
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String lista[] = {"imagen1.txt","imagen2.txt","imagen3.txt","imagen4.txt","imagen5.txt","imagen6.txt","imagen7.txt","imagen8.txt","imagen9.txt","imagen10.txt"};
        System.out.println("Selecciona un archivo de la lista");
        
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i+1) +" - "+lista[i]);
        }
        
        System.out.println("Digite un numero:");
        int index = sc.nextInt();
        
        System.out.println("Abriendo imagen:\n");
        printContent(lista[index-1]);
        String contenido = compress(read(lista[index-1]));
        System.out.println("Comprimiendo imagen:\n"+contenido);
        System.out.println("Descomprimiendo imagen:\n"+ decompress(contenido));
        
    }   
}
