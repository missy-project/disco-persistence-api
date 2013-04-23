package org.gesis.ddi.persistence;

import org.gesis.ddi.persistence.dataAccess.AnalysisUnitDAO;
import org.gesis.ddi.persistence.dataAccess.CategoryStatisticsDAO;
import org.gesis.ddi.persistence.dataAccess.ConceptDAO;
import org.gesis.ddi.persistence.dataAccess.DataFileDAO;
import org.gesis.ddi.persistence.dataAccess.DescriptiveStatisticsDAO;
import org.gesis.ddi.persistence.dataAccess.IdentifiableDAO;
import org.gesis.ddi.persistence.dataAccess.InstrumentDAO;
import org.gesis.ddi.persistence.dataAccess.LogicalDataSetDAO;
import org.gesis.ddi.persistence.dataAccess.QuestionDAO;
import org.gesis.ddi.persistence.dataAccess.QuestionnaireDAO;
import org.gesis.ddi.persistence.dataAccess.RepresentationDAO;
import org.gesis.ddi.persistence.dataAccess.StudyDAO;
import org.gesis.ddi.persistence.dataAccess.StudyGroupDAO;
import org.gesis.ddi.persistence.dataAccess.SummaryStatisticsDAO;
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

	public AnalysisUnitDAO getAnalysisUnitDAO();

	public CategoryStatisticsDAO getCategoryStatisticsDAO();

	public ConceptDAO getConceptDAO();

	public DescriptiveStatisticsDAO getDescriptiveStatisticsDAO();

	public IdentifiableDAO getIdentifiableDAO();

	public InstrumentDAO getInstrumentDAO();

	public LogicalDataSetDAO getLogicalDataSetDAO();

	public QuestionDAO getQuestionDAO();

	public QuestionnaireDAO getQuestionnaireDAO();

	public DataFileDAO getDataFileDAO();

	public RepresentationDAO getRepresentationDAO();

	public StudyDAO getStudyDAO();

	public StudyGroupDAO getStudyGroupDAO();

	public SummaryStatisticsDAO getSummaryStatisticsDAO();

	public UniverseDAO getUniverseDAO();

	public VariableDAO getVariableDAO();

	public VariableDefinitionDAO getDataElementDAO();

}
