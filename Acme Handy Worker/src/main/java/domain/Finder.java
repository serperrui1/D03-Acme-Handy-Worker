package domain;

import java.util.Date;
import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {
	
	private Collection<String> keyword;
	private Collection<String> category;
	private Collection<String> warranty;
	private Collection<Double> minPrice;
	private Collection<Double> maxPrice;
	private Collection<Date> minDate;
	private Collection<Date> maxDate;
	
	
	public Collection<String> getKeyword() {
		return keyword;
	}
	public void setKeyword(Collection<String> keyword) {
		this.keyword = keyword;
	}
	public Collection<String> getCategory() {
		return category;
	}
	public void setCategory(Collection<String> category) {
		this.category = category;
	}
	public Collection<String> getWarranty() {
		return warranty;
	}
	public void setWarranty(Collection<String> warranty) {
		this.warranty = warranty;
	}
	public Collection<Double> getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Collection<Double> minPrice) {
		this.minPrice = minPrice;
	}
	public Collection<Double> getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Collection<Double> maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Collection<Date> getMinDate() {
		return minDate;
	}
	public void setMinDate(Collection<Date> minDate) {
		this.minDate = minDate;
	}
	public Collection<Date> getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(Collection<Date> maxDate) {
		this.maxDate = maxDate;
	}

}
