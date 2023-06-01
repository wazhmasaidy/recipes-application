package com.wazhmasaidy.recipe.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

	@Autowired
	private RecipeRepository recipeRepository;
	
	
	public List<RecipeEntity> getAllRecipes(){
		return recipeRepository.findAll();
	}
	
	public RecipeEntity createRecipe(RecipeEntity recipe) {
		return recipeRepository.save(recipe);
	}
	
	public Optional<RecipeEntity> getRecipeById(Long id){
		return recipeRepository.findById(id);
	}
	
	public RecipeEntity updateRecipe(Long id, RecipeEntity recipe) {
		Optional<RecipeEntity> existingRecipe = recipeRepository.findById(id);
		if(existingRecipe.isPresent()) {
			RecipeEntity updatedRecipe = existingRecipe.get();
			updatedRecipe.setName(recipe.getName());
			updatedRecipe.setDesc(recipe.getDesc());
			return recipeRepository.save(updatedRecipe);
		}else {
		      throw new RuntimeException("Recipe not found");
	    }
		
		
	}
	
	
	public void deleteRecipe(Long id) {
	    recipeRepository.deleteById(id);
	  }
	

	
	
	
	
	
	
	
	
}
