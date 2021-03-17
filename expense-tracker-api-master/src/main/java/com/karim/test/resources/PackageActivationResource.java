package com.karim.test.resources;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.karim.test.domain.PackageActivationConfirmationRequest;
import com.karim.test.domain.PackageActivationConfirmationRequest2;
import com.karim.test.domain.PackageActivationRequest;
import com.karim.test.domain.PackageActivationResponse;
import com.karim.test.domain.PackageConfirmationResponse;
import com.karim.test.domain.Response;
import com.karim.test.repositories.PackageActivationRepository;
import com.karim.test.services.PackageActivationService;

@RestController
@RequestMapping("api/package-activation")
public class PackageActivationResource {
	
	static Logger log = Logger.getLogger(PackageActivationResource.class.getName());
	
	@Autowired
	public RedisTemplate template;
	
	public static final String PRODUCT = "packageActivation";
	
	@Autowired
	PackageActivationRepository service;
	
	@Autowired
    private final RestTemplate restTemplate;
	
	public PackageActivationResource(RestTemplateBuilder restTemplateBuilder) {
        // set connection and read timeouts
        this.restTemplate = restTemplateBuilder
                .setConnectTimeout(Duration.ofSeconds(500))
                .setReadTimeout(Duration.ofSeconds(500))
                .build();
    }

	@PostMapping
    public ResponseEntity<PackageActivationRequest> save(@RequestBody PackageActivationRequest product) {
        return service.save(product);
    }

    @GetMapping
    public List<PackageActivationRequest> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PackageActivationRequest findProduct(@PathVariable String id) {
        return service.findProductById(id);
    }
    
    @PostMapping("/confirmation")
    public ResponseEntity<Response> activationSpecification(@RequestBody PackageActivationConfirmationRequest request) {
        String url = "http://dev3.dansmultipro.co.id/mock/sit-web/secure/esb/v1/order/reseller";

        // create headers
        HttpHeaders headers = new HttpHeaders();
        // set `content-type` header
        headers.setContentType(MediaType.APPLICATION_JSON);
        // set `accept` header
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        PackageActivationRequest activationRequest = new PackageActivationRequest();
//        activationRequest = service.findProductById(request.getToken());
        
        // create a request object
//        PackageActivationConfirmationRequest2 request2 = new PackageActivationConfirmationRequest2();
//        request2.setMsisdn(activationRequest.getMsisdn());
//        request2.setProductId(activationRequest.getProductId());
//        request2.setPin(request.getPin());

	      PackageActivationConfirmationRequest2 request2 = new PackageActivationConfirmationRequest2();
	      request2.setMsisdn("081317180456");
	      request2.setProductId("00019179");
	      request2.setPin("123123");


        // build the request
        HttpEntity<PackageActivationConfirmationRequest2> entity = new HttpEntity<>(request2, headers);

        // send POST request
        restTemplate.postForObject(url, entity, PackageConfirmationResponse.class);
        
        Response response = new Response();
        response.setStatus(HttpStatus.OK);
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

	
//	@PostMapping("")
//	public ResponseEntity<PackageActivationResponse> packageActivation(@RequestBody PackageActivationRequest request) {
//		UUID uuid = UUID.randomUUID();
//		int variant = uuid.variant();
//		String strUuid = uuid.toString();
//		
//		template.opsForHash().put(variant, variant, request);
//		PackageActivationResponse response = new PackageActivationResponse();
//		response.setToken(strUuid);
//		response.setStatus(HttpStatus.OK);
//		
//		return new ResponseEntity<>(response, HttpStatus.OK);
//		
//	}
	
//	public Product save(Product product) {
//		template.opsForHash().put(PRODUCT, product.getId(),product);
//		return product;
//	}
	
}
