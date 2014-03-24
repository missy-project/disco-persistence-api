package org.gesis.discovery.persistence;

import java.util.Date;

import org.gesis.dcterms.PeriodOfTime;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * @author matthaeus
 * 
 */
public interface PeriodOfTimeDAO extends GenericResourceDAO<PeriodOfTime>, InstantiableDAO
{

	/**
	 * Returns a PeriodOfTime-object by it's <i>startDate</i> field value.
	 * 
	 * @param date
	 * @return
	 */
	public PeriodOfTime getByStartDate( Date date );
}
