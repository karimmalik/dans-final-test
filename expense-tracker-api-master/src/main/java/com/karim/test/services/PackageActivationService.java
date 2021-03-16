package com.karim.test.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.karim.test.domain.PackageActivationRequest;

@Service
public class PackageActivationService {
	
//    @Autowired
//    private RedisTemplate template;
//
//    public static final String HASH_KEY = "Product";
//    
//    public ResponseEntity<PackageActivationRequest> save(PackageActivationRequest product){
//    	UUID uuid = UUID.randomUUID();
//    	String stringUuid = uuid.toString();
//    	
//    	product.setToken(stringUuid);
//        template.opsForHash().put(product.getToken(), product.getToken(),product);
//        return new ResponseEntity<>(product, HttpStatus.OK);
//    }
//    
//    public List<PackageActivationRequest> findAll(){
//        return template.opsForHash().values(HASH_KEY);
//    }
//
//    public PackageActivationRequest findProductById(String id){
//        return (PackageActivationRequest) template.opsForHash().get(HASH_KEY,id);
//    }
//
//    public String deleteProduct(int id){
//         template.opsForHash().delete(HASH_KEY,id);
//        return "product removed !!";
//    }
    
    
	
}
