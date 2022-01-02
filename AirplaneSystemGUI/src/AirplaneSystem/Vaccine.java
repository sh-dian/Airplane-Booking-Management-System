/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirplaneSystem;

/** 
 * @Group 8 
 * 1. SHARIFAH LYDIEANNA BT SYED SHAMSUDDIN (CB20050)
 * 2. NURUL ATIKAH BT FADZIL HALMI (CB20133)
 * 3. AHMAD HILMAN BIN AHMAD BADRUDDIN (CB20093)
 * 4. WAN MUHAMMAD DZULKHAIRIE BIN WAN ZAHARI (CB20096)
 * 5. HANIS SYAFIQA BT KHAIRIL AZLI (CB20106)
 */ 
public class Vaccine {
    private int VaccineDeclaration;
    private int VaccineType;
    private String FirstDose_Date;
    private String SecondDose_Date;
    private String covid19_Result;
    
    Vaccine(){
        VaccineDeclaration = 0;
        VaccineType = 0;
        FirstDose_Date = null;
        SecondDose_Date = null;
        covid19_Result = null;
    }
    
    void DisplayVaccineType(int VaccineType){
        switch (getVaccineType()) {
            case 1 -> System.out.println("Vaccine Type: Sinovac");
            case 2 -> System.out.println("Vaccine Type: Astrazeneca");
            case 3 -> System.out.println("Vaccine Type: Pfizer");
            default -> {
            }
        }
    }

    /**
     * @return the VaccineDeclaration
     */
    public int getVaccineDeclaration() {
        return VaccineDeclaration;
    }

    /**
     * @param VaccineDeclaration the VaccineDeclaration to set
     */
    public void setVaccineDeclaration(int VaccineDeclaration) {
        this.VaccineDeclaration = VaccineDeclaration;
    }

    /**
     * @return the VaccineType
     */
    public int getVaccineType() {
        return VaccineType;
    }

    /**
     * @param VaccineType the VaccineType to set
     */
    public void setVaccineType(int VaccineType) {
        this.VaccineType = VaccineType;
    }

    /**
     * @return the FirstDose_Date
     */
    public String getFirstDose_Date() {
        return FirstDose_Date;
    }

    /**
     * @param FirstDose_Date the FirstDose_Date to set
     */
    public void setFirstDose_Date(String FirstDose_Date) {
        this.FirstDose_Date = FirstDose_Date;
    }

    /**
     * @return the SecondDose_Date
     */
    public String getSecondDose_Date() {
        return SecondDose_Date;
    }

    /**
     * @param SecondDose_Date the SecondDose_Date to set
     */
    public void setSecondDose_Date(String SecondDose_Date) {
        this.SecondDose_Date = SecondDose_Date;
    }

    /**
     * @return the covid19_Result
     */
    public String getCovid19_Result() {
        return covid19_Result;
    }

    /**
     * @param covid19_Result the covid19_Result to set
     */
    public void setCovid19_Result(String covid19_Result) {
        this.covid19_Result = covid19_Result;
    }
}
