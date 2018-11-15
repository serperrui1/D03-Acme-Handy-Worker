package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Configuration extends DomainEntity {
	private Integer vat;
	private String countryCode;
	private Double cacheFinder;
	private Double resultFinder;
	private Collection<String> spamWord;
	private String banner;
	private Collection<String> typeCreditCard;
	private String defaultCountryCode;
	private Collection<String> leafCategory;
	private Collection<String> positiveWords;
	private Collection<String>negativeWords;

	public Integer getVat() {
		return vat;
	}

	public void setVat(Integer vat) {
		this.vat = vat;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Range(min = 1, max = 24)
	public Double getCacheFinder() {
		return cacheFinder;
	}

	public void setCacheFinder(Double cacheFinder) {
		this.cacheFinder = cacheFinder;
	}

	@Size(min = 0, max = 100)
	public Double getResultFinder() {
		return resultFinder;
	}

	public void setResultFinder(Double resultFinder) {
		this.resultFinder = resultFinder;
	}

	@NotBlank
	@ElementCollection
	public Collection<String> getSpamWord() {
		return spamWord;
	}

	public void setSpamWord(Collection<String> spamWord) {
		this.spamWord = spamWord;
	}

	@URL
	@NotBlank
	public String getBanner() {
		return banner;
	}

	public void setBanner(String banner) {
		this.banner = banner;
	}

	@NotEmpty
	@ElementCollection
	public Collection<String> getCreditCard() {
		return typeCreditCard;
	}

	public void setCreditCard(Collection<String> creditCard) {
		this.typeCreditCard = creditCard;
	}

	@Pattern(regexp = "^[+]([1-9][0-9][0-9]|[1-9][0-9]|[1-9])$")
	public String getDefaultCountryCode() {
		return defaultCountryCode;
	}

	public void setDefaultCountryCode(String defaultCountryCode) {
		this.defaultCountryCode = defaultCountryCode;
	}

	@NotBlank
	@ElementCollection
	public Collection<String> getLeafCategory() {
		return leafCategory;
	}

	public void setLeafCategory(Collection<String> leafCategory) {
		this.leafCategory = leafCategory;
	}

	@NotBlank
	@ElementCollection
	public Collection<String> getPositiveWords() {
		return positiveWords;
	}

	public void setPositiveWords(Collection<String> positiveWords) {
		this.positiveWords = positiveWords;
	}

	@NotBlank
	@ElementCollection
	public Collection<String> getNegativeWords() {
		return negativeWords;
	}

	public void setNegativeWords(Collection<String> negativeWords) {
		this.negativeWords = negativeWords;
	}

}
