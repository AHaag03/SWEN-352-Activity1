package coffeemaker.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coffeemaker.domain.Inventory;
import coffeemaker.domain.Recipe;

public class InventoryTest {
    /**
	 * Component under Test.
	*/
	private Inventory inventory;

	@BeforeEach
	public void setUp() {
		// add setup here
		inventory = new Inventory();
	}

	@AfterEach
	public void tearDown() {
		// add tear down here
		inventory = null;
	}

	@Test
	@DisplayName("Inventory Construction of Coffee. Should set value to 15")
	public void InventoryConstructionCoffee(){
		assertEquals(inventory.getCoffee(), 15);
	}

	@Test
	@DisplayName("Inventory Construction of Milk. Should set value to 15")
	public void InventoryConstructionMilk(){
		assertEquals(inventory.getMilk(), 15);
	}

	@Test
	@DisplayName("Inventory Construction of Sugar. Should set value to 15")
	public void InventoryConstructionSugar(){
		assertEquals(inventory.getSugar(), 15);
	}

	@Test
	@DisplayName("Inventory Construction of Chocolate. Should set value to 15")
	public void InventoryConstructionChocolate(){
		assertEquals(inventory.getChocolate(), 15);
	}

	//==========================//
	//=========Coffee==========//
	//==========================//

	@Test
	@DisplayName("SetCoffeeZero. Tests the ability to set value of Coffee to 0")
	public void SetCoffeeZero(){
		// Test initial construction
		assertEquals(inventory.getCoffee(), 15);
		
		// Test setting to 0
		inventory.setCoffee(0);
		assertEquals(inventory.getCoffee(), 0);
	}

	@Test
	@DisplayName("SetCoffeePositive. Tests the ability to set value of Coffee to a positive value")
	public void SetCoffeePositive(){
		// Test initial construction
		assertEquals(inventory.getCoffee(), 15);
		
		// Test setting to positive integer
		inventory.setCoffee(30);
		assertEquals(inventory.getCoffee(), 30);
	}

	@Test
	@DisplayName("SetCoffeeNegative. Tests the (in)ability to set value of Coffee to a negative value")
	public void SetCoffeeNegative(){
		// Test initial construction
		assertEquals(inventory.getCoffee(), 15);
		
		// Test setting to negative integer (should ignore value)
		inventory.setCoffee(-15);
		assertEquals(inventory.getCoffee(), 15);
	}

	//==========================//
	//=========Milk=============//
	//==========================//

	@Test
	@DisplayName("SetMilkZero. Tests the ability to set value of Milk to 0")
	public void SetMilk(){
		// Test initial construction
		assertEquals(inventory.getMilk(), 15);
		
		// Test setting to 0
		inventory.setMilk(0);
		assertEquals(inventory.getMilk(), 0);
	}

	@Test
	@DisplayName("SetMilkPositive. Tests the ability to set value of Milk to a positive value")
	public void SetMilkPositive(){
		// Test initial construction
		assertEquals(inventory.getMilk(), 15);
		
		// Test setting to positive integer
		inventory.setMilk(30);
		assertEquals(inventory.getMilk(), 30);
	}

	@Test
	@DisplayName("SetMilkNegative. Tests the (in)ability to set value of Milk to a negative value")
	public void SetMilkNegative(){
		// Test initial construction
		assertEquals(inventory.getMilk(), 15);
		
		// Test setting to negative integer (should ignore value)
		inventory.setMilk(-15);
		assertEquals(inventory.getMilk(), 15);
	}

	//==========================//
	//=========Sugar============//
	//==========================//

	@Test
	@DisplayName("SetSugarZero. Tests the ability to set value of Sugar to 0")
	public void SetSugar(){
		// Test initial construction
		assertEquals(inventory.getSugar(), 15);
		
		// Test setting to 0
		inventory.setSugar(0);
		assertEquals(inventory.getSugar(), 0);
	}

	@Test
	@DisplayName("SetSugarPositive. Tests the ability to set value of Sugar to a positive value")
	public void SetSugarPositive(){
		// Test initial construction
		assertEquals(inventory.getSugar(), 15);
		
		// Test setting to positive integer
		inventory.setSugar(30);
		assertEquals(inventory.getSugar(), 30);
	}

	@Test
	@DisplayName("SetSugarNegative. Tests the (in)ability to set value of Sugar to a negative value")
	public void SetSugarNegative(){
		// Test initial construction
		assertEquals(inventory.getSugar(), 15);
		
		// Test setting to negative integer (should ignore value)
		inventory.setSugar(-15);
		assertEquals(inventory.getSugar(), 15);
	}

	//==========================//
	//=========Chocolate========//
	//==========================//

	@Test
	@DisplayName("SetChocolateZero. Tests the ability to set value of Chocolate to 0")
	public void SetChocolate(){
		// Test initial construction
		assertEquals(inventory.getChocolate(), 15);
		
		// Test setting to 0
		inventory.setChocolate(0);
		assertEquals(inventory.getChocolate(), 0);
	}

	@Test
	@DisplayName("SetChocolatePositive. Tests the ability to set value of Chocolate to a positive value")
	public void SetChocolatePositive(){
		// Test initial construction
		assertEquals(inventory.getChocolate(), 15);
		
		// Test setting to positive integer
		inventory.setChocolate(30);
		assertEquals(inventory.getChocolate(), 30);
	}

	@Test
	@DisplayName("SetChocolateNegative. Tests the (in)ability to set value of Chocolate to a negative value")
	public void SetChocolateNegative(){
		// Test initial construction
		assertEquals(inventory.getChocolate(), 15);
		
		// Test setting to negative integer (should ignore value)
		inventory.setChocolate(-15);
		assertEquals(inventory.getChocolate(), 15);
	}

	//==========================//
	//=========Coffee==========//
	//==========================//

	@Test
	@DisplayName("AddCoffeeValid. Tests adding a valid amount of Coffee")
	public void AddCoffeeValid(){
		inventory.addCoffee("10");
		assertEquals(inventory.getCoffee(), 25);
	}

	@Test()
	@DisplayName("AddCoffeeInvalidNull. Tests adding null amount of Coffee")
	public void AddCoffeeInvalidNull(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addCoffee(null);});
	}

	@Test()
	@DisplayName("AddCoffeeInvalidString. Tests adding random string amount of Coffee")
	public void AddCoffeeInvalidString(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addCoffee("value");});
	}

	@Test()
	@DisplayName("AddCoffeeInvalidNegative. Tests adding negative amount of Coffee")
	public void AddCoffeeInvalidNegative(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addCoffee("-10");});
	}

	//==========================//
	//=========Milk=============//
	//==========================//

	@Test
	@DisplayName("AddMilkValid. Tests adding a valid amount of Milk")
	public void AddMilkValid(){
		inventory.addMilk("10");
		assertEquals(inventory.getMilk(), 25);
	}

	@Test()
	@DisplayName("AddMilkInvalidNull. Tests adding null amount of Milk")
	public void AddMilkInvalidNull(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addMilk(null);});
	}

	@Test()
	@DisplayName("AddMilkInvalidString. Tests adding random string amount of Milk")
	public void AddMilkInvalidString(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addMilk("value");});
	}

	@Test()
	@DisplayName("AddMilkInvalidNegative. Tests adding negative amount of Milk")
	public void AddMilkInvalidNegative(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addMilk("-10");});
	}

	//==========================//
	//=========Sugar============//
	//==========================//

	@Test
	@DisplayName("AddSugarValid. Tests adding a valid amount of Sugar")
	public void AddSugarValid(){
		inventory.addSugar("10");
		assertEquals(inventory.getSugar(), 25);
	}

	@Test()
	@DisplayName("AddSugarInvalidNull. Tests adding null amount of Sugar")
	public void AddSugarInvalidNull(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addSugar(null);});
	}

	@Test()
	@DisplayName("AddSugarInvalidString. Tests adding random string amount of Sugar")
	public void AddSugarInvalidString(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addSugar("value");});
	}

	@Test()
	@DisplayName("AddSugarInvalidNegative. Tests adding negative amount of Sugar")
	public void AddSugarInvalidNegative(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addSugar("-10");});
	}

	//==========================//
	//=========Chocolate========//
	//==========================//

	@Test
	@DisplayName("AddChocolateValid. Tests adding a valid amount of Chocolate")
	public void AddChocolateValid(){
		inventory.addChocolate("10");
		assertEquals(inventory.getChocolate(), 25);
	}

	@Test()
	@DisplayName("AddChocolateInvalidNull. Tests adding null amount of Chocolate")
	public void AddChocolateInvalidNull(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addChocolate(null);});
	}

	@Test()
	@DisplayName("AddChocolateInvalidString. Tests adding random string amount of Chocolate")
	public void AddChocolateInvalidString(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addChocolate("value");});
	}

	@Test()
	@DisplayName("AddChocolateInvalidNegative. Tests adding negative amount of Chocolate")
	public void AddChocolateInvalidNegative(){
		assertThrows(coffeemaker.exceptions.InventoryException.class,()->{inventory.addChocolate("-10");});
	}

	@Test()
	@DisplayName("EnoughIngredientsTrue. Tests there are enough ingredients with a basic recipe/inventory")
	public void EnoughIngredientsTrue(){
		// Arrange
		Recipe r = new Recipe();

		// Act/Assert
		assertTrue(inventory.enoughIngredients(r));
	}

	@Test()
	@DisplayName("EnoughIngredientsFalseCoffee. Tests there are not enough ingredients when there is no coffee")
	public void EnoughIngredientsFalseCoffee(){
		// Arrange
		Recipe r = new Recipe();
		r.setAmtCoffee("10");
		inventory.setCoffee(0);

		// Act/Assert
		assertFalse(inventory.enoughIngredients(r));
	}

	@Test()
	@DisplayName("EnoughIngredientsFalseMilk. Tests there are not enough ingredients when there is no milk")
	public void EnoughIngredientsFalseMilk(){
		// Arrange
		Recipe r = new Recipe();
		r.setAmtMilk("10");
		inventory.setMilk(0);

		// Act/Assert
		assertFalse(inventory.enoughIngredients(r));
	}

	@Test()
	@DisplayName("EnoughIngredientsFalseSugar. Tests there are not enough ingredients when there is no sugar")
	public void EnoughIngredientsFalseSugar(){
		// Arrange
		Recipe r = new Recipe();
		r.setAmtSugar("10");
		inventory.setSugar(0);

		// Act/Assert
		assertFalse(inventory.enoughIngredients(r));
	}

	@Test()
	@DisplayName("EnoughIngredientsFalseChocolate. Tests there are not enough ingredients when there is no chocolate")
	public void EnoughIngredientsFalseChocolate(){
		// Arrange
		Recipe r = new Recipe();
		r.setAmtChocolate("10");
		inventory.setChocolate(0);

		// Act/Assert
		assertFalse(inventory.enoughIngredients(r));
	}

	@Test()
	@DisplayName("UseIngredientsFalse. Tests no ingredients are use if there are not enough")
	public void UseIngredientsFalse(){
		// Arrange
		Recipe r = new Recipe();
		r.setAmtChocolate("10");
		inventory.setChocolate(0);

		// Act/Assert
		assertFalse(inventory.useIngredients(r));
	}

	@Test()
	@DisplayName("UseIngredientsTrue. Tests true is returned after using ingredients")
	public void UseIngredientsTrue(){
		// Arrange
		Recipe r = new Recipe();

		// Act/Assert
		assertTrue(inventory.useIngredients(r));
	}

	@Test
	@DisplayName("UseIngredientsValue. Test correct number of ingredients are used")
	public void UseIngredientsValue(){
		// Arrange
		Recipe r = new Recipe();
		r.setAmtCoffee("3");
		r.setAmtMilk("2");
		r.setAmtSugar("10");
		r.setAmtChocolate("5");
		
		// Act
		inventory.useIngredients(r);

		// Assert
		assertEquals(inventory.getCoffee(), 12 );
		assertEquals(inventory.getMilk(), 13 );
		assertEquals(inventory.getSugar(), 5 );
		assertEquals(inventory.getChocolate(), 10 );
	}

	@Test
	@DisplayName("ToString. Tests the ToString Method")
	public void ToString(){
		assertEquals("Coffee: 15\n" + //
						"Milk: 15\n" + //
						"Sugar: 15\n" + //
						"Chocolate: 15\n", inventory.toString());
	}
}
