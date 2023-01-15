package soufyane.me.toDoListApplication.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import soufyane.me.toDoListApplication.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {

}
