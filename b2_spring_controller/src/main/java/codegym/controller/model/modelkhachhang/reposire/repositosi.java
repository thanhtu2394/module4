package codegym.controller.model.modelkhachhang.reposire;

import codegym.controller.model.modelkhachhang.bean.Custumer;

import java.util.List;

public interface repositosi {
    List<Custumer> findAll();
    Custumer findById(String id);
    void save(Custumer customer);
    void update(Custumer customer);
    void delete(String id);
    int findId(String id);
}
