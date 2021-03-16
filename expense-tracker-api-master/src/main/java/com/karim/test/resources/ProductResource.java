package com.karim.test.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.karim.test.domain.Offer;
import com.karim.test.domain.ProductDto;

@RestController
@RequestMapping("/api/product")
public class ProductResource {

	@GetMapping("/getAllProducts")
	public String getAllProducts() {
		List<Offer> response = new ArrayList<Offer>();
		
		try {
		
			String url = "http://dev3.dansmultipro.co.id/mock/preprod-web/scrt/esb/v1/offer/reseller?menu_id=ML3_DP_03";
			
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
			
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Map<String, List<String>>> map = mapper.readValue(result.getBody().toString(), Map.class);
//			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map.get("offer")));
//			Map<String, List<String>> innerMap = map.get("offer");
			
			String offersString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map.get("offer"));
			
			return offersString;
		
		} catch (Exception e) {
		System.out.println("exc : " + e);
		}
		    
		return null;
	}
	
}
