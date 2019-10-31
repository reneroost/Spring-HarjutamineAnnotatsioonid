package ee.sport.appid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ee.sport.konfiguratsioon.SportKonfiguratsioon;
import ee.sport.treenerid.Treener;

public class UjumineJavaKonfiguratsioonApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext kontekst = 
				new AnnotationConfigApplicationContext(SportKonfiguratsioon.class);
		
		Treener tenniseTreener = kontekst.getBean("ujumisTreener", Treener.class);
		
		System.out.println(tenniseTreener.saaIgapaevaneTrenn());
		System.out.println(tenniseTreener.saaIgapaevaneEttekuulutus());
		
		kontekst.close();
	}
}
