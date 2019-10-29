package ee.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SulgpalliTreener implements Treener {
	
	@Qualifier("positiivneEttekuulutusTeenus")
	public EttekuulutusTeenus ettekuulutusTeenus;

	@Override
	public String saaIgapaevaneTrenn() {
		return "[SulgpalliTreener] Harjuta eestkäelööke 80 servi";
	}
	
	@Autowired
	public void looEttekuulutusTeenus(@Qualifier("suvalineEttekuulutusTeenus") EttekuulutusTeenus ettekuulutusTeenus) {
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}
}
