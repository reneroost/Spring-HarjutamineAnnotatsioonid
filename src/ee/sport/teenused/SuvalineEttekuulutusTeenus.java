package ee.sport.teenused;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class SuvalineEttekuulutusTeenus implements EttekuulutusTeenus {
	
	private String[] ettekuulutused = {
		"Kõik asjad on rasked, kuni nad on lihtsad",
		"Teekond ongi autasu",
		"Hea aeg alustada millegi uuega"};
		
	private Random suvaline = new Random();

	@Override
	public String saaEttekuulutus() {
		int indeks = suvaline.nextInt(ettekuulutused.length);
		return "[Olen suvaline]: " + ettekuulutused[indeks];
	}

}
