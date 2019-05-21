/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author angelrg
 */
public class dataHu {
    String code;
    String name;
    String entries;

    public dataHu(String code, String name, String entries) {
        this.code = code;
        this.name = name;
        this.entries = entries;
    }
    
    public String dataHuracaneInfoCSV(){
        return (code+","+name+","+entries);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntries() {
        return entries;
    }

    public void setEntries(String entries) {
        this.entries = entries;
    }
}
