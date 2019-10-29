package ee.sport.teenused;

import org.springframework.stereotype.Component;

@Component
public class RESTEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "[Olen RESTful APIst]: Kogu pingutus läheb lõpuks asja ette!";
	}

}
