
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends DomainEntity{

	private String	name;
	private Boolean	root;


	@NotBlank
	public String getName() {
		return this.name;
	}

	public Boolean getRoot() {
		return this.root;
	}

	public void setName(String name) {
		if (this.root.equals(false)){
			this.name.toUpperCase();
		}	
		else{
		this.name = name;
		}
	}

	public void setRoot(Boolean root) {
		this.root = root;
	}

}
