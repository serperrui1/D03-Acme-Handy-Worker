
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.constraints.Past;

@Entity
@Access(AccessType.PROPERTY)
public class Endorsement extends DomainEntity {

	private Date				moment;
	private Collection<String>	comments;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Collection<String> comments) {
		this.comments = comments;
	}

	// Relationships ----------------------------------------------------------
	/*
	 * private HandyWorker senderHandyWorker;
	 * private HandyWorker recipientHandyWorker;
	 * private Customer senderCustomer;
	 * private Customer recipientCustomer;
	 * 
	 * @Valid
	 * 
	 * @ManyToOne(optional = false)
	 * public HandyWorker getsenderHandyWorker() {
	 * return this.senderHandyWorker;
	 * }
	 * 
	 * public void setSenderHandyWorker(HandyWorker senderHandyWorker) {
	 * this.senderHandyWorker = senderHandyWorker;
	 * }
	 * 
	 * @Valid
	 * 
	 * @ManyToOne(optional = false)
	 * public HandyWorker getRecipientHandyWorker() {
	 * return this.recipientHandyWorker;
	 * }
	 * 
	 * public void setRecipientHandyWorker(HandyWorker recipientHandyWorker) {
	 * this.recipientHandyWorker = recipientHandyWorker;
	 * }
	 * 
	 * @Valid
	 * 
	 * @ManyToOne(optional = false)
	 * public Customer getSenderCustomer() {
	 * return this.senderCustomer;
	 * }
	 * 
	 * public void setSenderCustomer(Customer senderCustomer) {
	 * this.senderCustomer = senderCustomer;
	 * }
	 * 
	 * @Valid
	 * 
	 * @ManyToOne(optional = false)
	 * public Customer getRecipientCustomer() {
	 * return this.recipientCustomer;
	 * }
	 * 
	 * public void setRecipientCustomer(Customer recipientCustomer) {
	 * this.recipientCustomer = recipientCustomer;
	 * }
	 */
}
