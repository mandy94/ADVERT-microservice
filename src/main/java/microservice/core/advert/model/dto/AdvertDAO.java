package microservice.core.advert.model.dto;


import microservice.core.advert.model.Advert;

public class AdvertDAO {
	

    String title;
    String description;
    String model;
    long fuel;
    long gear;
    String img;
    long cclass;        
    long manufacturer;
    long CDW;
    long numberOfKidsSeat;    
    double milage;
    long priceList;    
    private Double pricePerKm;
    public AdvertDAO() {}
	public AdvertDAO(Advert adById) {
		this.title= adById.getTitle();
		this.priceList =adById.getPriceList().getId();
		this.manufacturer = adById.getManufacturer().getId();
		this.gear = adById.getGear().getId();
		this.fuel = adById.getFuel().getId();
		this.model = adById.getModel();
		this.img = adById.getImgmain();
		this.milage = adById.getMilage();
		this.numberOfKidsSeat = adById.getNumberOfKidsSeat();
		this.numberOfKidsSeat = adById.getNumberOfKidsSeat();
		this.pricePerKm= adById.getPriceList().getPricePerKm();
//		this.CDW = adById.ge;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getFuel() {
		return fuel;
	}
	public void setFuel(long fuel) {
		this.fuel = fuel;
	}
	public long getGear() {
		return gear;
	}
	public void setGear(long gear) {
		this.gear = gear;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public long getCclass() {
		return cclass;
	}
	public void setCclass(long cclass) {
		this.cclass = cclass;
	}
	public long getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(long manufacturer) {
		this.manufacturer = manufacturer;
	}
	public long getCDW() {
		return CDW;
	}
	public void setCDW(long cDW) {
		CDW = cDW;
	}
	public long getNumberOfKidsSeat() {
		return numberOfKidsSeat;
	}
	public void setNumberOfKidsSeat(long numberOfKidsSeat) {
		this.numberOfKidsSeat = numberOfKidsSeat;
	}
	public double getMilage() {
		return milage;
	}
	public void setMilage(double milage) {
		this.milage = milage;
	}
	public long getPriceList() {
		return priceList;
	}
	public void setPriceList(long priceList) {
		this.priceList = priceList;
	}
	public Double getPricePerKm() {
		return pricePerKm;
	}
	public void setPricePerKm(Double pricePerKm) {
		this.pricePerKm = pricePerKm;
	}
 

		
}
