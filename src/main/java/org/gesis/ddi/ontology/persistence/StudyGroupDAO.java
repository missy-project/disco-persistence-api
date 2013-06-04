package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.StudyGroup;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link StudyGroup}. Methods which are specific for a
 * {@link StudyGroup} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface StudyGroupDAO extends GenericDAO<StudyGroup>, DAO
{

}
