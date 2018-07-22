package com.example.entity;

import java.net.URI;
import java.util.Map;

public class CMSItem {

	private URI id;

	private Map<URI, Object> properties;

	public Map<URI, Object> getProperties() {
		return properties;
	}

	public void setProperties(Map<URI, Object> properties) {
		this.properties = properties;
	}

	public void setProperty(URI uri, Object object) {
		properties.put(uri, object);
	}

	public URI getId() {
		return id;
	}

	public void setId(URI id) {
		this.id = id;
	}

}
