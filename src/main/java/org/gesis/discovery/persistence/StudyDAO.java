package org.gesis.discovery.persistence;

import org.gesis.discovery.Study;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link Study}. Methods which are specific for a
 * {@link Study} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface StudyDAO extends GenericResourceDAO<Study>, InstantiableDAO
{

	/**
	 * Returns the Study-object by <i>studyTitle</i> and <i>studyYear</i>, which
	 * is obtained from the relation Study.temporal (PeriodOfTime).
	 * 
	 * @param studyTitle
	 * @param studyYear
	 * @return
	 */
	public Study getByTitle( String studyTitle, String studyYear );
}
