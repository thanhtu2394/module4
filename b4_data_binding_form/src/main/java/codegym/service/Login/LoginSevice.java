package codegym.service.Login;

import codegym.model.Login.Login;
import codegym.model.Login.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginSevice {
    User Comperatrue(Login login);
}
