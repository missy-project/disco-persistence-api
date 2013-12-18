package org.gesis.discovery.persistence;

import org.gesis.discovery.LogicalDataSet;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link LogicalDataSet}. Methods which are specific
 * for a {@link LogicalDataSet} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface LogicalDataSetDAO extends GenericDAO<LogicalDataSet>, InstantiableDAO
{

}
