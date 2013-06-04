package org.gesis.ddi.persistence;

import org.gesis.ddi.Identifiable;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Identifiable}. Methods which are specific for
 * a {@link Identifiable} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface IdentifiableDAO extends GenericDAO<Identifiable>, DAO
{

}
