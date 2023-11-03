package ClientSever;


	import java.io.BufferedReader;
	import java.net.SocketException;
import java.util.Scanner;
import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
	 
	public class Server {
		public static void main(String[] args)
		{
			double resultat;
			
			try {
			
		
				Scanner scanner=new Scanner(System.in);
				ServerSocket ss=new ServerSocket(12345);	
				System.out.println("je suis un serveur en attente");
				Socket s=ss.accept();
				OutputStream os = s.getOutputStream();
				InputStream is = s.getInputStream();
				ObjectInputStream ois= new ObjectInputStream(is);
				Operation op = (Operation)ois.readObject();
				 switch(op.getOperateur()) {
		            case "*":
		            
		            	resultat=op.getNombre1()*op.getNombre2();
		            	
		            	break; 
		            case "+":
		                
		                resultat=op.getNombre1()+op.getNombre2();;
		               
		                break;
		            case "-":
		            	
		            	resultat=resultat=op.getNombre1()-op.getNombre2();;
		            	
		            	break;
		            case "/":
		            	
		            	resultat=resultat=(double)op.getNombre1()/(double)op.getNombre2();;
		            	
		            	break;
		                
		            default:
		                System.out.println("tapez correcte operation SVP !");
		                resultat=-1;
		            	
		            	
		               
		            }
				 //le server envoie le resultat
				 PrintWriter pw = new PrintWriter(os,true);
				 pw.println(String.valueOf(resultat));
	           
				s.close();
			}
				catch(IOException  |ClassNotFoundException e){
				e.printStackTrace();	
					
				}

		
		}
				
		
	}

