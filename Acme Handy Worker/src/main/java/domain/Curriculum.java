
package domain;

import java.util.Set;

public class Curriculum extends DomainEntity {

	private String					ticker;
	private PersonalRecord			personalRecord;
	private Set<EducationRecord>	educationalRecord;
	private Set<ProfessionalRecord>	profesionalRecord;

}
