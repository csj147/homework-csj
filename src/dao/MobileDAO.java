package dao;

import entity.Mobile;

import java.util.List;

public interface MobileDAO {

    List<Mobile> listAll();

    Mobile add(Mobile mobile);

    boolean delete(int id);

    boolean update(Mobile mobile);

    Mobile getMobilesByName(String name);

    Mobile getMobileById(int id);
}
