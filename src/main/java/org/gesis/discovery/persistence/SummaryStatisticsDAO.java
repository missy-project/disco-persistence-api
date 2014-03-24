package org.gesis.discovery.persistence;

import org.gesis.discovery.SummaryStatistics;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link SummaryStatistics}. Methods which are
 * specific for a {@link SummaryStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface SummaryStatisticsDAO extends GenericResourceDAO<SummaryStatistics>, InstantiableDAO
{

}
