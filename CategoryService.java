package com.wazhmasaidy.recipe.resource;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository catagoryRepository;
	
	
	public List<CategoryEntity> getAllCatagories(){
		return catagoryRepository.findAll();
		
	}
	
	public CategoryEntity setCatagory(CategoryEntity catagory) {
		return catagoryRepository.save(catagory);
	}
	
	public Optional<CategoryEntity> getCatagoryById(Long id) {
		return catagoryRepository.findById(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}

