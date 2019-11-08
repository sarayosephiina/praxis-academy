
package jsonencodedemo1;
import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;
/**
 *
 * @author sara yosephina
 */
public class JsonEncodeDemo1 {

    public static void main(String[] args) throws IOException {
        JSONObject obj = new JSONObject();
        
        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));
        
        StringWriter out = new StringWriter();
        obj.writeJSONString(out);
        
        String jsonText = out.toString();
        System.out.println(jsonText);
    }
    
}
