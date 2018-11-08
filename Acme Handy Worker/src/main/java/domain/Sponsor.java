
package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@Access(AccessType.PROPERTY)
public class Sponsor extends Actor {

	// Relationships ----------------------------------------------------------
	private Collection<Sponsorship>	sponsorships;


	@OneToMany(mappedBy = "sponsor")
	public Collection<Sponsorship> getSponsorship() {
		return this.sponsorships;
	}

	public void setSponsorship(final Collection<Sponsorship> sponsorships) {
		this.sponsorships = sponsorships;
	}
}
