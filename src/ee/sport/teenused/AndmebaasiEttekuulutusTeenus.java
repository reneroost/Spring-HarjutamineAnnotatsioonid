package ee.sport.teenused;

import org.springframework.stereotype.Component;

@Component
public class AndmebaasiEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "[Olen andmebaasist]: Et kriitikat v�ltida, �ra tee midagi, �ra �tle midagi, ole n�htamatu!";
	}

}
