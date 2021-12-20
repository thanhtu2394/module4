package codegym.service.cauhinh;

import codegym.model.cauhinh.CauHinh;

import java.util.ArrayList;
import java.util.List;

public class CauHinhServiceImp implements  CauHinhSevrevice{
    private static List<CauHinh> cauHinhs;
    static {
        cauHinhs=new ArrayList<>();
        cauHinhs.add(new CauHinh("English","5","ennable","disable"));
    }
    @Override
    public List<CauHinh> findall() {
        return cauHinhs;
    }

    @Override
    public void update(CauHinh cauHinh) {

    }

}
