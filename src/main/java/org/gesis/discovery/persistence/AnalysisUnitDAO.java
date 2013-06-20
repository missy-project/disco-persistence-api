package org.gesis.discovery.persistence;

import org.gesis.discovery.AnalysisUnit;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link AnalysisUnit}. Methods which are specific for
 * a {@link AnalysisUnit} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface AnalysisUnitDAO extends GenericDAO<AnalysisUnit>, DAO
{

}