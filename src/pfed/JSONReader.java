/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfed;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map; 
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Ronny
 */
public class JSONReader implements IConstants{
    
    private String rutaArchivo;

    public JSONReader() {
        this.rutaArchivo = PATH_FILE;
    }
    
    public JSONMapa convertJSonToData() throws IOException, ParseException{
        
        ArrayList<Obstaculo> listaObstaculos = new ArrayList<>();
        
        Object obj = new JSONParser().parse(new FileReader(rutaArchivo)); 
          
        JSONObject jo = (JSONObject) obj; 
          
        JSONArray ja = (JSONArray) jo.get(TAG_JSON); 
          
        for (int i = 0; i < ja.size(); i++) {
            Map address = ((Map)ja.get(i));
            Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
            ArrayList<Integer> puntos = new ArrayList<>();
            
            while (itr1.hasNext()) { 
                Map.Entry pair = itr1.next(); 
                puntos.add(Integer.parseInt(pair.getValue().toString())); 
            }
            Obstaculo obstaculo = new Obstaculo(puntos.get(0), puntos.get(1), puntos.get(2), puntos.get(3));
            listaObstaculos.add(obstaculo);
        }
          
        JSONMapa jsonMapa = new JSONMapa(listaObstaculos);
        return jsonMapa;
    } 
}
