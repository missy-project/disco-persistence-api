package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.Questionnaire;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Questionnaire}. Methods which are specific
 * for a {@link Questionnaire} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface QuestionnaireDAO extends GenericDAO<Questionnaire>, DAO
{

}
