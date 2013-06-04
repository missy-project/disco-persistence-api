package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.LogicalDataSet;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link LogicalDataSet}. Methods which are specific
 * for a {@link LogicalDataSet} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface LogicalDataSetDAO extends GenericDAO<LogicalDataSet>, DAO
{

}
