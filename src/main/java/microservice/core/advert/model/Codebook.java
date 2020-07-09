package microservice.core.advert.model;

import java.util.ArrayList;
import java.util.List;

import microservice.core.advert.model.additions.CarClass;
import microservice.core.advert.model.additions.City;
import microservice.core.advert.model.additions.Fuel;
import microservice.core.advert.model.additions.GearBoxType;
import microservice.core.advert.model.additions.Manufacturer;
import microservice.core.advert.model.additions.Model;


public class Codebook {

	private List<Fuel> fuels = new ArrayList<>();
	private List<Model> models  = new ArrayList<>();
	private List<Manufacturer> manufacturers  = new ArrayList<>();
	private List<City> cities  = new ArrayList<>();
	private List<GearBoxType> gearType  = new ArrayList<>();
	private List<CarClass> cclass = new ArrayList<>();	
	
	
	public List<Fuel> getFuels() {
		return fuels;
	}
	public void setFuels(List<Fuel> fuels) {
		this.fuels = fuels;
	}
	public List<Model> getModels() {
		return models;
	}
	public void setModels(List<Model> models) {
		this.models = models;
	}
	public List<Manufacturer> getManufacturers() {
		return manufacturers;
	}
	public void setManufacturers(List<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	public List<GearBoxType> getGearType() {
		return gearType;
	}
	public void setGearType(List<GearBoxType> gearType) {
		this.gearType = gearType;
	}
	public List<CarClass> getCclass() {
		return cclass;
	}
	public void setCclass(List<CarClass> cclass) {
		this.cclass = cclass;
	}
	
	

}

