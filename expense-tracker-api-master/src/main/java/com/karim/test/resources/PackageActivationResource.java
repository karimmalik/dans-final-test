package com.karim.test.resources;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karim.test.domain.PackageActivationRequest;
import com.karim.test.domain.PackageActivationResponse;
import com.karim.test.services.InitiaitePackageActivationService;

@RestController
@RequestMapping("api/package-activation")
public class PackageActivationResource {

	@Autowired
	public RedisTemplate template;
	
	public static final String PRODUCT = "packageActivation";
	
	@Autowired
	InitiaitePackageActivationService service;
	
	@PostMapping
    public ResponseEntity<PackageActivationRequest> save(@RequestBody PackageActivationRequest product) {
        return service.save(product);
    }

    @GetMapping
    public List<PackageActivationRequest> getAllProducts() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PackageActivationRequest findProduct(@PathVariable int id) {
        return service.findProductById(id);
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
    	return service.deleteProduct(id);
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
