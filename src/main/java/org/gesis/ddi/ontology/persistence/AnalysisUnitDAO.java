package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.AnalysisUnit;
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
