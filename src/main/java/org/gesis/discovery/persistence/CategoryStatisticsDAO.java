package org.gesis.discovery.persistence;

import org.gesis.discovery.CategoryStatistics;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link CategoryStatistics}. Methods which are
 * specific for a {@link CategoryStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface CategoryStatisticsDAO extends GenericResourceDAO<CategoryStatistics>, InstantiableDAO
{

}
