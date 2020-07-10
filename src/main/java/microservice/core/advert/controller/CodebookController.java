package microservice.core.advert.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservice.core.advert.model.Codebook;
import microservice.core.advert.model.additions.*;


@RestController
@RequestMapping(value = "/api/codebook", produces = MediaType.APPLICATION_JSON_VALUE)
public class CodebookController {

	@Autowired
	private CodebookService cdservice; 
	

	@GetMapping("/all")
	public Codebook getAllCodes(){
		
		return cdservice.getAll();
	}
	
	@GetMapping("/city/all")
	public List<City> getCities() {		
		return cdservice.getCities();
	}

	@PostMapping("/city/create")
	public List<City> newCity(@RequestBody String name) {		
		City newObj = new City();
		newObj.setTitle(name);
		cdservice.addCity(newObj);
		return cdservice.getCities();
	}
	
	@DeleteMapping("/city/delete/{id}")
	public List<City> deleteCity(@PathVariable Long id) {		
		return cdservice.removeCity(id);
		 
	}
	@PutMapping("/city/edit/{id}")
	public List<City> editCity(@PathVariable Long id, @RequestBody String newName) {		
		return cdservice.editCity(id, newName);
	}
//--------------------------------------------------------------------------------	
	@GetMapping("/model/all")
	public List<Model> getModels() {		
		return cdservice.getModels();
	}

	@PostMapping("/model/create")
	public List<Model> newModel(@RequestBody String name) {		
		Model newObj = new Model();
		newObj.setTitle(name);
		cdservice.addModel(newObj);
		return cdservice.getModels();
	}
	
	@DeleteMapping("/model/delete/{id}")
	public List<Model> deleteModel(@PathVariable Long id) {		
		return cdservice.removeModel(id);
		 
	}
	@PutMapping("/model/edit/{id}")
	public List<Model> editModel(@PathVariable Long id, @RequestBody String newName) {		
		return cdservice.editModel(id, newName);
	}
//--------------------------------------------------------------------------------
	@GetMapping("/manufacturer/all")
	public List<Manufacturer> getManufacturers() {		
		return cdservice.getManufacturers();
	}

	@PostMapping("/manufacturer/create")
	public List<Manufacturer> newManu(@RequestBody String name) {		
		Manufacturer newObj = new Manufacturer();
		newObj.setTitle(name);
		cdservice.addManfacturer(newObj);
		return cdservice.getManufacturers();
	}
	
	@DeleteMapping("/manufacturer/delete/{id}")
	public List<Manufacturer> deleteManu(@PathVariable Long id) {		
		return cdservice.removeManufacturer(id);
		 
	}
	@PutMapping("/manufacturer/edit/{id}")
	public List<Manufacturer> editManu(@PathVariable Long id, @RequestBody String newName) {		
		return cdservice.editManufacturer(id, newName);
	}
//--------------------------------------------------------------------------------
	@GetMapping("/fuel/all")
	public List<Fuel> getFuels() {		
		return cdservice.getFuels();
	}	

	@PostMapping("/fuel/create")
	public List<Fuel> newFuel(@RequestBody String name) {		
		Fuel newObj = new Fuel();
		newObj.setTitle(name);
		cdservice.addFuel(newObj);
		return cdservice.getFuels();
	}
	
	@DeleteMapping("/fuel/delete/{id}")
	public List<Fuel> deleteFuel(@PathVariable Long id) {		
		return cdservice.removeFuel(id);
		 
	}
	@PutMapping("/fuel/edit/{id}")
	public List<Fuel> editFuel(@PathVariable Long id, @RequestBody String newName) {		
		return cdservice.editFuel(id, newName);
	}
//--------------------------------------------------------------------------------
	@GetMapping("/cclass/all")
	public List<CarClass> getCarClasses() {		
		return cdservice.getCarClasses();
	}
	@PostMapping("/cclass/create")
	public List<CarClass> newCarClass(@RequestBody String name) {		
		CarClass newObj = new CarClass();
		newObj.setTitle(name);
		cdservice.addCarClass(newObj);
		return cdservice.getCarClasses();
	}
	
	@DeleteMapping("/cclass/delete/{id}")
	public List<CarClass> deleteCarClass(@PathVariable Long id) {		
		return cdservice.removeCarClasses(id);
		 
	}
	@PutMapping("/cclass/edit/{id}")
	public List<CarClass> editCarClass(@PathVariable Long id, @RequestBody String newName) {		
		return cdservice.editCarClasses(id, newName);
	}
//--------------------------------------------------------------------------------
	@GetMapping("/gear/all")
	public List<GearBoxType> getGear() {		
		return cdservice.getGearTypes();
	}
	@PostMapping("/gear/create")
	public List<GearBoxType> GearBoxType(@RequestBody String name) {		
		GearBoxType newObj = new GearBoxType();
		newObj.setTitle(name);
		cdservice.addGearBoxType(newObj);
		return cdservice.getGearTypes();
	}
	
	@DeleteMapping("/gear/delete/{id}")
	public List<GearBoxType> deleteGear(@PathVariable Long id) {		
		return cdservice.removeGearBoxType(id);
		 
	}
	@PutMapping("/gear/edit/{id}")
	public List<GearBoxType> editGear(@PathVariable Long id, @RequestBody String newName) {		
		return cdservice.editGearBoxType(id, newName);
	}
//--------------------------------------------------------------------------------
	
}
