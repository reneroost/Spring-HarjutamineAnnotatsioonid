package ee.sport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LauatenniseTreener implements Treener {

	@Autowired
	@Qualifier("andmebaasiEttekuulutusTeenus")
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	@Override
	public String saaIgapaevaneTrenn() {
		return "[LautenniseTreener] M�ngi kolm treeningsetti";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
