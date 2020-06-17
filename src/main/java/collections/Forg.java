package collections;

import java.util.ArrayList;
import java.util.List;

public class Forg {
    private List<User> users;
    private List<User> adultUsers;

    public Forg() {
        this.users = new ArrayList<User>();
        this.adultUsers = new ArrayList<User>();
    }

    public void addUser(User user) {
        users.add(user);
        if(checkUserAge(user))adultUsers.add(user);
    }

    private boolean checkUserAge(User user) {
        return user.getAge()>=18;
    }

    public int getNumberOfAdultUsers(){
        return adultUsers.size();
    }

    public void getAdultUsersInformation(){
        for (User user: adultUsers) {
            System.out.println(user.toString());
        }
    }
}
