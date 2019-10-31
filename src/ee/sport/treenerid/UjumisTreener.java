package ee.sport.treenerid;

import org.springframework.beans.factory.annotation.Value;

import ee.sport.teenused.EttekuulutusTeenus;

public class UjumisTreener implements Treener {
	
	private EttekuulutusTeenus ettekuulutusTeenus;
	
	@Value("${ujumine.email}")
	private String email;
	
	@Value("${ujumine.voistkond}")
	private String meeskond;
	
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

	public String getEmail() {
		return email;
	}

	public String getMeeskond() {
		return meeskond;
	}
	
	

}
