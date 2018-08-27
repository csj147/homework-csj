package dao;

import entity.Mobile;

import java.util.ArrayList;
import java.util.List;

public class MobileInMemoryDAO implements MobileDAO {

    private static List<Mobile> mobileDB = new ArrayList<>();

    static{
        mobileDB.add(new Mobile(1,"小米MIX2","8G+128G",5.99,4699,"黑色"));
        mobileDB.add(new Mobile(2,"小米8","8G+128G",6.21,3299,"黑色"));
        mobileDB.add(new Mobile(3,"小米Max3","6G+128G",6.9,1999,"蓝色"));
        mobileDB.add(new Mobile(4,"黑鲨游戏手机","8G+128G",5.99,3199,"黑色"));
    }

    public List<Mobile> listAll(){

        return mobileDB;
    }

    public Mobile add(Mobile mobile){

        if(mobileDB.add(mobile)){

            return mobile;
        }

        return null;
    }

    public boolean delete(int id) {

        for (Mobile mobile : mobileDB) {

            if(mobile.getId() == id) {
                return mobileDB.remove(mobile);
            }
        }

        return false;
    }

    public boolean update(Mobile mobile){

        for(Mobile mobileNew : mobileDB){

            if(mobileNew.getId() == mobile.getId()){
                mobileNew.setName(mobile.getName());
                mobileNew.setStorage(mobile.getStorage());
                mobileNew.setIn(mobile.getIn());
                mobileNew.setMoney(mobile.getMoney());
                mobileNew.setColor(mobile.getColor());

                return true;
            }
        }

        return false;
    }

    public Mobile getMobilesByName(String name){

        for (Mobile mobile : mobileDB) {

            String Name = mobile.getName().toLowerCase();

            if (Name.contains(name.toLowerCase())){

                return mobile;
            }
        }

        return null;
    }

    public Mobile getMobileById(int id) {

        for (Mobile mobile : mobileDB){

            if(mobile.getId() == id){

                return mobile;
            }
        }
        return null;
    }
}
