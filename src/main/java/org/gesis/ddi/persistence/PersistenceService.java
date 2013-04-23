package org.gesis.ddi.persistence;


/**
 * The persistence service wraps the persistence strategy, which represents the
 * actual implementation of the persistence method.
 * 
 * @author matthaeus
 * 
 */
public class PersistenceService {

	private PersistenceStrategy persistenceStrategy;

	/* is going to be injected */
	public void setPersistenceStrategy(PersistenceStrategy strategy) {
		this.persistenceStrategy = strategy;
	}

	public PersistenceStrategy getPersistenceStrategy() {
		return this.persistenceStrategy;
	}
}
