package springSeminar3.sem3;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class ControllerUser {
    private final ServiceUser serviceUser;

    public ControllerUser(ServiceUser serviceUser) {
        this.serviceUser = serviceUser;
    }
    @GetMapping
    public List<User> getAllEmployees() {
        return serviceUser.getAllEmployees();
    }
    @GetMapping("/{name}")
    public List<User> getEmployeeByName(String name)throws IOException {
        return serviceUser.getEmployeeByName(name);

    }
    @GetMapping("/{uuid}")
    public User getEmployeeById(@PathVariable UUID uuid) {
        return serviceUser.getEmployeeById(uuid);
    }
    @PostMapping
    public User addUser(@RequestBody User user) {
        return serviceUser.addUser(user);
    }
    @DeleteMapping("/{uuid}")
    public void deleteUser(@PathVariable UUID uuid) {
        serviceUser.deleteUser(uuid);
    }
    @PutMapping("/{uuid}")
    public User updateUser(@PathVariable UUID uuid,@RequestBody User user){
        return serviceUser.updateUser(uuid, user);
    }

}
