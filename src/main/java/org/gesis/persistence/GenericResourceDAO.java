package org.gesis.persistence;

import org.gesis.rdf.LangString;
import org.gesis.rdfs.Resource;

/**
 * Extends the <i>GenericDAO</i>-interface by attributes which are specific to
 * {@link Resource}-types, e.g. a <i>URN</i> or <i>prefLabel</i>.
 * 
 * @author matthaeus
 * 
 * @param <T>
 */
public interface GenericResourceDAO<T extends Resource> extends GenericDAO<T>
{

	/**
	 * Returns the object by the <i>URN</i> given. The <i>URN</i> is considered the
	 * functional identifier for an object.
	 * 
	 * @param urn
	 * @return
	 */
	T getByURN( String urn );

	/**
	 * Returns the object by its <i>prefLabel</i>. Each object has a preferred
	 * label, due to the fact that each object is-a {@link Resource}.
	 * 
	 * @param prefLabel
	 * @return
	 */
	T getByPrefLabel( LangString prefLabel );

}
