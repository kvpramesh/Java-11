package test.java.com.mcapi;

import static org.junit.jupiter.api.Assertions.*;
import main.java.com.mcapi.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartAmountTest {
	
	ShoppingCart cart = new ShoppingCart();

	@BeforeEach
	void setUp() throws Exception {
		// creates new items with product name and unit price
	    Item i1 = new Item("A", 4, 15.0);
	    Item i2 = new Item("B", 3, 9.0);
	    
	    /* add the item to the cart */
	    cart.addToCart(i1);
	    cart.addToCart(i2);
	}

	@Test
	void test() {
		assertEquals(73.5, cart.getTotalAmount_example1());
	}

}
