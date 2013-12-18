package org.gesis.discovery.persistence;

import org.gesis.discovery.VariableDefinition;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * Data Access Object for {@link VariableDefinition}. Methods which are specific
 * for a {@link VariableDefinition} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface VariableDefinitionDAO extends GenericDAO<VariableDefinition>, InstantiableDAO
{

}
