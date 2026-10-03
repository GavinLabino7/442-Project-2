import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VendingMachineTest {

    VendingMachine vendingMachine; 
    VendingMachineItem item1;
    VendingMachineItem item2;
    VendingMachineItem item3;
    VendingMachineItem item4;
    VendingMachineItem item5;

    @BeforeEach 
    void setUp() {
        vendingMachine = new VendingMachine();
        item1 = new VendingMachineItem("Banana", 1.50);
        item2 = new VendingMachineItem("Poptart", 2.50);
        item3 = new VendingMachineItem("Pretzels", 1.00);
        item4 = new VendingMachineItem("Nachos", 3.00);
        item5 = new VendingMachineItem("Hot Dog", 5.00);
        
    }

    @AfterEach
    void tearDown() { 
        vendingMachine = null;
        item1 = null;
        item2 = null;
        item3 = null;
        item4 = null;
        item5 = null;
    } 

    @Test
    void testGetName() {
        assertEquals("Banana", item1.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(1.50, item1.getPrice(), 0.01);
    }

    @Test
    void testAddItem() {
        vendingMachine.addItem(item1, "A");
        assertThrows(VendingMachineException.class, () -> vendingMachine.addItem(item2, "A"));
    }

    @Test
    void testGetBalance() {
         assertEquals(0.0, vendingMachine.getBalance(), 0.01);
    }

    @Test
    void testGetItem() {
        vendingMachine.addItem(item1, "A");
        assertEquals(item1, vendingMachine.getItem("A"));
        assertThrows( VendingMachineException.class, () -> vendingMachine.getItem("E") );

    }

    @Test
    void testInsertMoney() {

    }

    @Test
    void testMakePurchase() {

    }

    @Test
    void testRemoveItem() {

    }

    @Test
    void testReturnChange() {

    }
}
