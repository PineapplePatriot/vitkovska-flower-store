package laboratories;
import java.util.List;
import java.util.ArrayList;

public class Store {
    private List<Item> items;
    public List<Item> search(SearchFilter filter) {
        List<Item> foundItems = new ArrayList<>();
        for (Item item: items) {
            if (filter.match(item)) {
                foundItems.add(item);
            }
        }
        return foundItems;
    }
}
