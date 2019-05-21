/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

import java.util.LinkedList;

/**
 *
 * @author angelrg
 */
public class HurRows {
    LinkedList<DataRow> rows;

    public HurRows(DataRow e) {
        LinkedList<DataRow> rowsAux = new LinkedList<>();
        rowsAux.add(e);
        this.rows = rowsAux;
    }

    public HurRows addRow(DataRow row){
        rows.add(row);
        return this;
    }

    public LinkedList<DataRow> getRows() {
        return rows;
    }

    public void setRows(LinkedList<DataRow> rows) {
        this.rows = rows;
    }
    
    
}
