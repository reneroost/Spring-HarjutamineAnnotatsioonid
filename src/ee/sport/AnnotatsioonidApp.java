package ee.sport;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotatsioonidApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("rakenduseKontekst.xml");
		
		Treener treener = kontekst.getBean("seeLobusTreener", Treener.class);
		
		System.out.println(treener.saaIgapaevaneTrenn());
		
		kontekst.close();
	}
}
