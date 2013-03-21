package org.gesis.ddi.persistence;


public class PersistenceService {

	private PersistenceStrategy persistenceStrategy;

	public void setPersistenceStrategy(PersistenceStrategy strategy) {
		this.persistenceStrategy = strategy;
	}

	public PersistenceStrategy getPersistenceStrategy() {
		return this.persistenceStrategy;
	}
}
