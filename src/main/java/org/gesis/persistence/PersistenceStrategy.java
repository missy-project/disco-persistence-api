package org.gesis.persistence;

import org.gesis.dcterms.persistence.PeriodOfTimeDAO;
import org.gesis.discovery.persistence.AnalysisUnitDAO;
import org.gesis.discovery.persistence.CategoryStatisticsDAO;
import org.gesis.discovery.persistence.DataFileDAO;
import org.gesis.discovery.persistence.DescriptiveStatisticsDAO;
import org.gesis.discovery.persistence.InstrumentDAO;
import org.gesis.discovery.persistence.LogicalDataSetDAO;
import org.gesis.discovery.persistence.QuestionDAO;
import org.gesis.discovery.persistence.QuestionnaireDAO;
import org.gesis.discovery.persistence.RepresentationDAO;
import org.gesis.discovery.persistence.RepresentedVariableDAO;
import org.gesis.discovery.persistence.StudyDAO;
import org.gesis.discovery.persistence.StudyGroupDAO;
import org.gesis.discovery.persistence.SummaryStatisticsDAO;
import org.gesis.discovery.persistence.UniverseDAO;
import org.gesis.discovery.persistence.VariableDAO;
import org.gesis.rdf.persistence.ListDAO;
import org.gesis.rdfs.persistence.ResourceDAO;
import org.gesis.skos.persistence.ConceptDAO;
import org.gesis.skos.persistence.ConceptSchemeDAO;
import org.gesis.skos.persistence.OrderedCollectionDAO;


/**
 * This class is a Factory-class for any DAO that is needed in this application.
 *
 * @author matthaeus
 *
 */
public interface PersistenceStrategy
{

	public InstantiableDAO getDAO( Class<?> clazz );
	
	public AnalysisUnitDAO getAnalysisUnitDAO();

	public CategoryStatisticsDAO getCategoryStatisticsDAO();

	public ConceptDAO getConceptDAO();

	public ConceptSchemeDAO getConceptSchemeDAO();

	public DescriptiveStatisticsDAO getDescriptiveStatisticsDAO();

	public InstrumentDAO getInstrumentDAO();

	public ListDAO getListDAO();

	public LogicalDataSetDAO getLogicalDataSetDAO();

	public QuestionDAO getQuestionDAO();

	public QuestionnaireDAO getQuestionnaireDAO();

	public DataFileDAO getDataFileDAO();

	public PeriodOfTimeDAO getPeriodOfTimeDAO();

	public RepresentationDAO getRepresentationDAO();

	public ResourceDAO getResourceDAO();

	public OrderedCollectionDAO getOrderedCollectionDAO();

	public StudyDAO getStudyDAO();

	public StudyGroupDAO getStudyGroupDAO();

	public SummaryStatisticsDAO getSummaryStatisticsDAO();

	public UniverseDAO getUniverseDAO();

	public VariableDAO getVariableDAO();

	public RepresentedVariableDAO getRepresentedVariableDAO();

}
