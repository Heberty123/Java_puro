package application;


import Service.ViaCepClient;
import entities.Cep;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ViaCepClient via = new ViaCepClient();
		
		Cep http = via.findCep("13311250");
		
		System.out.println(http.getCep());
		System.out.println(http.getComplemento());
		System.out.println(http.getBairro());
		System.out.println(http.getLocalidade());
		System.out.println(http.getLogradouro());
		System.out.println(http.getUf());
	}

}
