package org.gesis.discovery.persistence;

import org.gesis.discovery.Study;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Study}. Methods which are specific for a
 * {@link Study} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface StudyDAO extends GenericDAO<Study>, InstantiableDAO
{

	/**
	 * Returns the Study-object by <i>studyName</i>.
	 * 
	 * @param studyName
	 * @return
	 */
	public Study getByName( String studyName );
}
