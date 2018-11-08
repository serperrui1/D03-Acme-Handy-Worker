
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Endorser extends Actor {

	private Collection<Endorsement>	made;
	private Collection<Endorsement>	received;


	@OneToMany(mappedBy = "endorser")
	public Collection<Endorsement> getMade() {
		return this.made;
	}

	public void setMade(final Collection<Endorsement> made) {
		this.made = made;
	}

	@OneToMany(mappedBy = "recipient")
	public Collection<Endorsement> getReceived() {
		return this.received;
	}

	public void setReceived(final Collection<Endorsement> received) {
		this.received = received;
	}

}
