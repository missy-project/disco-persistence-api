package org.gesis.discovery.persistence;

import org.gesis.discovery.DescriptiveStatistics;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link DescriptiveStatistics}. Methods which are
 * specific for a {@link DescriptiveStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface DescriptiveStatisticsDAO extends GenericResourceDAO<DescriptiveStatistics>, InstantiableDAO
{

}
