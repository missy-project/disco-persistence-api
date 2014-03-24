package org.gesis.discovery.persistence;

import org.gesis.discovery.Representation;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link Representation}. Methods which are specific
 * for a {@link Representation} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface RepresentationDAO extends GenericResourceDAO<Representation>, InstantiableDAO
{

}
