import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.util.Date;

public class Testjsonb {
    public static void main(String[] args) {
        User user = new User();
        user.setId(123);
        user.setEmail("seenith@");
        user.setName("sena");
        Jsonb jsonb = JsonbBuilder.create();
        String result = jsonb.toJson(user);
        System.out.println(result);

        user = jsonb.fromJson(result, User.class);
    }
}
