package ee.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("seeLobusTreener")
public class TenniseTreener implements Treener {
	
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	@Autowired
	public TenniseTreener(@Qualifier("positiivneEttekuulutusTeenus") EttekuulutusTeenus ettekuulutusTeenus) {
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}

	@Override
	public String saaIgapaevaneTrenn() {
		return "[TenniseTreener] Harjuta tagantkäe lööki 70 servi";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
