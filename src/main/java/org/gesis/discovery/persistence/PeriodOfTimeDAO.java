package org.gesis.discovery.persistence;

import java.util.Date;

import org.gesis.dcterms.PeriodOfTime;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * @author matthaeus
 * 
 */
public interface PeriodOfTimeDAO extends GenericDAO<PeriodOfTime>, InstantiableDAO
{

	/**
	 * Returns a PeriodOfTime-object by it's <i>startDate</i> field value.
	 * 
	 * @param date
	 * @return
	 */
	public PeriodOfTime getByStartDate( Date date );
}
