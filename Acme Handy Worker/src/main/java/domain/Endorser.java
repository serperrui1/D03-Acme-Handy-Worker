
package domain;


import javax.persistence.OneToMany;

public class Endorser extends Actor {

	private Endorsement	made;
	private Endorsement	received;


	@OneToMany(mappedBy = "endorser")
	public Endorsement getMade() {
		return this.made;
	}

	public void setMade( Endorsement made) {
		this.made = made;
	}

	@OneToMany(mappedBy = "recipient")
	public Endorsement getReceived() {
		return this.received;
	}

	public void setReceived(final Endorsement received) {
		this.received = received;
	}

}
