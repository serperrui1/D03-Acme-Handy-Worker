package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
@Entity
@Access(AccessType.PROPERTY)

public class Configuration extends DomainEntity{
	private Integer vat;
	private Integer countryCode;
	private Double cacheFinder;
	private Double	resultFinder;
	private String spamWord;
	private String banner;
	private String creditCard;
	private String defaultCountryCode;
	private String leafCategory;
	private String positiveWords;
	private String negativeWords;
	
	
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
	@NotBlank
	@Column(unique = true)
	public String getSpamWord() {
		return spamWord;
	}
	public void setSpamWord(String spamWord) {
		this.spamWord = spamWord;
	}
	@URL
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	@NotBlank
	@Column(unique = true)
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	@Pattern(regexp= "/^[+]([1-9][0-9][0-9]|[1-9][0-9]|[1-9])$/") 
	public String getDefaultCountryCode() {
		return defaultCountryCode;
	}
	public void setDefaultCountryCode(String defaultCountryCode) {
		this.defaultCountryCode = defaultCountryCode;
	}
	@NotBlank
	@Column(unique = true)
	public String getLeafCategory() {
		return leafCategory;
	}
	public void setLeafCategory(String leafCategory) {
		this.leafCategory = leafCategory;
	}
	@NotBlank
	@Column(unique = true)
	public String getPositiveWords() {
		return positiveWords;
	}
	public void setPositiveWords(String positiveWords) {
		this.positiveWords = positiveWords;
	}
	@NotBlank
	@Column(unique = true)
	public String getNegativeWords() {
		return negativeWords;
	}
	public void setNegativeWords(String negativeWords) {
		this.negativeWords = negativeWords;
	}
	
	

}
