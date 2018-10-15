import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        OrderPropertyDescriptor order = DataGenerator.getData();
        Jsonb jsonb = JsonbBuilder.create();

        try(Writer writer = new FileWriter(new File("Order.json"))) {

            writer.write(jsonb.toJson(order));
            writer.flush();

        } catch (IOException e) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE,null, e);
        }


        try {
            OrderPropertyDescriptor deserializedOrder = jsonb.fromJson(new FileReader(new File("Order.json")), OrderPropertyDescriptor.class);
            System.out.println(deserializedOrder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
