import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VendingMachineTest {

    VendingMachineItem item;

    @BeforeEach 
    void setUp() {
        item = new VendingMachineItem("Banana", 1.50);
    }

    @AfterEach
    void tearDown() {
        item = null;
    } 

    @Test
    void testGetName() {
        assertEquals("Banana", item.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(1.50, item.getPrice(), 0.01);
    }

    @ParameterizedTest
    @CsvSource () 
    void testAddItem() {

    }

    @Test
    void testGetBalance() {

    }

    @Test
    void testGetItem() {

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
