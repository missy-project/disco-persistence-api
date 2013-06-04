package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.DescriptiveStatistics;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link DescriptiveStatistics}. Methods which are
 * specific for a {@link DescriptiveStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface DescriptiveStatisticsDAO extends GenericDAO<DescriptiveStatistics>, DAO
{

}
