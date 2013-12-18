package org.gesis.discovery.persistence;

import org.gesis.discovery.DataFile;
import org.gesis.persistence.InstantiableDAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link DataFile}. Methods which are specific for a
 * {@link DataFile} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface DataFileDAO extends GenericDAO<DataFile>, InstantiableDAO
{

}
