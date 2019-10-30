package ee.sport.appid;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ee.sport.konfiguratsioon.SportKonfiguratsioon;
import ee.sport.treenerid.Treener;

public class JavaKonfiguratsioonApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext kontekst = 
				new AnnotationConfigApplicationContext(SportKonfiguratsioon.class);
		
		Treener tenniseTreener = kontekst.getBean("seeLobusTreener", Treener.class);
		Treener sulgpalliTreener = kontekst.getBean("sulgpalliTreener", Treener.class);
		Treener lauatenniseTreener = kontekst.getBean("lauatenniseTreener", Treener.class);
		
		System.out.println(tenniseTreener.saaIgapaevaneTrenn());
		System.out.println(tenniseTreener.saaIgapaevaneEttekuulutus());
		System.out.println(sulgpalliTreener.saaIgapaevaneTrenn());
		System.out.println(sulgpalliTreener.saaIgapaevaneEttekuulutus());
		System.out.println(lauatenniseTreener.saaIgapaevaneTrenn());
		System.out.println(lauatenniseTreener.saaIgapaevaneEttekuulutus());
		
		kontekst.close();
	}
}
