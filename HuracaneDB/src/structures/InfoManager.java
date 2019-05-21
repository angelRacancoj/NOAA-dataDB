/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import filesManager.ManejadorArchivo;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author angelrg
 */
public class InfoManager {
    
    ManejadorArchivo FileM = new ManejadorArchivo();
    
    public String getCSV(String code, String name, String entries, HurRows rows) {
        return createRowsCSV(rows.getRows(), new dataHu(code, name, entries));
    }
    
    private String createRowsCSV(LinkedList<DataRow> data, dataHu huracane) {
        String infoAux = "";
        for (int i = 0; i < data.size(); i++) {
            infoAux += (huracane.dataHuracaneInfoCSV() + "," + data.get(i).dataRowInfoCSV() + "\n");
        }
        return infoAux;
    }
    
    public String addAllRowsToCSV(String storm1, String strom2) {
        return (storm1 + strom2);
    }
    
    public void createFile(String rows){
        try {
            FileM.guardarArchivo("/home/angelrg/Documents/HurDB1.csv", rows);
            System.out.println("File created, well done!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
