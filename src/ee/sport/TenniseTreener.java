package ee.sport;

import org.springframework.stereotype.Component;

@Component("seeLobusTreener")
public class TenniseTreener implements Treener {

	@Override
	public String saaIgapaevaneTrenn() {
		return "[TenniseTreener] Harjuta tagantk�e l��ki 70 servi";
	}

}
