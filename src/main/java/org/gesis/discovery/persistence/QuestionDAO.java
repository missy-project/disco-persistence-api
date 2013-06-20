package org.gesis.discovery.persistence;

import org.gesis.discovery.Question;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;


/**
 * This interface handles a {@link Question}. Methods which are specific for a
 * {@link Question} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface QuestionDAO extends GenericDAO<Question>, DAO
{

}
