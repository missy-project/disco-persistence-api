package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.Variable;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Variable}. Methods which are specific for a
 * {@link Variable} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface VariableDAO extends GenericDAO<Variable>, DAO
{

}
