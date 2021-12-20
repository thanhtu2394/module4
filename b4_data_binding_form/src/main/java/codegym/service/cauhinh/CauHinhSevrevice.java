package codegym.service.cauhinh;

import codegym.model.cauhinh.CauHinh;

import java.util.List;

public interface CauHinhSevrevice {
    List<CauHinh> findall();
    void update(CauHinh cauHinh);
}
