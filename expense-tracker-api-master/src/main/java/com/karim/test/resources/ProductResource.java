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
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.AbstractClientHttpResponse;
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
	public List<ProductDto> getAllProducts() {
		List<Offer> response = new ArrayList<Offer>();
		
		try {
		
			String url = "http://dev3.dansmultipro.co.id/mock/preprod-web/scrt/esb/v1/offer/reseller?menu_id=ML3_DP_03";
			
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
			
			ObjectMapper mapper = new ObjectMapper();
			Map<String, Map<String, List<String>>> map = mapper.readValue(result.getBody().toString(), Map.class);
//			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map.get("offer")));
//			Map<String, List<String>> innerMap = map.get("offer");
			
//			String offersString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map.get("offer"));
//			
//			return offersString;
			
			List<Map<String, List<String>>> offers = (List<Map<String, List<String>>>) map.get("offer");
			List<ProductDto> productDtoList= new ArrayList<ProductDto>();
			for(int i=0; i<offers.size(); i++) {
				ProductDto productDto = new ProductDto();
			
				List list = new ArrayList<>();
				list.add(offers.get(i).get("id"));
				list.add(offers.get(i).get("name"));
				list.add(offers.get(i).get("price"));
				
				String id = list.get(0).toString();
				String name = list.get(1).toString();
				String price = list.get(2).toString();
				
//				productDto.setId(Integer.parseInt(id));
				productDto.setId(id);
				productDto.setName(name);
//				productDto.setPrice(Long.parseLong(price));
				productDto.setPrice(price);
				
				productDtoList.add(productDto);
				
				
			}
			return productDtoList;
		
		} catch (Exception e) {
		System.out.println("exc : " + e);
		}
		    
		return null;
	}
	
}
