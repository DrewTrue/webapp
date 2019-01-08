package data.discriptionDAO;

import data.entities.Item;
import data.entities.Officiant;

import java.util.Collection;

public interface ItemsDAO {
    public int insert(Item item);

    public boolean delete(Item item);

    public Officiant findByID(int id);

    public boolean update(Item item);

    public boolean saveOrUpdate(Item item);

    public Collection<Item> findByName(String name);

    public Collection<Item> findByCost(Double cost);
}
