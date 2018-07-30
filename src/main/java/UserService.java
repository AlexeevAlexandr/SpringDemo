import java.util.ArrayList;
import java.util.List;
//import org.app.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    private List<User> users = new ArrayList<User>();

    public UserService() {
        init();
    }

    private void init(){
        users.add(new User(1L, "alec"));
    }

    public List<User> getAll() {
        return users;
    }

    public void updateUser(User user) {
        for (User us : users) {
            if (us.getId().longValue() == user.getId().longValue()) {
                int index = users.indexOf(us);
                users.set(index, user);
                break;
            }
        }
    }

    public void deleteUser(Long id) {
        for(User u : users){
            if(u.getId().longValue() == id.longValue()) {
                users.remove(u);
                break;
            }
        }
    }

    public void addUser(User user) {
        Long l = Long.MAX_VALUE;
        for (User u : users) {
            l = u.getId();
        }
        user.setId(l + 1);
        users.add(user);
    }
}
