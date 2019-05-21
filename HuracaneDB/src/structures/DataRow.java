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
public class DataRow {

    String date;
    String hour;
    String recordID;
    String statusID;
    String latitud;
    String hemisphLa;
    String longitude;
    String hemisphLo;
    String maxWindSosteined;
    String minimumPressure;

    public DataRow(String dateRow, String hourRow, String recordID, String statusID, String latitudRow, String longitudRow, String maxWindSosteined, String minimumPressure) {
        String[] dateIn = dateRow.split("");
        String[] hourIn = hourRow.split("");
        String[] latitudIn = latitudRow.split("");
        String[] longitudIn = longitudRow.split("");
        
        String dateAux = "";
        for (int i = 0; i < dateIn.length; i++) {
            if ((i == 3) | (i == 5)) {
                dateAux += dateIn[i] + '-';
            } else {
                dateAux += dateIn[i];
            }
        }
        this.date = dateAux;
        
        String hourAux = "";
        for (int i = 0; i < hourIn.length; i++) {
            if (i == 1) {
                hourAux += hourIn[i]+':';
            } else {
                hourAux += hourIn[i];
            }
        }
        hourAux += ":00";
        
        this.hour = hourAux;
        
        this.recordID = recordID;
        this.statusID = statusID;
        
        String latitudAux = "";
        String hemisphLaAux = "";
        for (int i = 0; i < latitudIn.length; i++) {
            if (i == latitudIn.length-1) {
                hemisphLaAux = latitudIn[i];
            } else {
                latitudAux += latitudIn[i];
            }
        }
        
        this.latitud = latitudAux;
        this.hemisphLa = hemisphLaAux;
        
        String longitudeAux = "";
        String hemisphLoAux = "";
        for (int i = 0; i < longitudIn.length; i++) {
            if (i == longitudIn.length-1) {
                hemisphLoAux = longitudIn[i];
            } else {
                longitudeAux += longitudIn[i];
            }
        }
        
        this.longitude = longitudeAux;
        this.hemisphLo = hemisphLoAux;
        
        this.maxWindSosteined = maxWindSosteined;
        this.minimumPressure = minimumPressure;
    }

    public String dataRowInfoCSV(){
        return (date+","+hour+","+recordID+","+statusID+","+latitud+","+hemisphLa+","+longitude+","+hemisphLo+","+maxWindSosteined+","+minimumPressure);
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getStatusID() {
        return statusID;
    }

    public void setStatusID(String statusID) {
        this.statusID = statusID;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getHemisphLa() {
        return hemisphLa;
    }

    public void setHemisphLa(String hemisphLa) {
        this.hemisphLa = hemisphLa;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getHemisphLo() {
        return hemisphLo;
    }

    public void setHemisphLo(String hemisphLo) {
        this.hemisphLo = hemisphLo;
    }

    public String getMaxWindSosteined() {
        return maxWindSosteined;
    }

    public void setMaxWindSosteined(String maxWindSosteined) {
        this.maxWindSosteined = maxWindSosteined;
    }

    public String getMinimumPressure() {
        return minimumPressure;
    }

    public void setMinimumPressure(String minimumPressure) {
        this.minimumPressure = minimumPressure;
    }

}
