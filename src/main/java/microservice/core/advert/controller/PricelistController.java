package microservice.core.advert.controller;

import java.nio.file.AccessDeniedException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import microservice.core.advert.model.Pricelist;
import microservice.core.advert.model.User;
import microservice.core.advert.model.dto.PricelistDTO;

@RestController
@RequestMapping(value="api/pricelist", produces = MediaType.APPLICATION_JSON_VALUE)
public class PricelistController {
	
	@Autowired
	private PricelistService plservice;
	
	protected RestTemplate restTemplate;
	
	private String serviceUrl = "http://localhost:8183/api/whoami";

	
	@GetMapping("/all")
	public List<Pricelist> getAllPricelists() throws AccessDeniedException {
		
			return null;
	}
	
	@GetMapping("/me")
	public List<Pricelist> getMyPriceLists(@RequestHeader("Authorization") String header) throws AccessDeniedException {
		User me = authorizeMe(header).getBody();
		return  plservice.findByUser(me.getId());
	
	}
	@PostMapping("/new")
	public List<Pricelist> createNewPricelist( @RequestHeader("Authorization") String header, @RequestBody PricelistDTO data) throws AccessDeniedException {
		User me = authorizeMe(header).getBody();
		Pricelist newpl = new Pricelist();
		newpl.setCdw(data.getCdw());
		newpl.setPricePerDay(data.getPricePerDay());
		newpl.setPricePerKm(data.getPricePerKm());
		newpl.setCreator(me);
		newpl.setName(data.getName());
		
		plservice.save(newpl);
		
	return plservice.findByUser(me.getId());
	}
	
	@PutMapping("/update")
	public List<Pricelist> updatePricelist(@RequestHeader("Authorization") String header, @RequestBody PricelistDTO data) throws AccessDeniedException {
		User me = authorizeMe(header).getBody();
		Pricelist newpl = new Pricelist();
		newpl.setId(data.getId());
		newpl.setCdw(data.getCdw());
		newpl.setPricePerDay(data.getPricePerDay());
		newpl.setPricePerKm(data.getPricePerKm());
		newpl.setCreator(me);
		newpl.setName(data.getName());
		
		plservice.save(newpl);
		
	return plservice.findByUser(me.getId());
	}
	
	@DeleteMapping("/{id}")
	public List<Pricelist> deletePriceList(@RequestHeader("Authorization") String header, @PathVariable Long id)throws AccessDeniedException {
		plservice.remove(id);
		return plservice.findByUser(authorizeMe(header).getBody().getId());
	}
	
	ResponseEntity<User> authorizeMe(String header){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.add("Authorization", header );
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		restTemplate = new RestTemplate();
		return restTemplate.exchange(serviceUrl, HttpMethod.GET,entity , User.class);
	}

}
