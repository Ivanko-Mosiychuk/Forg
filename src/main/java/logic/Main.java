package logic;

import collections.Forg;
import collections.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Main {

    @BeforeClass
    public void bfClass(){
        System.out.println("Before class");
    }

    @BeforeMethod
    public void bfMethod(){
        System.out.println("Before");
    }

    @DataProvider(name ="numberTest")
    public Object[] dpHelper(){
      return new Integer[]{1,2,3,4,5};
    }

    @Test(dataProvider = "numberTest")
    public void test1(int i){
        Assert.assertTrue(i%2==0);
    }

    @Test
    public void adultUsersTest(){
        User user = new User(13, "Anton", 45.1);
        User user2 = new User(19, "Anton", 45.1);
        Forg forg = new Forg();
        forg.addUser(user);
        forg.addUser(user2);

        Assert.assertTrue(forg.getNumberOfAdultUsers()>0);
    }

    public static void main(String[] args) {
        User user = new User(13, "Anton", 45.1);
        User user2 = new User(19, "Marry", 13.1);
        User user3 = new User(5, "Monica", 93.2);
        User user4 = new User(32,"Roberto",21.9);
        Forg forg = new Forg();
        forg.addUser(user);
        forg.addUser(user2);
        forg.addUser(user3);
        forg.addUser(user4);
        forg.addUser(user2);
        System.out.println("Number of adult users: "+forg.getNumberOfAdultUsers());
        forg.getAdultUsersInformation();
    }

}
