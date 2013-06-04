package org.gesis.ddi.ontology.persistence;

import org.gesis.ddi.ontology.DataFile;
import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;

/**
 * This interface handles a {@link DataFile}. Methods which are specific for a
 * {@link DataFile} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface DataFileDAO extends GenericDAO<DataFile>, DAO
{

}
