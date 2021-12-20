package codegym.controller.model.modelkhachhang.reposire;

import codegym.controller.model.modelkhachhang.bean.Custumer;

import java.util.ArrayList;
import java.util.List;

public class RepositoriesImp implements repositosi {
    private static List<Custumer> list;
    static {
        list= new ArrayList<>();
    list.add(new Custumer("1","1123","thanhtu1","thanhtu1"));
    list.add(new Custumer("2","112312","thanhtu2","thanhtu1"));
    list.add(new Custumer("3","13423","thanhtu3","thanhtu1"));
    list.add(new Custumer("4","14323","thanhtu4","thanhtu1"));
    }
    @Override
    public List<Custumer> findAll() {
        return list;
    }

    @Override
    public Custumer findById(String id) {
        return null;
    }

    @Override
    public void save(Custumer customer) {

    }

    @Override
    public void update(Custumer customer) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public int findId(String id) {
        return 0;
    }
}
