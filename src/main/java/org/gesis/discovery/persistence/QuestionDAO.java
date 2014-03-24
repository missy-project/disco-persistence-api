package org.gesis.discovery.persistence;

import org.gesis.discovery.Question;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;


/**
 * This interface handles a {@link Question}. Methods which are specific for a
 * {@link Question} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface QuestionDAO extends GenericResourceDAO<Question>, InstantiableDAO
{

}
