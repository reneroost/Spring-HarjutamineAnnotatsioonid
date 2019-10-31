package ee.sport.appid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ee.sport.konfiguratsioon.SportKonfiguratsioon;
import ee.sport.treenerid.UjumisTreener;

public class UjumineJavaKonfiguratsioonApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext kontekst = 
				new AnnotationConfigApplicationContext(SportKonfiguratsioon.class);
		
		UjumisTreener ujumisTreener = kontekst.getBean("ujumisTreener", UjumisTreener.class);
		
		System.out.println(ujumisTreener.saaIgapaevaneTrenn());
		System.out.println(ujumisTreener.saaIgapaevaneEttekuulutus());
		System.out.println("email: " + ujumisTreener.getEmail());
		System.out.println("meeskond: " + ujumisTreener.getMeeskond());
		
		kontekst.close();
	}
}
