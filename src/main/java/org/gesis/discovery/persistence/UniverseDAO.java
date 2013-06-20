package org.gesis.discovery.persistence;

import org.gesis.discovery.Universe;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Universe}. Methods which are specific for a
 * {@link Universe} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface UniverseDAO extends GenericDAO<Universe>, DAO
{

}
