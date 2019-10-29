package ee.sport.teenused;

import org.springframework.stereotype.Component;

@Component
public class AndmebaasiEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "[Olen andmebaasist]: Et kriitikat vältida, ära tee midagi, ära ütle midagi, ole nähtamatu!";
	}

}
