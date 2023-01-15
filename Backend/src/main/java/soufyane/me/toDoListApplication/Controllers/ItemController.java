package soufyane.me.toDoListApplication.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import soufyane.me.toDoListApplication.model.Item;
import soufyane.me.toDoListApplication.services.ItemService;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping("/")
    public List<Item> getAllItems(){
        return itemService.findAllItems();
    }
}
