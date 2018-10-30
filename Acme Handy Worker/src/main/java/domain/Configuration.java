package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
@Entity
@Access(AccessType.PROPERTY)

public class Configuration extends DomainEntity{
	private Integer vat;
	private Integer countryCode;
	private Double cacheFinder;
	private Double	resultFinder;
	
	
	public Integer getVat() {
		return vat;
	}
	public void setVat(Integer vat) {
		this.vat = vat;
	}
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}
	@Range(min=1, max=24)
	public Double getCacheFinder() {
		return cacheFinder;
	}
	public void setCacheFinder(Double cacheFinder) {
		this.cacheFinder = cacheFinder;
	}
	@Size(min=0, max=100)
	public Double getResultFinder() {
		return resultFinder;
	}
	public void setResultFinder(Double resultFinder) {
		this.resultFinder = resultFinder;
	}
	
	

}
