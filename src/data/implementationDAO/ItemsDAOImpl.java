package data.implementationDAO;

import data.entities.Item;
import data.entities.Officiant;
import data.discriptionDAO.ItemsDAO;

import java.util.Collection;

public class ItemsDAOImpl implements ItemsDAO {
    @Override
    public int insert(Item item) {
        return 0;
    }

    @Override
    public boolean delete(Item item) {
        return false;
    }

    @Override
    public Officiant findByID(int id) {
        return null;
    }

    @Override
    public boolean update(Item item) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Item item) {
        return false;
    }

    @Override
    public Collection<Item> findByName(String name) {
        return null;
    }

    @Override
    public Collection<Item> findByCost(Double cost) {
        return null;
    }
}
