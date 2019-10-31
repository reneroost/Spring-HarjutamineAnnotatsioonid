package ee.sport.treenerid;

import ee.sport.teenused.EttekuulutusTeenus;

public class UjumisTreener implements Treener {
	
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	public UjumisTreener(EttekuulutusTeenus ettekuulutusTeenus) {
		this.ettekuulutusTeenus = ettekuulutusTeenus;
	}

	@Override
	public String saaIgapaevaneTrenn() {
		return "Uju krooli 2km";
	}

	@Override
	public String saaIgapaevaneEttekuulutus() {
		return ettekuulutusTeenus.saaEttekuulutus();
	}

}
