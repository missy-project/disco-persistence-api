package org.gesis.discovery.persistence;

import org.gesis.discovery.Variable;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Variable}. Methods which are specific for a
 * {@link Variable} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface VariableDAO extends GenericDAO<Variable>, InstantiableDAO
{

}
