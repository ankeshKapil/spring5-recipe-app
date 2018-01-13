package guru.springframework.service;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

public class RecipeServiceImplTest {
    RecipeService recipeService;
    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        recipeService=new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception {
        Set<Recipe> recipes=new HashSet<>();
        Recipe recipe=new Recipe();
        recipes.add(recipe);
        Mockito.when(recipeRepository.findAll()).thenReturn(recipes);
        Assert.assertEquals(1,recipeService.getRecipes().size());
        Mockito.verify(recipeRepository,Mockito.times(1)).findAll();

    }
}
