package com.wazhmasaidy.recipe.resource;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;

@Entity
public class RecipeEntity {

	@Id
	private Long id;
	
	private String name;
	
	private String desc;
	
	@Lob
	private String ingred;
	
	@Lob
	private String direc;
	
//	@ManyToMany(mappedBy = "recepes")
//	private Set<CatagoryEntity> catagories = new HashSet<>();

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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIngred() {
		return ingred;
	}

	public void setIngred(String ingred) {
		this.ingred = ingred;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}

//	public Set<CatagoryEntity> getCatagory() {
//		return catagories;
//	}
//
//	public void setCatagory(Set<CatagoryEntity> catagory) {
//		this.catagories = catagory;
//	}
//	
	
	
}
