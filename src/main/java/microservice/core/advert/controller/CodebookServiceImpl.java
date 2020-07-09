package microservice.core.advert.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import microservice.core.advert.model.Codebook;
import microservice.core.advert.model.additions.*;
import microservice.core.advert.repository.CarClassRepository;
import microservice.core.advert.repository.CityRepository;
import microservice.core.advert.repository.FuelRepository;
import microservice.core.advert.repository.GearRepository;
import microservice.core.advert.repository.ManufacturerRepository;
import microservice.core.advert.repository.ModelRepository;


@Service
public class CodebookServiceImpl implements CodebookService {
	
	@Autowired
	private ModelRepository mrepo;
	
	@Autowired
	private ManufacturerRepository mfrepo;
	
	@Autowired	
	private FuelRepository frepo;
	
	@Autowired
	private CityRepository crepo;
	
	@Autowired
	private GearRepository grepo;
	
	@Autowired
	private CarClassRepository ccrepo;
	
	// MANUFACTURERS	
	public List<Manufacturer> getManufacturers(){
		return mfrepo.findAll();
	}
	
	// MODELS
	public List<Model> getModels(){	
		return mrepo.findAll();
	}
	
	@Override
	public List<Model> removeModel(Long id) {
		mrepo.deleteById(id);
		return getModels();
	}
	@Override
	public void addModel(Model newModel) {
			mrepo.save(newModel);		
	}
	
	// FUELS
	public List<Fuel> getFuels(){
		return frepo.findAll();
	}

	@Override
	public List<CarClass> getCarClasses() {
		
		return ccrepo.findAll();
	}
	@Override
	public List<City> getCities() {
		return crepo.findAll();
	}
	@Override
	public List<GearBoxType> getGearTypes() {
		return grepo.findAll();
	}
// GENERAL
	@Override
	public Codebook getAll() {
		Codebook cb = new Codebook();
		cb.setFuels(getFuels());
		cb.setManufacturers(getManufacturers());
		cb.setModels(getModels());
		cb.setCities(getCities());		
		cb.setGearType(getGearTypes());
		cb.setCclass(getCarClasses());
		return cb;
	}

	@Override
	public List<Model> editModel(Long id, String newName) {
		Model m = mrepo.findById(id).orElse(null);
		m.setTitle(newName);
		mrepo.save(m);
		return mrepo.findAll();		
	}

	@Override
	public void addManfacturer(Manufacturer newObj) {
		mfrepo.save(newObj);
		}

	@Override
	public List<Manufacturer> removeManufacturer(Long id) {
		mfrepo.deleteById(id);
		return mfrepo.findAll();
	}

	@Override
	public List<Manufacturer> editManufacturer(Long id, String newName) {
		Manufacturer m = mfrepo.findById(id).orElse(null);
		m.setTitle(newName);
		mfrepo.save(m);
		return mfrepo.findAll();
	}

	@Override
	public void addFuel(Fuel newObj) {
		frepo.save(newObj);		
	}

	@Override
	public List<Fuel> removeFuel(Long id) {
		frepo.deleteById(id);
		return frepo.findAll();
	}

	@Override
	public List<Fuel> editFuel(Long id, String newName) {
		Fuel f = frepo.findById(id).orElse(null);
		f.setTitle(newName);
		frepo.save(f);
		return frepo.findAll();
	}

	@Override
	public void addCarClass(CarClass newObj) {
		ccrepo.save(newObj);
		
	}

	@Override
	public List<CarClass> removeCarClasses(Long id) {
		ccrepo.deleteById(id);
		return ccrepo.findAll();
	}

	@Override
	public List<CarClass> editCarClasses(Long id, String newName) {
		CarClass cc = ccrepo.findById(id).orElse(null);
		cc.setTitle(newName);
		return ccrepo.findAll();
		
	}

	@Override
	public void addGearBoxType(GearBoxType newObj) {
		grepo.save(newObj);
	}

	@Override
	public List<GearBoxType> removeGearBoxType(Long id) {
		grepo.deleteById(id);
		return grepo.findAll();
		}

	@Override
	public List<GearBoxType> editGearBoxType(Long id, String newName) {
		GearBoxType g = grepo.findById(id).orElse(null);
		g.setTitle(newName);
		return grepo.findAll();
	}

	@Override
	public void addCity(City newObj) {
		crepo.save(newObj);
		
	}

	@Override
	public List<City> removeCity(Long id) {
		crepo.deleteById(id);
		return crepo.findAll();
		}

	@Override
	public List<City> editCity(Long id, String newName) {
		City c = crepo.findById(id).orElse(null);
		c.setTitle(newName);
		crepo.save(c);
		return crepo.findAll();
	}

	
	}