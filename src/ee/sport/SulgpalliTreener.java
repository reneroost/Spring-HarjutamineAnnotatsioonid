package ee.sport;

import org.springframework.stereotype.Component;

@Component
public class SulgpalliTreener implements Treener {

	@Override
	public String saaIgapaevaneTrenn() {
		return "[SulgpalliTreener] Harjuta eestk�el��ke 80 servi";
	}

}
