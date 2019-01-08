package data.discriptionDAO;

import data.entities.Officiant;

import java.util.Collection;

public interface OfficiantsDAO {
    public int insert(Officiant officiant);

    public boolean delete(Officiant officiant);

    public Officiant findByID(int id);

    public boolean update(Officiant officiant);

    public boolean saveOrUpdate(Officiant o);

    public Collection<Officiant> findByName(String firstName, String secondName);
}
