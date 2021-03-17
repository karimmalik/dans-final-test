package com.karim.test.services;

import java.io.StringReader;
import java.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.karim.test.dto.PackageActivationConfirmationRequest2Dto;
import com.karim.test.dto.PackageActivationConfirmationRequestDto;
import com.karim.test.dto.PackageActivationRequestDto;
import com.karim.test.dto.ProductDto;
import com.karim.test.dto.ResponseDto;
import com.karim.test.Constants;
import com.karim.test.dto.ActivationResponse;

@Service
public class PackageActivationService {
   
	@Autowired
    private final RestTemplate restTemplate;
	
    @Autowired
    private RedisTemplate template;
	
	public PackageActivationService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder
        .setConnectTimeout(Duration.ofSeconds(500))
        .setReadTimeout(Duration.ofSeconds(500))
        .build();
    }
	
	public ResponseEntity<ResponseDto> confirmation(PackageActivationConfirmationRequestDto request){
		String url = "http://dev3.dansmultipro.co.id/mock/sit-web/secure/esb/v1/order/reseller";

        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        PackageActivationRequestDto activationRequest = new PackageActivationRequestDto();

    	PackageActivationConfirmationRequest2Dto request2 = new PackageActivationConfirmationRequest2Dto();
		request2.setMsisdn("081317180456");
		request2.setProductId("00019179");
		request2.setPin("123123");
		
        // build the request
        HttpEntity<PackageActivationConfirmationRequest2Dto> entity = new HttpEntity<>(request2, headers);

        // send POST request
        restTemplate.postForObject(url, entity, ActivationResponse.class);
        
        ResponseDto response = new ResponseDto();
        response.setStatus(HttpStatus.OK);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseDto> confirmation2(PackageActivationConfirmationRequestDto request){
		String url = "http://dev3.dansmultipro.co.id/mock/sit-web/secure/esb/v1/order/reseller";
    	RestTemplate restTemplate = new RestTemplate();
    	
    	PackageActivationConfirmationRequest2Dto request2 = new PackageActivationConfirmationRequest2Dto();
		request2.setMsisdn("081317180456");
		request2.setProductId("00019179");
		request2.setPin("123123");
		
//		List<ProductDto> productDtos = template.opsForHash().values(Constants.PRODUCT);
		
		Gson gsonPackage = new Gson();
		String packageActivationDtoString = template.opsForHash().get(Constants.PACKAGEACTIVATION, request.getToken()).toString();
		System.out.println(packageActivationDtoString);
		PackageActivationRequestDto packageDto = gsonPackage.fromJson(packageActivationDtoString, PackageActivationRequestDto.class);
		
		Gson gsonProduct = new Gson();
		String productDtoString = template.opsForHash().get(Constants.PRODUCT, packageDto.getProductId()).toString();
		System.out.println(productDtoString);
		ProductDto productDto = gsonProduct.fromJson(productDtoString, ProductDto.class);
		
		Gson gsonActiveResponse = new Gson();
		String result = restTemplate.postForObject( url, request2, String.class);
		ActivationResponse confirmationResponse = gsonActiveResponse.fromJson(result, ActivationResponse.class);
		
    	System.out.println(result);
		ResponseDto response = new ResponseDto();
		response.setStatus(HttpStatus.OK);
    	return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
