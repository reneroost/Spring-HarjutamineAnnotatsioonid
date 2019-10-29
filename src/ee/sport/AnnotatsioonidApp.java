package ee.sport;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatsioonidApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("rakenduseKontekst.xml");
		
		Treener otseneTreener = kontekst.getBean("seeLobusTreener", Treener.class);
		Treener vaikimisiTreener = kontekst.getBean("sulgpalliTreener", Treener.class);
		
		System.out.println(otseneTreener.saaIgapaevaneTrenn());
		System.out.println(otseneTreener.saaIgapaevaneEttekuulutus());
		System.out.println(vaikimisiTreener.saaIgapaevaneTrenn());
		
		kontekst.close();
	}
}
