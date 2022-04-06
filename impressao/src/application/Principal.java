package application;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		imprimir("Oi Heberty, O Londres vai estar esperando por você !"
				+ "\f");
		
		System.out.println("Fim de run");

	}

	public static void imprimir(String pTexto) {
		//  /n/r para novas linhas e /f para fim da página
		
		try {
			InputStream prin = new ByteArrayInputStream(pTexto.getBytes());
			DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
			SimpleDoc documentoTexto = new SimpleDoc(prin, docFlavor, null);
			PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();
			// pega a //impressora padrão
			PrintRequestAttributeSet printerAttributes = new HashPrintRequestAttributeSet();
			printerAttributes.add(new JobName("Impressao", null));
			printerAttributes.add(OrientationRequested.PORTRAIT);
			printerAttributes.add(MediaSizeName.ISO_A4);
			// informa o tipo de folha 
			DocPrintJob printJob = impressora.createPrintJob();
			
			try {
				printJob.print(documentoTexto, (PrintRequestAttributeSet) printerAttributes);
				//tenta imprimir
				
			} catch (PrintException e) {
				JOptionPane.showMessageDialog(null, "Não foi possível realizar a impressão !!", "Erro", JOptionPane.ERROR_MESSAGE);
				// mostra //mensagem de erro
			}
			
			prin.close();
			
		} catch (Exception e) {
			
		}
	}
}
