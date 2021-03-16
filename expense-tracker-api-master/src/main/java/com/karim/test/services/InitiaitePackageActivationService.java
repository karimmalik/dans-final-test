package com.karim.test.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.karim.test.domain.InitiatePackageActivationRequest;

@Repository
public class InitiaitePackageActivationService {
	
    @Autowired
    private RedisTemplate template;

    public static final String HASH_KEY = "Product";
    
    public ResponseEntity<InitiatePackageActivationRequest> save(InitiatePackageActivationRequest product){
    	UUID uuid = UUID.randomUUID();
    	String stringUuid = uuid.toString();
    	product.setToken(stringUuid);
        template.opsForHash().put(HASH_KEY,product.getToken(),product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    
    public List<InitiatePackageActivationRequest> findAll(){
        return template.opsForHash().values(HASH_KEY);
    }

    public InitiatePackageActivationRequest findProductById(int id){
        return (InitiatePackageActivationRequest) template.opsForHash().get(HASH_KEY,id);
    }


    public String deleteProduct(int id){
         template.opsForHash().delete(HASH_KEY,id);
        return "product removed !!";
    }
	
}