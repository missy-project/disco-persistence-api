package org.gesis.discovery.persistence;

import org.gesis.discovery.CategoryStatistics;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link CategoryStatistics}. Methods which are
 * specific for a {@link CategoryStatistics} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface CategoryStatisticsDAO extends GenericDAO<CategoryStatistics>, InstantiableDAO
{

}
