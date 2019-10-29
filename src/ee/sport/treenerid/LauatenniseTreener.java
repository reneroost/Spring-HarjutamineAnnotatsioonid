package ee.sport.treenerid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import ee.sport.teenused.EttekuulutusTeenus;

@Component
public class LauatenniseTreener implements Treener {

	@Autowired
	@Qualifier("andmebaasiEttekuulutusTeenus")
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "[LautenniseTreener] Mängi kolm treeningsetti";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
