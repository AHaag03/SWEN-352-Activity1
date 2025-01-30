package coffeemaker.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Recipe;
import coffeemaker.domain.RecipeBook;

public class RecipeBookTest {
    /**
	 * Component under Test.
	 */
	private RecipeBook CuT;
    private Recipe mockRecipe;

	@BeforeEach
	public void setUp() {
		// add setup here
        mockRecipe = new Recipe();
        mockRecipe.setName("Mock");
        mockRecipe.setPrice("10");
        mockRecipe.setAmtCoffee("9");
        mockRecipe.setAmtMilk("8");
        mockRecipe.setAmtSugar("7");
        mockRecipe.setAmtChocolate("6");

        CuT = new RecipeBook();
	}

	@AfterEach
	public void tearDown() {
		// add tear down here
        mockRecipe = null;
        CuT = null;
	}

	@Test
	@DisplayName("addOneRecipeTest")
	public void addOneRecipeTest() {
		boolean result = CuT.addRecipe(mockRecipe);
        assertTrue(result);
	}

    @Test
    @DisplayName("addMultipleRecipesTest")
    public void addMultipleRecipesTest() {
        Recipe recipe1 = new Recipe();
        CuT.addRecipe(recipe1);
        Recipe recipe2 = new Recipe();
        CuT.addRecipe(recipe2);
        Recipe recipe3 = new Recipe();
        CuT.addRecipe(recipe3);
        boolean result = CuT.addRecipe(mockRecipe);
        assertTrue(result);
    }

    @Test
    @DisplayName("addTooManyRecipesTest")
    public void addTooManyRecipesTest() {
        Recipe recipe1 = new Recipe();
        recipe1.setName("Recipe 1");
        CuT.addRecipe(recipe1);
        Recipe recipe2 = new Recipe();
        recipe2.setName("Recipe 2");
        CuT.addRecipe(recipe2);
        Recipe recipe3 = new Recipe();
        recipe3.setName("Recipe 3");
        CuT.addRecipe(recipe3);
        Recipe recipe4 = new Recipe();
        recipe4.setName("Recipe 4");
        CuT.addRecipe(recipe4);
        boolean result = CuT.addRecipe(mockRecipe);
        assertFalse(result);
    }

    @Test
    @DisplayName("addDuplicateRecipeTest")
    public void addDuplicateRecipeTest() {
        CuT.addRecipe(mockRecipe);
        boolean result = CuT.addRecipe(mockRecipe);
        assertFalse(result);
    }

    @Test
    @DisplayName("addNullRecipeTest")
    public void addNullRecipeTest() {
        boolean result = CuT.addRecipe(null);
        assertFalse(result);
    }

    @Test
    @DisplayName("deleteOneRecipeTest")
    public void deleteOneRecipeTest() {
        CuT.addRecipe(mockRecipe);
        String result = CuT.deleteRecipe(0);
        assertEquals(mockRecipe.getName(), result);
    }

    @Test
    @DisplayName("deleteNullRecipeTest")
    public void deleteNullRecipeTest() {
        String result = CuT.deleteRecipe(0);
        assertEquals(null, result);
    }

    @Test
    @DisplayName("deleteRecipeTest")
    public void deleteRecipeTest() {
        CuT.addRecipe(mockRecipe);
        String result = CuT.deleteRecipe(0);
        assertEquals(mockRecipe.getName(), result);
    }

    @Test
    @DisplayName("deleteHighOOBRecipeTest")
    public void deleteHighOutOfBoundsRecipeTest() {
        String result = CuT.deleteRecipe(5); // Max size of RecipeBook is 4
        assertEquals(null, result);
    }

    @Test
    @DisplayName("deleteLowOOBRecipeTest")
    public void deleteLowOOBRecipeTest() {
        String result = CuT.deleteRecipe(-1);
        assertEquals(null, result);
    }

    @Test
    @DisplayName("replaceRecipeTest")
    public void replaceRecipeTest() {
        CuT.addRecipe(mockRecipe);
        Recipe newRecipe = new Recipe();
        newRecipe.setName("NewRecipe");
        String result = CuT.replaceRecipe(0, newRecipe);
        assertEquals(mockRecipe.getName(), result);
    }

    @Test
    @DisplayName("replaceHighOOBRecipeTest")
    public void replaceHighOOBRecipeTest() {
        String result = CuT.replaceRecipe(-1, mockRecipe);
        assertEquals(null, result);
    }

    @Test
    @DisplayName("replaceLowOOBRecipeTest")
    public void replaceLowOOBRecipeTest() {
        String result = CuT.replaceRecipe(5, mockRecipe);
        assertEquals(null, result);
    }

    @Test
    @DisplayName("replaceNullRecipeTest")
    public void replaceNullRecipeTest() {
        String result = CuT.replaceRecipe(1, mockRecipe);
        assertEquals(null, result);
    }
}
