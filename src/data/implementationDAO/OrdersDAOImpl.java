package data.implementationDAO;

import data.entities.Officiant;
import data.entities.Order;
import data.discriptionDAO.OrdersDAO;

import java.time.LocalDate;
import java.util.Collection;

public class OrdersDAOImpl implements OrdersDAO {
    @Override
    public int insert(Order order) {
        return 0;
    }

    @Override
    public boolean delete(Order order) {
        return false;
    }

    @Override
    public Order findByID(int id) {
        return null;
    }

    @Override
    public boolean update(Order order) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Order order) {
        return false;
    }

    @Override
    public Collection<Order> findByDate(LocalDate date) {
        return null;
    }

    @Override
    public Collection<Order> findByOfficiant(Officiant officiant) {
        return null;
    }
}
