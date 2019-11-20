/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfed;

import java.io.IOException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Ronny
 */
public class Pfed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        JSONReader as = new JSONReader();
        JSONMapa mapa = as.convertJSonToData();
    }
    
}
