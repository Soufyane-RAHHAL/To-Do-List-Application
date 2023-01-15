package soufyane.me.toDoListApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soufyane.me.toDoListApplication.model.Item;
import soufyane.me.toDoListApplication.repo.ItemRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ItemService {
    private final ItemRepository itemRepo;
    @Autowired
    public ItemService(ItemRepository itemRepo) {
        this.itemRepo = itemRepo;
    }

    public Item addItem(Item item){
        return itemRepo.save(item);
    }
    public List<Item> findAllItems(){
        return  itemRepo.findAll();
    }
    public Item updateItem(Item employee){
        return itemRepo.save(employee);
    }
    public void deleteItem(String id){
        itemRepo.deleteById(id);
    }
}
