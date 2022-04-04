package Service;

import static java.time.temporal.ChronoUnit.MINUTES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.google.gson.Gson;


public class buscarBoticario {

    private static final String viaProdutoBoticario = "https://www.boticario.com.br/busca?q=";
    private static final Gson gson = new Gson();

    
    
    public void webPageBoticario(String codigo) throws IOException {
    	
    	String stringURL = "https://www.boticario.com.br/busca?q=" + codigo;
       
    	try {
    		final Document document = Jsoup.connect(stringURL).get();
    		System.out.println(document.select(".nprodct-price .nproduct-price-value").text());
    		String referencia = document.select(".product-thumbnails > .product-sku").text().replace("Cod: B", "");
    		String[] referencia_right = referencia.split(" ");
    		System.out.println(referencia_right[0]);
    		System.out.println(document.select(".nproduct-title").text());

    		
    		
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
    
    public void webPageNatura(String codigo) throws IOException {
    	
    	String stringURL = "https://www.natura.com.br/";
       
    	try {
    		final Document document = Jsoup.connect(stringURL).get();
    		System.out.println(document); 
    		
    	/*	Document document = Jsoup.connect(https://www.natura.com.br/s/produtos?busca=)
    	*/	
    		
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
    
}
