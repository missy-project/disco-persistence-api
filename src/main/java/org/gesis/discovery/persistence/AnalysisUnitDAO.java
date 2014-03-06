package org.gesis.discovery.persistence;

import org.gesis.discovery.AnalysisUnit;
import org.gesis.persistence.GenericDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link AnalysisUnit}. Methods which are specific for
 * a {@link AnalysisUnit} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface AnalysisUnitDAO extends GenericDAO<AnalysisUnit>, InstantiableDAO
{

	/**
	 * Returns an AnalysisUnit where property AnalysisUnit.notation equals
	 * <i>notation</i>.
	 * 
	 * @param notation
	 * @return
	 */
	public AnalysisUnit getByNotation( String notation );
}
