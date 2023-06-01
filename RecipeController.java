package com.wazhmasaidy.recipe.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recipes") 
public class RecipeController {

	@Autowired
	private RecipeService recipeService;
	
	
	@GetMapping("/get")
	public List<RecipeEntity> getAllRecipes(){
		return recipeService.getAllRecipes();
	}
	
	
	@PostMapping("/add")
	public RecipeEntity createRecipe(@RequestBody RecipeEntity recipe) {
		return recipeService.createRecipe(recipe);
	}
	
	 @GetMapping("/{id}")
	  public ResponseEntity<RecipeEntity> getRecipeById(@PathVariable("id") Long id) {
	    Optional<RecipeEntity> recipeOptional = recipeService.getRecipeById(id);
	    if (recipeOptional.isPresent()) {
	      return ResponseEntity.ok(recipeOptional.get());
	    } else {
	      return ResponseEntity.notFound().build();
	    }
	  }
	  
	  @PutMapping("/{id}")
	  public ResponseEntity<RecipeEntity> updateRecipe(@PathVariable("id") Long id, @RequestBody RecipeEntity recipe) {
	    RecipeEntity updatedRecipe = recipeService.updateRecipe(id, recipe);
	    return ResponseEntity.ok(updatedRecipe);
	  }
	  
	  @DeleteMapping("/{id}")
	  public ResponseEntity<Void> deleteRecipe(@PathVariable("id") Long id) {
	    recipeService.deleteRecipe(id);
	    return ResponseEntity.noContent().build();
	  }
	
}
