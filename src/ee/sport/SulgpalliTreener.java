package ee.sport;

import org.springframework.stereotype.Component;

@Component
public class SulgpalliTreener implements Treener {

	@Override
	public String saaIgapaevaneTrenn() {
		return "[SulgpalliTreener] Harjuta eestkäelööke 80 servi";
	}

}
