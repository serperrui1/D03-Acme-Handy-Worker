package domain;

import java.util.Collection;

import javax.persistence.ManyToOne;

public class Comment extends DomainEntity {
	private Collection<String> comments;

	public Collection<String> getComments() {
		return comments;
	}

	public void setComments(Collection<String> comments) {
		this.comments = comments;
	}

	// Relationships

	private Customer customer;
	private HandyWorker handyWorker;
	private Referee referee;


	@ManyToOne(optional = false)
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(optional = false)
	public HandyWorker getHandyWorker() {
		return handyWorker;
	}

	public void setHandyWorker(HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@ManyToOne(optional = false)
	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}


}
