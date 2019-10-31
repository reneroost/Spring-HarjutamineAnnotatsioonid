package ee.sport.teenused;

public class NegatiivneEttekuulutusTeenus implements EttekuulutusTeenus {

	@Override
	public String saaEttekuulutus() {
		return "Täna on raske päev!";
	}

}
