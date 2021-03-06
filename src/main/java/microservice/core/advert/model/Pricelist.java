package microservice.core.advert.model;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Pricelist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double pricePerDay;

    @Column
    private Double pricePerKm;

    @Column
    private Double cdw;
    
    @Column
    private String name;
    
    @Column
    private Double bonus;
    
    @OneToMany(mappedBy = "priceList", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Advert> advert;
    
    @ManyToOne
    @JsonIgnore
    private User creator;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<Advert> getAdvert() {
		return advert;
	}

	public void setAdvert(Set<Advert> advert) {
		this.advert = advert;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

    

}
