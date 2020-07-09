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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import microservice.core.advert.model.Advert;
import microservice.core.advert.model.User;
import microservice.core.advert.model.dto.AdvertDTO;


@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class AdvertController {

	@Autowired
	private AdvertService adservice;
	
	protected RestTemplate restTemplate;
	
	private String serviceUrl = "http://localhost:8183/api/whoami";
	private String userSrviceUrl = "http://localhost:8183/api/user/";
	
	@GetMapping("/all")
	public List<Advert> getAllAds(@RequestHeader("Authorization") String header) throws AccessDeniedException {
		
		return adservice.findAllAds();
	}
	
	@GetMapping("/me")
	public List<Advert> getMyAds(@RequestHeader("Authorization") String header) throws AccessDeniedException {
//		HttpHeaders headers = new HttpHeaders();
//		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//		headers.add("Authorization", header );
//		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
//		restTemplate = new RestTemplate();
//		ResponseEntity<User> owner = restTemplate.exchange(serviceUrl, HttpMethod.GET,entity , User.class);
//		if(owner!=null)		{
//			System.out.println(owner.getBody());
//				return adservice.findAll(owner.getBody().getId());
//		}
//		else
			return null;
	}
	
/*	public List<Advert> getFilteredAds(){
	@GetMapping("/all/search")
		
	}*/
	@GetMapping("/{id}")
	public Advert getAdById(@PathVariable Long id) {
		return adservice.getAdById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteAdById(@PathVariable Long id) {
		 adservice.removeById(id);
	}
	
	@PostMapping(value = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public void addAdvert(@RequestBody Advert ad) throws AccessDeniedException{		
		Advert a = new Advert();
		a.setTitle("TEST");
		a.setUser_id(ad.getUser_id());
		
		adservice.save(a);
	
	}
	

	
}
