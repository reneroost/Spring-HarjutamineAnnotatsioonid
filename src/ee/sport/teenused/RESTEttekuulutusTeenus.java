package ee.sport.teenused;

import org.springframework.stereotype.Component;

@Component
public class RESTEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "[Olen RESTful APIst]: Kogu pingutus l�heb l�puks asja ette!";
	}

}
