package com.wazhmasaidy.recipe.resource;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class CategoryEntity {

	@Id
	private Long id;
	
	private String name;
	
//	@ManyToMany(mappedBy = "catagories")
//	private Set<RecipeEntity> recepes = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Set<RecipeEntity> getRecepes() {
//		return recepes;
//	}
//
//	public void setRecepes(Set<RecipeEntity> recepes) {
//		this.recepes = recepes;
//	}
	
	
}
