package org.gesis.dcterms.persistence;

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
	 * Returns the PeriodOfTime-object by the given <i>date</i>.
	 * 
	 * @param date
	 * @return
	 */
	public PeriodOfTime getByStartDate( Date date );
}
