package org.gesis.ddi.persistence;

import org.gesis.ddi.persistence.dataAccess.ConceptDAO;
import org.gesis.ddi.persistence.dataAccess.DataFileDAO;
import org.gesis.ddi.persistence.dataAccess.IdentifiableDAO;
import org.gesis.ddi.persistence.dataAccess.InstrumentDAO;
import org.gesis.ddi.persistence.dataAccess.LogicalDataSetDAO;
import org.gesis.ddi.persistence.dataAccess.QuestionDAO;
import org.gesis.ddi.persistence.dataAccess.QuestionnaireDAO;
import org.gesis.ddi.persistence.dataAccess.StudyDAO;
import org.gesis.ddi.persistence.dataAccess.UniverseDAO;
import org.gesis.ddi.persistence.dataAccess.VariableDAO;
import org.gesis.ddi.persistence.dataAccess.VariableDefinitionDAO;


/**
 * This class is a Factory-class for any DAO that is needed in this application.
 * 
 * @author matthaeus
 * 
 */
public interface PersistenceStrategy {

	// public void persist(BaseEntity object);
	
	public <T> T getDAO( Class<T> daoClass );

	public ConceptDAO getConceptDAO();

	public IdentifiableDAO getIdentifiableDAO();

	public InstrumentDAO getInstrumentDAO();

	public LogicalDataSetDAO getLogicalDataSetDAO();

	public VariableDAO getVariableDAO();

	public QuestionDAO getQuestionDAO();

	public DataFileDAO getDataFileDAO();

	public QuestionnaireDAO getQuestionnaireDAO();

	public StudyDAO getStudyDAO();

	public UniverseDAO getUniverseDAO();

	public VariableDefinitionDAO getDataElementDAO();

	// TODO add all the other DAOs
}
