package com.vinaykolusu.springSample.gitSpringCollections.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Customer {

	private List<Object> lists;
	public List<Object> getLists() {
		return lists;
	}
	public void setLists(List<Object> customerLists) {
		this.lists = customerLists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public void setSets(Set<Object> customerSets) {
		this.sets = customerSets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<Object, Object> customerMaps) {
		this.maps = customerMaps;
	}
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties customerProps) {
		this.pros = customerProps;
	}
	private Set<Object> sets;
	private Map<Object,Object> maps;
	private Properties pros;
	
	
	@Override
	public String toString() {
		return "Customer [lists=" + lists + ", sets=" + sets + ", maps=" + maps
				+ ", pros=" + pros + "]";
	}
}
