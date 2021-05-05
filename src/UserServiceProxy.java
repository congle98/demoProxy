public class UserServiceProxy implements UserService{
    //Thư ký
    private String role;
    private UserServiceImpl userService;

    public UserServiceProxy(String role, String name) {
        this.role = role;
        this.userService = new UserServiceImpl(name);
    }

    @Override
    public void findAll() {
        userService.findAll();
    }

    @Override
    public void add() {
        if (role=="High"){
        userService.add();}
        else {
            try {
                throw new IllegalAccessException("Khong co quyen");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
