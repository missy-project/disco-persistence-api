package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.Representation;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Representation}. Methods which are specific
 * for a {@link Representation} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface RepresentationDAO extends GenericDAO<Representation>, DAO
{

}
