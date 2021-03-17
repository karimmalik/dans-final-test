package com.karim.test.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.karim.test.Constants;
import com.karim.test.domain.PackageActivationRequest;

@Repository
public class PackageActivationRepository {
	

	
	@Autowired
    private RedisTemplate template;
	
    public ResponseEntity<PackageActivationRequest> save(PackageActivationRequest product){
    	UUID uuid = UUID.randomUUID();
    	String stringUuid = uuid.toString();
    	product.setToken(stringUuid);
    	
        template.opsForHash().put(Constants.HASH_KEY, product.getToken(),product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    
    public List<PackageActivationRequest> findAll(){
        return template.opsForHash().values(Constants.HASH_KEY);
    }

    public PackageActivationRequest findProductById(String id){
        return (PackageActivationRequest) template.opsForHash().get(Constants.HASH_KEY,id);
    }

    public String deleteProduct(int id){
         template.opsForHash().delete(Constants.HASH_KEY,id);
        return "product removed !!";
    }
}
