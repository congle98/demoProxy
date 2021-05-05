public class UserServiceImpl implements UserService{
//Giám đốc
    String name;

    public UserServiceImpl(String name) {
        this.name = name;
    }

    @Override
    public void findAll() {
        System.out.println(name);
        System.out.println("Day la danh sach");
    }

    @Override
    public void add() {
        System.out.println(name);
        ////1 đống dòng ở đây
        System.out.println("Them moi san pham");
    }
}
