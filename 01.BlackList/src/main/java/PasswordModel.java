public class PasswordModel {
    private Integer id;
    private String password;

    public PasswordModel(Integer id, String password) {
        this.id = id;
        this.password = password;
    }
    public PasswordModel(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "PasswordBlackList{" +
                "id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
