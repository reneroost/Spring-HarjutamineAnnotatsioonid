package ee.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LauatenniseTreener implements Treener {

	@Autowired
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "Mängi kolm treeningsetti";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
