package org.gesis.discovery.persistence;

import org.gesis.discovery.StudyGroup;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link StudyGroup}. Methods which are specific for a
 * {@link StudyGroup} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface StudyGroupDAO extends GenericResourceDAO<StudyGroup>, InstantiableDAO
{

}
