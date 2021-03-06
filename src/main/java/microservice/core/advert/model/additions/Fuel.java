
package microservice.core.advert.model.additions;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import microservice.core.advert.model.Advert;

@Entity
@Table(name = "FUEL")
public class Fuel {

	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
	@Column(name = "title")
    private String title;

	@OneToMany(mappedBy = "fuel", fetch = FetchType.LAZY, cascade = CascadeType.ALL)	
	@JsonIgnore
	private List<Advert> adverts = new ArrayList<Advert>();
	

	@Override
	public String toString() {
		return "Fuel [id=" + id + ", title=" + title + "]";
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
	
	
}
