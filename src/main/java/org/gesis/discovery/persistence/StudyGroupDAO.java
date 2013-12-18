package org.gesis.discovery.persistence;

import org.gesis.discovery.StudyGroup;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link StudyGroup}. Methods which are specific for a
 * {@link StudyGroup} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface StudyGroupDAO extends GenericDAO<StudyGroup>, InstantiableDAO
{

}
