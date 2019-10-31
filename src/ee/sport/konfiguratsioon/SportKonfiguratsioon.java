package ee.sport.konfiguratsioon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ee.sport.teenused.EttekuulutusTeenus;
import ee.sport.teenused.NegatiivneEttekuulutusTeenus;
import ee.sport.treenerid.Treener;
import ee.sport.treenerid.UjumisTreener;

@Configuration
// @ComponentScan("ee.sport")
public class SportKonfiguratsioon {

	@Bean
	public EttekuulutusTeenus negatiivneEttekuulutusTeenus() {
		return new NegatiivneEttekuulutusTeenus();
	}
	
	@Bean
	public Treener ujumisTreener() {
		return new UjumisTreener(negatiivneEttekuulutusTeenus());
	}
}
