package ee.sport;

import org.springframework.stereotype.Component;

@Component
public class PositiivneEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "T�na on sinu �nnep�ev!";
	}

}
