package JavaProj.Desafios_DIO;
import java.io.*;

public class Desafio03{
	
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      var entrada = br.readLine();
      int nota = Integer.parseInt(entrada);
      
      if(nota <= 100 && nota >=86){
        System.out.println("A");
      } else if(nota <= 85 && nota >=61){
        System.out.println("B");
      } else if(nota <= 60 && nota >=36){
        System.out.println("C");
      } else if(nota <= 35 && nota >=1){
        System.out.println("D");
      } else if(nota < 1){
        System.out.println("E");
      }
      
    }
	
}