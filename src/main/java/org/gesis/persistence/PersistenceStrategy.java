package org.gesis.persistence;

import org.gesis.ddi.ontology.persistence.AnalysisUnitDAO;
import org.gesis.ddi.ontology.persistence.CategoryStatisticsDAO;
import org.gesis.ddi.ontology.persistence.ConceptDAO;
import org.gesis.ddi.ontology.persistence.DataFileDAO;
import org.gesis.ddi.ontology.persistence.DescriptiveStatisticsDAO;
import org.gesis.ddi.ontology.persistence.InstrumentDAO;
import org.gesis.ddi.ontology.persistence.LogicalDataSetDAO;
import org.gesis.ddi.ontology.persistence.PeriodOfTimeDAO;
import org.gesis.ddi.ontology.persistence.QuestionDAO;
import org.gesis.ddi.ontology.persistence.QuestionnaireDAO;
import org.gesis.ddi.ontology.persistence.RepresentationDAO;
import org.gesis.ddi.ontology.persistence.StudyDAO;
import org.gesis.ddi.ontology.persistence.StudyGroupDAO;
import org.gesis.ddi.ontology.persistence.SummaryStatisticsDAO;
import org.gesis.ddi.ontology.persistence.UniverseDAO;
import org.gesis.ddi.ontology.persistence.VariableDAO;
import org.gesis.ddi.ontology.persistence.VariableDefinitionDAO;

/**
 * This class is a Factory-class for any DAO that is needed in this application.
 * 
 * @author matthaeus
 * 
 */
public interface PersistenceStrategy
{

	// public void persist(BaseEntity object);

	public <T> T getDAO( Class<T> daoClass );

	public AnalysisUnitDAO getAnalysisUnitDAO();

	public CategoryStatisticsDAO getCategoryStatisticsDAO();

	public ConceptDAO getConceptDAO();

	public DescriptiveStatisticsDAO getDescriptiveStatisticsDAO();

	public InstrumentDAO getInstrumentDAO();

	public LogicalDataSetDAO getLogicalDataSetDAO();

	public QuestionDAO getQuestionDAO();

	public QuestionnaireDAO getQuestionnaireDAO();

	public DataFileDAO getDataFileDAO();

	public PeriodOfTimeDAO getPeriodOfTimeDAO();

	public RepresentationDAO getRepresentationDAO();

	public StudyDAO getStudyDAO();

	public StudyGroupDAO getStudyGroupDAO();

	public SummaryStatisticsDAO getSummaryStatisticsDAO();

	public UniverseDAO getUniverseDAO();

	public VariableDAO getVariableDAO();

	public VariableDefinitionDAO getVariableDefinitionDAO();

}
