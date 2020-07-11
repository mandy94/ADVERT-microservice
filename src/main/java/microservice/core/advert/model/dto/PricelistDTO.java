package microservice.core.advert.model.dto;

import microservice.core.advert.model.Pricelist;

public class PricelistDTO {
	   
		private long id;
	    private double pricePerDay;
	    private double pricePerKm;
	    private double cdw;
	    private long creatorId;
	    private String name;
	    private double bonus; 
	    public PricelistDTO() {}

	    public PricelistDTO(double pricePerDay, double pricePerKm, double cdw, long creatorId) {
	        this.pricePerDay = pricePerDay;
	        this.pricePerKm = pricePerKm;
	        this.cdw = cdw;
	        this.creatorId = creatorId;
	    }

	    public PricelistDTO(Pricelist priceList){
	        this.creatorId=priceList.getCreator().getId();
	        this.pricePerDay=priceList.getPricePerDay();
	        this.pricePerKm=priceList.getPricePerKm();
	        this.cdw=priceList.getCdw();
	        this.id=priceList.getId();
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public double getPricePerDay() {
			return pricePerDay;
		}

		public void setPricePerDay(double pricePerDay) {
			this.pricePerDay = pricePerDay;
		}

		public double getPricePerKm() {
			return pricePerKm;
		}

		public void setPricePerKm(double pricePerKm) {
			this.pricePerKm = pricePerKm;
		}

		public double getCdw() {
			return cdw;
		}

		public void setCdw(double cdw) {
			this.cdw = cdw;
		}

		public long getCreatorId() {
			return creatorId;
		}

		public void setCreatorId(long creatorId) {
			this.creatorId = creatorId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "PricelistDTO [id=" + id + ", pricePerDay=" + pricePerDay + ", pricePerKm=" + pricePerKm + ", cdw="
					+ cdw + ", creatorId=" + creatorId + ", name=" + name + "]";
		}

		public double getBonus() {
			return bonus;
		}

		public void setBonus(double bonus) {
			this.bonus = bonus;
		}
	    
	    
}
