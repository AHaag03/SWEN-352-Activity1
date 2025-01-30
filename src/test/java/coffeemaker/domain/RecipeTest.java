package coffeemaker.domain;

import coffeemaker.exceptions.RecipeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.CoffeeMaker;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class RecipeTest {
	/**
	 * Component under Test.
	 */
	private CoffeeMaker CuT;

	@BeforeEach
	public void setUp() {
		// add setup here
//		CuT = new CoffeeMaker();
	}

	@AfterEach
	public void tearDown() {
		// add tear down here
//		CuT = null;
	}

	@Test
	@DisplayName("Sample test that just succeeds.  Ignore it.")
	public void tautology() {
		assertTrue(true, "Always pass.");
	}

	@Test
	@DisplayName("Test the Recipe Initialization")
	public void testInitialize() {
		Recipe recipe = new Recipe();
		assert recipe.getName().isEmpty();
		assert recipe.getPrice() == 0;
		assert recipe.getAmtCoffee() == 0;
		assert recipe.getAmtMilk() == 0;
		assert recipe.getAmtSugar() == 0;
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testGetName() {
		Recipe recipe = new Recipe();
		assert recipe.getName().isEmpty();
	}

	@Test
	public void testSetName() {
		Recipe recipe = new Recipe();
		recipe.setName("New Name");
		assert recipe.getName().equals("New Name");
	}

	@Test
	public void testSetNameNull() {
		Recipe recipe = new Recipe();
		recipe.setName(null);
		// Default name is empty so check to make sure the name is still empty
		assert recipe.getName().isEmpty();
	}

	@Test
	public void testGetPrice() {
		Recipe recipe = new Recipe();
		assert recipe.getPrice() == 0;
	}

	@Test
	public void testSetPriceNull() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setPrice(null);
		});
		// Make sure the amount milk is still 0
		assert recipe.getPrice() == 0;
	}

	@Test
	public void testSetPricePositiveInteger() {
		Recipe recipe = new Recipe();
		recipe.setPrice("100");
		assert recipe.getPrice() == 100;
	}

	@Test
	public void testSetPriceNegativeInteger() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setPrice("-1");
		});
		// Make sure the price is still 0
		assert recipe.getPrice() == 0;
	}

	@Test
	public void testSetPricePositiveDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setPrice("10.3");
		});
		// Make sure the price is still 0
		assert recipe.getPrice() == 0;
	}

	@Test
	public void testSetPriceNegativeDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setPrice("-1.3");
		});
		// Make sure the price is still 0
		assert recipe.getPrice() == 0;
	}

	@Test
	public void testSetPriceZero() {
		Recipe recipe = new Recipe();
		recipe.setPrice("0");
		assert recipe.getPrice() == 0;
	}

	@Test
	public void testGetAmtCoffee() {
		Recipe recipe = new Recipe();
		// Default value for an initialized recipe is 0 for Amount Coffee
		assert recipe.getAmtCoffee() == 0;
	}

	@Test
	public void testSetAmtCoffeeNull() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtCoffee(null);
		});
		// Make sure the amount milk is still 0
		assert recipe.getAmtCoffee() == 0;
	}

	@Test
	public void testSetAmtCoffeePositiveInteger() {
		Recipe recipe = new Recipe();
		recipe.setAmtCoffee("100");
		assert recipe.getAmtCoffee() == 100;
	}

	@Test
	public void testSetAmtCoffeeNegativeInteger() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtCoffee("-1");
		});
		// Make sure the amount coffee is still 0
		assert recipe.getAmtCoffee() == 0;
	}

	@Test
	public void testSetAmtCoffeePositiveDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtCoffee("10.3");
		});
		// Make sure the amount coffee is still 0
		assert recipe.getAmtCoffee() == 0;
	}

	@Test
	public void testSetAmtCoffeeNegativeDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtCoffee("-1.3");
		});
		// Make sure the amount coffee is still 0
		assert recipe.getAmtCoffee() == 0;
	}

	@Test
	public void testSetAmtCoffeeZero() {
		Recipe recipe = new Recipe();
		recipe.setAmtCoffee("0");
		assert recipe.getAmtCoffee() == 0;
	}

	@Test
	public void testGetAmtMilk() {
		Recipe recipe = new Recipe();
		// Default value for an initialized recipe is 0 for Amount Milk
		assert recipe.getAmtMilk() == 0;
	}

	@Test
	public void testSetAmtMilkNull() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtMilk(null);
		});
		// Make sure the amount milk is still 0
		assert recipe.getAmtMilk() == 0;
	}

	@Test
	public void testSetAmtMilkPositiveInteger() {
		Recipe recipe = new Recipe();
		recipe.setAmtMilk("100");
		assert recipe.getAmtMilk() == 100;
	}

	@Test
	public void testSetAmtMilkNegativeInteger() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtMilk("-1");
		});
		// Make sure the amount milk is still 0
		assert recipe.getAmtMilk() == 0;
	}

	@Test
	public void testSetAmtMilkPositiveDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtMilk("10.3");
		});
		// Make sure the amount milk is still 0
		assert recipe.getAmtMilk() == 0;
	}

	@Test
	public void testSetAmtMilkNegativeDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtMilk("-1.3");
		});
		// Make sure the amount milk is still 0
		assert recipe.getAmtMilk() == 0;
	}

	@Test
	public void testSetAmtMilkZero() {
		Recipe recipe = new Recipe();
		recipe.setAmtMilk("0");
		assert recipe.getAmtMilk() == 0;
	}

	@Test
	public void testGetAmtSugar() {
		Recipe recipe = new Recipe();
		// Default value for an initialized recipe is 0 for amount sugar
		assert recipe.getAmtSugar() == 0;
	}

	@Test
	public void testSetAmtSugarNull() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtSugar(null);
		});
		// Make sure the amount sugar is still 0
		assert recipe.getAmtSugar() == 0;
	}

	@Test
	public void testSetAmtSugarPositiveInteger() {
		Recipe recipe = new Recipe();
		recipe.setAmtSugar("100");
		assert recipe.getAmtSugar() == 100;
	}

	@Test
	public void testSetAmtSugarNegativeInteger() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtSugar("-1");
		});
		// Make sure the amount sugar is still 0
		assert recipe.getAmtSugar() == 0;
	}

	@Test
	public void testSetAmtSugarPositiveDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtSugar("10.3");
		});
		// Make sure the amount sugar is still 0
		assert recipe.getAmtSugar() == 0;
	}

	@Test
	public void testSetAmtSugarNegativeDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtSugar("-1.3");
		});
		// Make sure the amount sugar is still 0
		assert recipe.getAmtSugar() == 0;
	}

	@Test
	public void testSetAmtSugarZero() {
		Recipe recipe = new Recipe();
		recipe.setAmtSugar("0");
		assert recipe.getAmtSugar() == 0;
	}

	@Test
	public void testGetAmtChocolate() {
		Recipe recipe = new Recipe();
		// Default value for an initialized recipe is 0 for amount chocolate
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testSetAmtChocolatePositiveInteger() {
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("100");
		assert recipe.getAmtChocolate() == 100;
	}

	@Test
	public void testSetAmtChocolateNull() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtChocolate(null);
		});
		// Make sure the amount chocolate is still 0
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testSetAmtChocolateNegativeInteger() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtChocolate("-1");
		});
		// Make sure the amount chocolate is still 0
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testSetAmtChocolatePositiveDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtChocolate("10.3");
		});
		// Make sure the amount chocolate is still 0
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testSetAmtChocolateNegativeDouble() {
		Recipe recipe = new Recipe();
		assertThrows(RecipeException.class, () -> {
			recipe.setAmtChocolate("-1.3");
		});
		// Make sure the amount chocolate is still 0
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testSetAmtChocolateZero() {
		Recipe recipe = new Recipe();
		recipe.setAmtChocolate("0");
		assert recipe.getAmtChocolate() == 0;
	}

	@Test
	public void testRecipeEqualsBlankRecipes() {
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();
		assert recipe1.equals(recipe2);
	}

	@Test
	public void testRecipeEqualsNull() {
		Recipe recipe1 = new Recipe();
		recipe1.setName("Recipe 1");

		// Should not be equal
		assert !recipe1.equals(null);
	}

	@Test
	public void testRecipeEqualsSelfNullName() throws NoSuchFieldException, IllegalAccessException {
		// This test function uses reflection to change the private field Name within a recipe class.
		// This is performed to properly test the branch of code where a name is null.
		// Because proper checks are in place on the setName function, this reflection is required to get the value to null
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();

		Field nameField = Recipe.class.getDeclaredField("name");
		nameField.setAccessible(true);  // Allow access to private name

		// Set the value of name to null
		nameField.set(recipe1, null);

		assert !recipe1.equals(recipe2);
	}

	@Test
	public void testRecipeEqualsBothNullName() throws NoSuchFieldException, IllegalAccessException {
		// This test function uses reflection to change the private field Name within a recipe class.
		// This is performed to properly test the branch of code where a name is null.
		// Because proper checks are in place on the setName function, this reflection is required to get the value to null
		Recipe recipe1 = new Recipe();
		Recipe recipe2 = new Recipe();

		Field nameField = Recipe.class.getDeclaredField("name");
		nameField.setAccessible(true);  // Allow access to private name

		// Set the value of the name to null
		nameField.set(recipe1, null);
		nameField.set(recipe2, null);

		// Since both names are null they are equal
		assert recipe1.equals(recipe2);
	}



	@Test
	public void testRecipeEqualsWrongClass() {
		Recipe recipe1 = new Recipe();
		recipe1.setName("Recipe 1");
		String testString = "Recipe 1";

		// Should not be equal
		assert !recipe1.equals(testString);
	}

	@Test
	public void testRecipeEqualsDifferentName() {
		Recipe recipe1 = new Recipe();
		recipe1.setName("Recipe 1");

		Recipe recipe2 = new Recipe();
		recipe2.setName("Recipe 2");

		// Should not be equal
		assert !recipe1.equals(recipe2);
	}

	@Test
	public void testRecipeToString() {
		Recipe recipe1 = new Recipe();
		recipe1.setName("Recipe 1");
		assert recipe1.toString().equals("Recipe{Recipe 1}");
	}

	@Test
	public void testRecipeHashCode() {
		Recipe recipe1 = new Recipe();
		recipe1.setName("Recipe 1");

		Recipe recipe2 = new Recipe();
		recipe2.setName("Recipe 2");

		assert recipe1.hashCode() != recipe2.hashCode();
	}

	@Test
	public void testRecipeHashCodeNullName() throws NoSuchFieldException, IllegalAccessException {
		// This test function uses reflection to change the private field Name within a recipe class.
		// This is performed to properly test the branch of code where a name is null.
		// Because proper checks are in place on the setName function, this reflection is required to get the value to null
		Recipe recipe1 = new Recipe();

		Field nameField = Recipe.class.getDeclaredField("name");
		nameField.setAccessible(true);  // Allow access to private name

		// Set the value of the name to null
		nameField.set(recipe1, null);

		assertDoesNotThrow(recipe1::hashCode);
	}

}