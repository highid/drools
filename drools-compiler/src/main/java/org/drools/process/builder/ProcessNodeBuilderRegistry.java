package org.drools.process.builder;

import java.util.HashMap;
import java.util.Map;

import org.drools.ruleflow.core.Node;

public class ProcessNodeBuilderRegistry {
	private Map<Class<? extends Node>, ProcessNodeBuilder> registry;
	
	public ProcessNodeBuilderRegistry() {
		this.registry = new HashMap<Class<? extends Node>, ProcessNodeBuilder>();
	}
	
	public void  register(Class<? extends Node> cls, ProcessNodeBuilder builder) {
		this.registry.put(cls, builder);
	}
	
	public ProcessNodeBuilder getNodeBuilder(Node node) {
		return this.registry.get( node.getClass() );
	}
}