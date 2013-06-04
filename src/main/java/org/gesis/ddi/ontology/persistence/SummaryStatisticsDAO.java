package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.SummaryStatistics;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link SummaryStatistics}. Methods which are
 * specific for a {@link SummaryStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface SummaryStatisticsDAO extends GenericDAO<SummaryStatistics>, DAO
{

}
