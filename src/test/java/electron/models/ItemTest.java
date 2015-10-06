package electron.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void itemDescriptionShouldNotBeNull(){
        Item item = new Item(null);
        assertNotNull(item.getDescription());
    }

    @Test
    public void shouldBeAble(){
        String description = "description";
        Item item = new Item(description);
        assertEquals(description, item.getDescription());
    }

}