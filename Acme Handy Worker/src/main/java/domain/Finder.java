package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;

@Entity
@Access(AccessType.PROPERTY)
public class Finder extends DomainEntity {
	
	private List<String> keyword;
	private List<String> category;
	private List<String> warranty;
	private List<Double> minPrice;
	private List<Double> maxPrice;
	private List<Date> minDate;
	private List<Date> maxDate;
	
	
	public List<String> getKeyword() {
		return keyword;
	}
	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}
	public List<String> getCategory() {
		return category;
	}
	public void setCategory(List<String> category) {
		this.category = category;
	}
	public List<String> getWarranty() {
		return warranty;
	}
	public void setWarranty(List<String> warranty) {
		this.warranty = warranty;
	}
	public List<Double> getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(List<Double> minPrice) {
		this.minPrice = minPrice;
	}
	public List<Double> getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(List<Double> maxPrice) {
		this.maxPrice = maxPrice;
	}
	public List<Date> getMinDate() {
		return minDate;
	}
	public void setMinDate(List<Date> minDate) {
		this.minDate = minDate;
	}
	public List<Date> getMaxDate() {
		return maxDate;
	}
	public void setMaxDate(List<Date> maxDate) {
		this.maxDate = maxDate;
	}

}
