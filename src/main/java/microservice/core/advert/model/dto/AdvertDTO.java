package microservice.core.advert.model.dto;

import javax.persistence.Column;

import microservice.core.advert.model.Advert;
import microservice.core.advert.model.User;

public class AdvertDTO {
	

	    @Override
	public String toString() {
		return "\n\nAdvertDTO [id=" + id + ", title=" + title + ", manufacturer="
				+ manufacturer + ", model=" + model + ", gear=" + gear + ", cclass=" + cclass + ", imgmain=" + imgmain
				+ ", milage=" + milage + ", kidsSeat=" + kidsSeat + ", numberOfKidsSeat=" + numberOfKidsSeat
				+ ", CDWprotection=" + CDWprotection + ", user=" + user + "]\n\n";
	}
		private Long id;
	    private String title;
	    private String descrition;
//	    public Pricelist priceList;
		private String manufacturer;
		private String model;
		private String gear;
		private String fuel;
		private String cclass;
		private String imgmain;
		private Float milage;
		private Boolean kidsSeat;
		private Integer numberOfKidsSeat;
		private Boolean CDWprotection;

	    private Double pricePerDay;
	    private Double pricePerKm;
	    private Double cdw;
	    private String name;
	    private Double bonus;
		
		private User user;
		
		public AdvertDTO(Advert adById) {
			this.id = adById.getId();
			this.title= adById.getTitle();
//			this.priceList =adById.getPriceList();
			this.manufacturer = adById.getManufacturer().getTitle();
			this.gear = adById.getGear().getTitle();
			this.fuel = adById.getFuel().getTitle();
			this.model = adById.getModel();
			this.cclass = adById.getCclass().getTitle();
			this.imgmain = adById.getImgmain();
			this.milage = adById.getMilage();
			this.kidsSeat = adById.getKidsSeat();
			this.numberOfKidsSeat = adById.getNumberOfKidsSeat();
			this.CDWprotection = adById.getCDWprotection();
			this.pricePerKm = adById.getPriceList().getPricePerKm();
		}
		public String getFuel() {
			return fuel;
		}
		public void setFuel(String fuel) {
			this.fuel = fuel;
		}
		public void setGear(String gear) {
			this.gear = gear;
		}
		public void setCclass(String cclass) {
			this.cclass = cclass;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		public User getUser() {
			return user;
		}
		public void setUser(User user) {
			this.user = user;
		}
//		public Pricelist getPriceList() {
//			return priceList;
//		}
//		public void setPriceList(Pricelist priceList) {
//			this.priceList = priceList;
//		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
	
		public String getImgmain() {
			return imgmain;
		}
		public void setImgmain(String imgmain) {
			this.imgmain = imgmain;
		}
		public Float getMilage() {
			return milage;
		}
		public void setMilage(Float milage) {
			this.milage = milage;
		}
		public Boolean getKidsSeat() {
			return kidsSeat;
		}
		public void setKidsSeat(Boolean kidsSeat) {
			this.kidsSeat = kidsSeat;
		}
		public Integer getNumberOfKidsSeat() {
			return numberOfKidsSeat;
		}
		public void setNumberOfKidsSeat(Integer numberOfKidsSeat) {
			this.numberOfKidsSeat = numberOfKidsSeat;
		}
		public Boolean getCDWprotection() {
			return CDWprotection;
		}
		public void setCDWprotection(Boolean cDWprotection) {
			CDWprotection = cDWprotection;
		}
		public String getDescrition() {
			return descrition;
		}
		public void setDescrition(String descrition) {
			this.descrition = descrition;
		}
		public String getGear() {
			return gear;
		}
		public String getCclass() {
			return cclass;
		}
		public Double getPricePerDay() {
			return pricePerDay;
		}
		public void setPricePerDay(Double pricePerDay) {
			this.pricePerDay = pricePerDay;
		}
		public Double getPricePerKm() {
			return pricePerKm;
		}
		public void setPricePerKm(Double pricePerKm) {
			this.pricePerKm = pricePerKm;
		}
		public Double getCdw() {
			return cdw;
		}
		public void setCdw(Double cdw) {
			this.cdw = cdw;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getBonus() {
			return bonus;
		}
		public void setBonus(Double bonus) {
			this.bonus = bonus;
		}
		
}
