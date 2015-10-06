package electron.repositories;

import electron.models.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    private List<Item> items;

    public ItemRepository(){
        items = new ArrayList<>();
    }

    public boolean add(Item item) {
        if(item == null)
            return false;
        items.add(item);
        return true;
    }

    public List<Item> getAllItems() {
        return items;
    }
}
