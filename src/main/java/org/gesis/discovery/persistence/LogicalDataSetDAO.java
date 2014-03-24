package org.gesis.discovery.persistence;

import org.gesis.discovery.LogicalDataSet;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link LogicalDataSet}. Methods which are specific
 * for a {@link LogicalDataSet} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface LogicalDataSetDAO extends GenericResourceDAO<LogicalDataSet>, InstantiableDAO
{

}
