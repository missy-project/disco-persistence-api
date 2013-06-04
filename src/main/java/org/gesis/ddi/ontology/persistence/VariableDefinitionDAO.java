package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.VariableDefinition;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * Data Access Object for {@link VariableDefinition}. Methods which are specific
 * for a {@link VariableDefinition} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface VariableDefinitionDAO extends GenericDAO<VariableDefinition>, DAO
{

}
