package microservice.core.advert.controller;

import java.util.List;

import microservice.core.advert.model.Codebook;
import microservice.core.advert.model.additions.*;


public interface CodebookService {
	public Codebook getAll();
	// models
	public Model getModel(Long id);
	public List<Model> getModels();
	public void addModel(Model newModel);
	public List<Model> removeModel(Long id);
	public List<Model> editModel(Long id, String newName);
	//	manufacturer
	public Manufacturer getManufacturer(Long id);
	public List<Manufacturer> getManufacturers();	
	public void addManfacturer(Manufacturer newObj);
	public List<Manufacturer> removeManufacturer(Long id);
	public List<Manufacturer> editManufacturer(Long id, String newName);
	// fuel
	public Fuel getFuel(Long id);
	public List<Fuel> getFuels();
	public void addFuel(Fuel newObj);
	public List<Fuel> removeFuel(Long id);
	public List<Fuel> editFuel(Long id, String newName);
	//CarClass
	public CarClass getCarClass(Long id);
	public List<CarClass> getCarClasses();
	public void addCarClass(CarClass newObj);
	public List<CarClass> removeCarClasses(Long id);
	public List<CarClass> editCarClasses(Long id, String newName);
	//GearBoxType
	public GearBoxType getGearType(Long id);
	public List<GearBoxType> getGearTypes();
	public void addGearBoxType(GearBoxType newObj);
	public List<GearBoxType> removeGearBoxType(Long id);
	public List<GearBoxType> editGearBoxType(Long id, String newName);
	// city
	public City getCity(Long id);
	public List<City> getCities();
	public void addCity(City newObj);
	public List<City> removeCity(Long id);
	public List<City> editCity(Long id, String newName);
	

}
