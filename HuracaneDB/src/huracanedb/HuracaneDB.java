/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huracanedb;

import analizer.Lexer;
import analizer.parser;
import filesManager.ManejadorArchivo;
import java.io.StringReader;

/**
 *
 * @author angelrg
 */
public class HuracaneDB {

    public static void main(String[] args) {
        Lexer lex = new Lexer(new StringReader(""));
        ManejadorArchivo files = new ManejadorArchivo();
        parser parse = new parser(lex);
        
        try {
            lex.yyreset(new StringReader(files.lecturaArchivo("/home/angelrg/Documents/huracanes.csv")));
            parse.parse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
