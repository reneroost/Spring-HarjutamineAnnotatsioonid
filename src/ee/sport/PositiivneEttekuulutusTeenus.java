package ee.sport;

import org.springframework.stereotype.Component;

@Component
public class PositiivneEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "[Olen positiivne]: T�na tuleb kena p�ev!";
	}

}
