import java.util.HashMap;
import java.util.Map;

public class Member {
    private final String username;
    private final String password;
    private final String firstName;

    private static final HashMap<String, String> loginMember = new HashMap<>();

    //This adds a blank constructor so you can call this class for login purposes
    public Member(){
        this.username = "";
        this.password = "";
        this.firstName = "";
    }

    public Member(String username, String password, String firstName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
    }

    //method allows the of a hashmap from another class
    public HashMap<String, String> getMemberMap() {
        return loginMember;
    }

    public String getUsername() {
        return this.username + "";
    }

    public String getPassword() {
        return this.password + "";
    }

    public String getFirstName() {
        return this.firstName + "";
    }


    // Checks if it is the correct credentials entered by the user and if it has been regestered as an account
    public boolean isMemberExist(Member member){
        if(loginMember.containsKey(member.getUsername()) && loginMember.containsValue(member.getPassword())){
            return true;
        } else {
            System.out.println("No member in the list!");
        }
        return false;
    }


    public void register(Member member) {
        loginMember.put(member.getUsername(),member.getPassword());
    }


    public void login(Member member){
        if(isMemberExist(member)) {
            System.out.println("Hello " + member.getFirstName());
        } else {
            System.out.println("No member with username " +member.getUsername());
        }
    }
}
