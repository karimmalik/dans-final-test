package com.pairlearning.expensetracker.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pairlearning.expensetracker.domain.Offer;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

	@GetMapping("/")
	public List<Offer> getAllProducts() {
		List<Offer> response = new ArrayList<Offer>();
		
		try {
		
			String url = "http://dev3.dansmultipro.co.id/mock/preprod-web/scrt/esb/v1/offer/reseller?menu_id=ML3_DP_03";
			
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
			
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Map<String, List<String>>> map = mapper.readValue(result.getBody().toString(), Map.class);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map.get("offer")));
			Map<String, List<String>> innerMap = map.get("offer");
			
			for (Entry<String, List<String>> entry : innerMap.entrySet()) {
				String key = entry.getKey();
				List<String> value = entry.getValue();
				Offer offer = new Offer();
				
				response.add(offer);
			}
		
		} catch (Exception e) {
		System.out.println("exc : " + e);
		}
		    
		return response;
	}
	
}
