package pckg_intro;

public class User {
    private int id;
    private static int cntId=100;
    private String name;

    public User(String name){
        this.name=name;
        id=cntId++;
    }

}
