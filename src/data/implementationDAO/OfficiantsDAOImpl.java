package data.implementationDAO;

import data.entities.Officiant;
import data.discriptionDAO.OfficiantsDAO;

import java.util.Collection;

public class OfficiantsDAOImpl implements OfficiantsDAO {
    @Override
    public int insert(Officiant officiant) {
        return 0;
    }

    @Override
    public boolean delete(Officiant officiant) {
        return false;
    }

    @Override
    public Officiant findByID(int id) {
        return null;
    }

    @Override
    public boolean update(Officiant officiant) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(Officiant o) {
        return false;
    }

    @Override
    public Collection<Officiant> findByName(String firstName, String secondName) {
        return null;
    }
}
