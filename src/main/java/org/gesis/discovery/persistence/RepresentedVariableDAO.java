package org.gesis.discovery.persistence;

import org.gesis.discovery.RepresentedVariable;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * Data Access Object for {@link RepresentedVariable}. Methods which are specific
 * for a {@link RepresentedVariable} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface RepresentedVariableDAO extends GenericDAO<RepresentedVariable>, InstantiableDAO
{

}
