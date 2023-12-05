package conexao_unidirecional_exemplo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) throws  UnknownHostException, IOException {
		//Cria uma conexao com o servidor usando Socket
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		//Captura os dados digitados pelo usuário
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		while (teclado.hasNextLine()) {
			saida.println(teclado.nextLine());
		}
		
		saida.close();
		teclado.close();
	}
}
