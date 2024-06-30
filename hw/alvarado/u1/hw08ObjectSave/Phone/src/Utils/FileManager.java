
package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class FileManager {
 
         public static void saveManagerProduct(int id, String brand, float size, String color, String model) {
        JSONParser parser = new JSONParser();
        JSONArray listPhone = new JSONArray();

        try (FileReader reader = new FileReader("Phone.json")) {
            Object obj = parser.parse(reader);
            listPhone = (JSONArray) obj;
        } catch (IOException | ParseException e) {
          
        }

        JSONObject phones = new JSONObject();
        phones.put("id", id);
        phones.put("brand", brand);
        phones.put("size", size);
        phones.put("color", color);
        phones.put("model", model);
       

        // Wrap the product object in another JSON object, if needed
        JSONObject datePhone = new JSONObject();
        datePhone.put("phone", phones);

        // Add the new product to the list
        listPhone.add(datePhone);

        // Write the updated list back to the file
        try (FileWriter file = new FileWriter("Phone.json")) {
            file.write(listPhone.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
         
        public static void readManager(){
    
        JSONParser jsonParser = new JSONParser();
    
        try (FileReader reader = new FileReader("Phone.json") ){
            Object obj = jsonParser.parse(reader);
                JSONArray listPhone = (JSONArray)obj;
            
            
            for(Object phone: listPhone){viewManager((JSONObject) phone );}
           
            
            
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
        e.printStackTrace();
        } catch (ParseException e){
        e.printStackTrace();
        }
        

        
    }
         public static void viewManager(JSONObject jsonObject) {
        
        JSONObject phone = (JSONObject) jsonObject.get("phone");
    
      
        double size=(double)phone.get("size");
        String color=(String) phone.get("color");
        String model=(String) phone.get("model");
        long id=(long) phone.get("id");
        String brand=(String)phone.get("brand");
        
             System.out.println("--------------------------");
             System.out.println("|        Produtc          |");
             System.out.println("--------------------------");
             System.out.println("ID          :"+id);
             System.out.println("Color       :"+ color);
             System.out.println("Model       :"+model);
             System.out.println("brand       :"+brand);
             System.out.println("Size        :"+size);
           
    }
    
    
      
      
      
      
      
      
}