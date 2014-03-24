package org.gesis.discovery.persistence;

import org.gesis.discovery.Universe;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link Universe}. Methods which are specific for a
 * {@link Universe} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface UniverseDAO extends GenericResourceDAO<Universe>, InstantiableDAO
{

}
