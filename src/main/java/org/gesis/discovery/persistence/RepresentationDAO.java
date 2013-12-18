package org.gesis.discovery.persistence;

import org.gesis.discovery.Representation;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Representation}. Methods which are specific
 * for a {@link Representation} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface RepresentationDAO extends GenericDAO<Representation>, InstantiableDAO
{

}
