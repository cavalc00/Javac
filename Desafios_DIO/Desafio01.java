package JavaProj.Desafios_DIO;
import java.io.*;

public class Desafio01{
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      var entrada = br.readLine();
      int limite = Integer.parseInt(entrada);
      
    	for (int i = 2 ; i <= limite; i++) {
    		if (i%2 == 0  ) System.out.println(i);
    	}
    }
	
}