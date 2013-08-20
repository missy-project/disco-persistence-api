package org.gesis.discovery.persistence;

import java.util.List;

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

	/**
	 * Returns a List of AnalysisUnits where property AnalysisUnit.notation
	 * equals <i>notation</i>.
	 * 
	 * @param notation
	 * @return
	 */
	public List<AnalysisUnit> getByNotation( String notation );
}
