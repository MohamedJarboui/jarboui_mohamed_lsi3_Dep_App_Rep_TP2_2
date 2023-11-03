package ClientSever;


import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class Client {
	public static void main(String[] args) {
		try {
			
			int nombre1,nombre2;
			String operateur;
			 Scanner scanner= new Scanner(System.in);
			 
			 Socket socket=new Socket("localhost",12345);
			 System.out.println("je suis connecte");
			 //flux de communication
			 System.out.println("donner l'operateur  :");
			 operateur=scanner.nextLine();
			 System.out.println("donner le nombre1 :");
			 nombre1=scanner.nextInt();
			 System.out.println("donner le nombre2 :");
			 nombre2=scanner.nextInt();
			 
			 OutputStream os = socket.getOutputStream();
			
			 scanner.close();
			 // client envoie un objet voiture 
			 Operation op = new Operation(nombre1,nombre2, operateur);
			 ObjectOutputStream oos=new ObjectOutputStream(os);
			 oos.writeObject(op);
			 //lire le resultat
			 InputStream is = socket.getInputStream();
	         InputStreamReader isr= new InputStreamReader(is);
	         BufferedReader br = new BufferedReader(isr);
	         System.out.println(br.readLine());
			
		     
			 socket.close();
		}
			
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
			
	}

}
