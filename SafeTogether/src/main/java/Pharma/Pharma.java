/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pharma;
import java.util.*;


/**
 *
 * @author shrikrishnajoisa
 */
public class Pharma {

    public Pharma(String pharmaName, String pharmaLocation, String pharmaPhoneNumber, String pharmaUserID, String pharmaPassword) { 
        // Addition of few stuff is remaining
        this.pharmaName = pharmaName;
        this.pharmaLocation = pharmaLocation;
        this.pharmaPhoneNumber = pharmaPhoneNumber;
        this.pharmaUserID = pharmaUserID;
        this.pharmaPassword = pharmaPassword;
        setPharmaPassword(pharmaPassword);
    }
    


    public String getPharmaName() {
        return pharmaName;
    }

    public void setPharmaName(String pharmaName) {
        this.pharmaName = pharmaName;
    }

    public String getPharmaLocation() {
        return pharmaLocation;
    }

    public void setPharmaLocation(String pharmaLocation) {
        this.pharmaLocation = pharmaLocation;
    }

    public String getPharmaPhoneNumber() {
        return pharmaPhoneNumber;
    }

    public void setPharmaPhoneNumber(String pharmaPhoneNumber) {
        this.pharmaPhoneNumber = pharmaPhoneNumber;
    }

    public String getPharmaUserID() {
        return pharmaUserID;
    }

    public void setPharmaUserID(String pharmaUserID) {
        this.pharmaUserID = pharmaUserID;
    }

    public String getPharmaPassword() {
        return pharmaPassword;
    }

    public void setPharmaPassword(String pharmaPassword) {
        this.pharmaPassword = pharmaPassword;
    }

    public Map<String, String> getMedicines() {
        return medicines;
    }

    public void setMedicines(Map<String, String> medicines) {
        this.medicines = medicines;
    }

    String pharmaName;
    String pharmaLocation;
    String pharmaPhoneNumber;
    String pharmaUserID;
    String pharmaPassword;
    public Map<String, String> medicines = new HashMap<String,String>();
    
    
}
