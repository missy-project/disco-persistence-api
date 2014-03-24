package org.gesis.discovery.persistence;

import org.gesis.discovery.Variable;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link Variable}. Methods which are specific for a
 * {@link Variable} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface VariableDAO extends GenericResourceDAO<Variable>, InstantiableDAO
{

}
