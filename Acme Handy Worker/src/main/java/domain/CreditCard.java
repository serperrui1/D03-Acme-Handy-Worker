package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;


@Embeddable
@Access(AccessType.PROPERTY)
public class CreditCard {
	private String holderName;
	private String brandName;
	private Integer number;
	private Date expirationMonth;
	private Date expirationYeat;
	private Integer cvv;
	
	@NotBlank
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	@NotBlank
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	@CreditCardNumber
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Date getExpirationMonth() {
		return expirationMonth;
	}
	public void setExpirationMonth(Date expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
	public Date getExpirationYeat() {
		return expirationYeat;
	}
	public void setExpirationYeat(Date expirationYeat) {
		this.expirationYeat = expirationYeat;
	}
	@Range(min=100,max=999)
	public Integer getCvv() {
		return cvv;
	}
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	
	
	
}
