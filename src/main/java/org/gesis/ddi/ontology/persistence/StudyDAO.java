package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.Study;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Study}. Methods which are specific for a
 * {@link Study} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface StudyDAO extends GenericDAO<Study>, DAO
{

}
