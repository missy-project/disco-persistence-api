package org.gesis.discovery.persistence;

import org.gesis.discovery.Instrument;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link Instrument}. Methods which are specific for a
 * {@link Instrument} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface InstrumentDAO extends GenericResourceDAO<Instrument>, InstantiableDAO
{

}
