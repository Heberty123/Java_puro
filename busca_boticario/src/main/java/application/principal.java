package application;

import java.io.IOException;

import Service.buscarBoticario;

public class principal {

	public static void main(String[] argc) throws IOException {
		
		buscarBoticario buscarBoticario = new buscarBoticario();
		
/*		String produto = buscarBoticario.findProduto("7891033813827"
				+ "");
		
		System.out.println(produto);
*/
		
		
		buscarBoticario.webPageNatura("29306");
	}
}
