package org.gesis.ddi.ontology.persistence;

import org.gesis.persistence.DAO;
import org.gesis.persistence.GenericDAO;
import org.gesis.skos.Concept;

/**
 * This interface handles a {@link Concept}. Methods which are specific for a
 * {@link Concept} should go in here.
 * 
 * @author matthaeus
 * 
 */
public interface ConceptDAO extends GenericDAO<Concept>, DAO
{

}
