package conexao_unidirecional_exemplo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main (String[] args) throws IOException {
		//Cria um servidor Socket que utiliza a porta 12345
		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta!");
		
		//Aceita a conexão com o cliente
		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());
		
		//Faz a leitura dos dados enviados pelo cliente
		Scanner entrada = new Scanner(cliente.getInputStream());
		while (entrada.hasNextLine()) {
			System.out.println(entrada.nextLine());
		}
		
		//Encerra a conexao
		entrada.close();
		servidor.close();
	}
}
