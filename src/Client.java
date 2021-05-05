public class Client {
    public static void main(String[] args) {
        UserService th1= new UserServiceProxy("High", "KA");
        th1.findAll();
        th1.add();
        UserService th2= new UserServiceProxy("Low", "KA");
        th2.findAll();
        th2.add();
    }
}
