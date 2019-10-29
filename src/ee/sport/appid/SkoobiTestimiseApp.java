package ee.sport.appid;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ee.sport.treenerid.Treener;

public class SkoobiTestimiseApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext kontekst = 
				new ClassPathXmlApplicationContext("rakenduseKontekst.xml");
		
		Treener alfaTreener = kontekst.getBean("seeLobusTreener", Treener.class);
		Treener beetaTreener = kontekst.getBean("seeLobusTreener", Treener.class);
		
		Treener gammaTreener = kontekst.getBean("sulgpalliTreener", Treener.class);
		Treener deltaTreener = kontekst.getBean("sulgpalliTreener", Treener.class);
		
		boolean vastus = alfaTreener == beetaTreener;
		System.out.println("alfaTreener ja beetaTreener sama objekti viidad: " + vastus);
		System.out.println("alfaTreener asukoht mälus: " + alfaTreener);
		System.out.println("beetaTreener asukoht mälus: " + beetaTreener + "\n");
		
		boolean vastus2 = gammaTreener == deltaTreener;
		System.out.println("gammaTreener ja deltaTreener sama objekti viidad: " + vastus2);
		System.out.println("gammaTreener asukoht mälus: " + alfaTreener);
		System.out.println("deltaTreener asukoht mälus: " + deltaTreener + "\n");
		
		kontekst.close();
	}

}
