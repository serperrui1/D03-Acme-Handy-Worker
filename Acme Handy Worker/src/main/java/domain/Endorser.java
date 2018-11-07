
package domain;

import javax.persistence.ManyToOne;

public class Endorser extends Actor {

	private Endorsement	made;
	private Endorsement	received;


	@ManyToOne(optional = false)
	public Endorsement getMade() {
		return this.made;
	}

	public void setMade(final Endorsement made) {
		this.made = made;
	}

	@ManyToOne(optional = false)
	public Endorsement getReceived() {
		return this.received;
	}

	public void setReceived(final Endorsement received) {
		this.received = received;
	}

}
