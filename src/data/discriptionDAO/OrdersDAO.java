package data.discriptionDAO;

import data.entities.Officiant;
import data.entities.Order;

import java.time.LocalDate;
import java.util.Collection;

public interface OrdersDAO {
    public int insert(Order order);

    public boolean delete(Order order);

    public Order findByID(int id);

    public boolean update(Order order);

    public boolean saveOrUpdate(Order order);

    public Collection<Order> findByDate(LocalDate date);

    public Collection<Order> findByOfficiant(Officiant officiant);
}
