package ee.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seeLobusTreener")
public class TenniseTreener implements Treener {
	
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	@Autowired
	public TenniseTreener(EttekuulutusTeenus ettekuulutusTeenus) {
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}

	@Override
	public String saaIgapaevaneTrenn() {
		return "[TenniseTreener] Harjuta tagantk�e l��ki 70 servi";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
