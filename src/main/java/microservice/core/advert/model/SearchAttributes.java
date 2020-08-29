package microservice.core.advert.model;

import java.util.List;

import microservice.core.advert.model.additions.*;

public class SearchAttributes {

	private List<Model> models; 
	private List<Fuel> fuels;
	private List<Manufacturer> manufacturers;
	private List<GearBoxType> gearType;
	private List<CarClass> cclass;
	private float minPrice;
	private float maxPrice;
	private float milage;
	private int kidsSeat;
	private Boolean cdw;
	
	public List<Model> getModels() {
		return models;
	}
	public void setModels(List<Model> models) {
		this.models = models;
	}
	public List<Fuel> getFuels() {
		return fuels;
	}
	public void setFuels(List<Fuel> fuels) {
		this.fuels = fuels;
	}
	public List<Manufacturer> getManufacturers() {
		return manufacturers;
	}
	public void setManufacturers(List<Manufacturer> manufacturers) {
		this.manufacturers = manufacturers;
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
	public float getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}
	public float getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}
	public float getMilage() {
		return milage;
	}
	public void setMilage(float milage) {
		this.milage = milage;
	}
	public int getKidsSeat() {
		return kidsSeat;
	}
	public void setKidsSeat(int kidsSeat) {
		this.kidsSeat = kidsSeat;
	}
	@Override
	public String toString() {
		return "SearchAttributes [models=" + models + ", fuels=" + fuels + ", manufacturers=" + manufacturers
				+ ", gearType=" + gearType + ", cclass=" + cclass + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", milage=" + milage + ", kidsSeat=" + kidsSeat + "cd=" + cdw +"]";
	}
	public Boolean getCdw() {
		return cdw;
	}
	public void setCdw(Boolean cdw) {
		this.cdw = cdw;
	}
	
	
	
}
