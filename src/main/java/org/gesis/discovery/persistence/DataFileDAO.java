package org.gesis.discovery.persistence;

import org.gesis.discovery.DataFile;
import org.gesis.persistence.GenericResourceDAO;
import org.gesis.persistence.InstantiableDAO;

/**
 * This interface handles a {@link DataFile}. Methods which are specific for a
 * {@link DataFile} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface DataFileDAO extends GenericResourceDAO<DataFile>, InstantiableDAO
{

}
