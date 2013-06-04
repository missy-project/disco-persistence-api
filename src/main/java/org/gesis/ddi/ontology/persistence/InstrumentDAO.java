package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.Instrument;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Instrument}. Methods which are specific for a
 * {@link Instrument} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface InstrumentDAO extends GenericDAO<Instrument>, DAO
{

}