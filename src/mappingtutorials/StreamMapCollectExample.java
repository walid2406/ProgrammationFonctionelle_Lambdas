package mappingtutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectExample {

    public static void main(String[] args) {

        List<User> users=new ArrayList<User>();
        users.add(new User(1,"ramsis","********","ramsis@gmail.com"));
        users.add(new User(2,"ramsis2","********","ramsis2@gmail.com"));
        users.add(new User(3,"ramsis3","********","ramsis3@gmail.com"));
        users.add(new User(4,"ramsis4","********","ramsis4@gmail.com"));

        //mapping user to userDTO
        List<UserDTO> usersDTO=new ArrayList<UserDTO>();

        //using stream
       usersDTO= users.stream().
               map((User user)->new UserDTO(user.getId(),user.userName, user.getEmail())).
               collect(Collectors.toList());
        System.out.println(usersDTO);

    }



static class UserDTO{
    private int id;
    private String userName;
    private String email;

    public UserDTO(int id, String userName, String email) {
        this.id = id;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "userDTO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

static class User{
        private int id;
        private String userName;
        private String password;
        private String email;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(int id, String userName, String password, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email = email;
    }
}

}
