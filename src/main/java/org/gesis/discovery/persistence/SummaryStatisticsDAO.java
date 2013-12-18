package org.gesis.discovery.persistence;

import org.gesis.discovery.SummaryStatistics;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link SummaryStatistics}. Methods which are
 * specific for a {@link SummaryStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface SummaryStatisticsDAO extends GenericDAO<SummaryStatistics>, InstantiableDAO
{

}
