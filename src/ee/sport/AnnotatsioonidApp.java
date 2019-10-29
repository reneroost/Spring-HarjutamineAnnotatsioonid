package ee.sport;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatsioonidApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("rakenduseKontekst.xml");
		
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
