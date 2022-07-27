package grandcircus.co.donutAPI;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DonutService {
	
	RestTemplate rt = new RestTemplate();
	
	public List<Donut> getAllDonuts() {
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		return rt.getForObject(url, DonutResponse.class).getResults();
		
	}
	
	public Donut getDonutById(int id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/" + id + ".json";
		return rt.getForObject(url, Donut.class);
	}

}