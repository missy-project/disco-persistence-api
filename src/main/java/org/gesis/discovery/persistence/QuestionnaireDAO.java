package org.gesis.discovery.persistence;

import org.gesis.discovery.Questionnaire;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link Questionnaire}. Methods which are specific
 * for a {@link Questionnaire} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface QuestionnaireDAO extends GenericDAO<Questionnaire>, InstantiableDAO
{

}
