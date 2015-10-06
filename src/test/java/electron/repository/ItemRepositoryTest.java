package electron.repository;

import electron.models.Item;
import electron.repositories.ItemRepository;
import org.junit.Test;


import static org.junit.Assert.*;

public class ItemRepositoryTest {

    @Test
    public void shouldBeAbleToAddItemsToRepository() {
        ItemRepository repository = new ItemRepository();
        assertTrue(repository.add(new Item("MicroController")));
    }

    @Test
    public void shouldNotBeAbleToAddNullItemsToRepository() {
        ItemRepository repository = new ItemRepository();
        assertFalse(repository.add(null));
    }

    @Test
    public void repositoryItemsShouldNotBeNull(){
        ItemRepository repository = new ItemRepository();
        assertNotNull("Repository items are null", repository.getAllItems());
    }

    @Test
    public void shouldBeAbleToGetAllItemsFromRepository(){
        ItemRepository repository = new ItemRepository();
        repository.add(new Item("MicroController"));
        repository.add(new Item("MicroController"));
        repository.add(new Item("MicroController"));
        assertEquals(3, repository.getAllItems().size());

    }
}
