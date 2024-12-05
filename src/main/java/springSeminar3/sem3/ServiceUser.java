package springSeminar3.sem3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ServiceUser {
    private final List<User> employees = new ArrayList<>();

    public List<User> getAllEmployees() {
        return employees;
    }

    public List<User> getEmployeeByName(String name) {
        return employees.stream().filter(e -> e.getName().equals(name)).toList();
    }
    public User getEmployeeById(UUID uuid) {
        return employees.stream().filter(e -> e.getId().equals(uuid)).findFirst().orElse(null);
    }

    public User addUser(User user) {
        employees.add(user);
        return user;
    }

    public void deleteUser(UUID uuid) {
        employees.removeIf(e -> e.getId().equals(uuid));
    }
    public User updateUser(UUID uuid, User user){
        User userForUpdate = getEmployeeById(uuid);
        if(userForUpdate!=null){
            userForUpdate.setBirthday(user.getBirthday());
            userForUpdate.setName(user.getName());
            userForUpdate.setCondition(user.getCondition());
        }
        return userForUpdate;
    }
}
