package codegym.service.Login;

import codegym.model.Login.Login;
import codegym.model.Login.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoginServiceImp implements LoginSevice {
    private static List<User> userList;
    static {
        userList=new ArrayList<>();
        userList.add(new User("tutt7","tutt7","tu","tutt7@fsoft.com",12));
        userList.add(new User("tutt27","tutt7","tu","tutt7@fsoft.com",132));
        userList.add(new User("tutt37","tutt7","tu","tutt7@fsoft.com",122));
        userList.add(new User("tutt47","tutt7","tu","tutt7@fsoft.com",1232));
        userList.add(new User("tutt57","tutt7","tu","tutt7@fsoft.com",1322));
        userList.add(new User("tutt5237","tutt732","tu","tutt7@fsoft.com",1322));
    }
    @Override
    public User Comperatrue(Login login) {
        for (User x:userList
             ) {
            if (login.getAccount().equals(x.getAccount())&&login.getPassword().equals(x.getPassword())){
                return x;
            }
        }
        return null;
    }
}
