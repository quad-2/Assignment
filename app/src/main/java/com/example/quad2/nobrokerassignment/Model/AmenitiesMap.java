
package com.example.quad2.nobrokerassignment.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AmenitiesMap {

    @SerializedName("CLUB")
    @Expose
    private boolean cLUB;
    @SerializedName("HK")
    @Expose
    private boolean hK;
    @SerializedName("INTERNET")
    @Expose
    private boolean iNTERNET;
    @SerializedName("SC")
    @Expose
    private boolean sC;
    @SerializedName("VP")
    @Expose
    private boolean vP;
    @SerializedName("RWH")
    @Expose
    private boolean rWH;
    @SerializedName("POOL")
    @Expose
    private boolean pOOL;
    @SerializedName("LIFT")
    @Expose
    private boolean lIFT;
    @SerializedName("AC")
    @Expose
    private boolean aC;
    @SerializedName("INTERCOM")
    @Expose
    private boolean iNTERCOM;
    @SerializedName("FS")
    @Expose
    private boolean fS;
    @SerializedName("PARK")
    @Expose
    private boolean pARK;
    @SerializedName("GP")
    @Expose
    private boolean gP;
    @SerializedName("CPA")
    @Expose
    private boolean cPA;
    @SerializedName("GYM")
    @Expose
    private boolean gYM;
    @SerializedName("SECURITY")
    @Expose
    private boolean sECURITY;
    @SerializedName("SERVANT")
    @Expose
    private boolean sERVANT;
    @SerializedName("PB")
    @Expose
    private boolean pB;
    @SerializedName("STP")
    @Expose
    private boolean sTP;

    public AmenitiesMap() {
    }


    public AmenitiesMap(boolean cLUB, boolean hK, boolean iNTERNET, boolean sC, boolean vP, boolean rWH, boolean pOOL, boolean lIFT,
                        boolean aC, boolean iNTERCOM, boolean fS, boolean pARK, boolean gP, boolean cPA, boolean gYM,
                        boolean sECURITY, boolean sERVANT, boolean pB, boolean sTP) {
        super();
        this.cLUB = cLUB;
        this.hK = hK;
        this.iNTERNET = iNTERNET;
        this.sC = sC;
        this.vP = vP;
        this.rWH = rWH;
        this.pOOL = pOOL;
        this.lIFT = lIFT;
        this.aC = aC;
        this.iNTERCOM = iNTERCOM;
        this.fS = fS;
        this.pARK = pARK;
        this.gP = gP;
        this.cPA = cPA;
        this.gYM = gYM;
        this.sECURITY = sECURITY;
        this.sERVANT = sERVANT;
        this.pB = pB;
        this.sTP = sTP;
    }

    public boolean isCLUB() {
        return cLUB;
    }

    public void setCLUB(boolean cLUB) {
        this.cLUB = cLUB;
    }

    public boolean isHK() {
        return hK;
    }

    public void setHK(boolean hK) {
        this.hK = hK;
    }

    public boolean isINTERNET() {
        return iNTERNET;
    }

    public void setINTERNET(boolean iNTERNET) {
        this.iNTERNET = iNTERNET;
    }

    public boolean isSC() {
        return sC;
    }

    public void setSC(boolean sC) {
        this.sC = sC;
    }

    public boolean isVP() {
        return vP;
    }

    public void setVP(boolean vP) {
        this.vP = vP;
    }

    public boolean isRWH() {
        return rWH;
    }

    public void setRWH(boolean rWH) {
        this.rWH = rWH;
    }

    public boolean isPOOL() {
        return pOOL;
    }

    public void setPOOL(boolean pOOL) {
        this.pOOL = pOOL;
    }

    public boolean isLIFT() {
        return lIFT;
    }

    public void setLIFT(boolean lIFT) {
        this.lIFT = lIFT;
    }

    public boolean isAC() {
        return aC;
    }

    public void setAC(boolean aC) {
        this.aC = aC;
    }

    public boolean isINTERCOM() {
        return iNTERCOM;
    }

    public void setINTERCOM(boolean iNTERCOM) {
        this.iNTERCOM = iNTERCOM;
    }

    public boolean isFS() {
        return fS;
    }

    public void setFS(boolean fS) {
        this.fS = fS;
    }

    public boolean isPARK() {
        return pARK;
    }

    public void setPARK(boolean pARK) {
        this.pARK = pARK;
    }

    public boolean isGP() {
        return gP;
    }

    public void setGP(boolean gP) {
        this.gP = gP;
    }

    public boolean isCPA() {
        return cPA;
    }

    public void setCPA(boolean cPA) {
        this.cPA = cPA;
    }

    public boolean isGYM() {
        return gYM;
    }

    public void setGYM(boolean gYM) {
        this.gYM = gYM;
    }

    public boolean isSECURITY() {
        return sECURITY;
    }

    public void setSECURITY(boolean sECURITY) {
        this.sECURITY = sECURITY;
    }

    public boolean isSERVANT() {
        return sERVANT;
    }

    public void setSERVANT(boolean sERVANT) {
        this.sERVANT = sERVANT;
    }

    public boolean isPB() {
        return pB;
    }

    public void setPB(boolean pB) {
        this.pB = pB;
    }

    public boolean isSTP() {
        return sTP;
    }

    public void setSTP(boolean sTP) {
        this.sTP = sTP;
    }

    @Override
    public String toString() {
        return "AmenitiesMap{" +
                "cLUB=" + cLUB +
                ", hK=" + hK +
                ", iNTERNET=" + iNTERNET +
                ", sC=" + sC +
                ", vP=" + vP +
                ", rWH=" + rWH +
                ", pOOL=" + pOOL +
                ", lIFT=" + lIFT +
                ", aC=" + aC +
                ", iNTERCOM=" + iNTERCOM +
                ", fS=" + fS +
                ", pARK=" + pARK +
                ", gP=" + gP +
                ", cPA=" + cPA +
                ", gYM=" + gYM +
                ", sECURITY=" + sECURITY +
                ", sERVANT=" + sERVANT +
                ", pB=" + pB +
                ", sTP=" + sTP +
                '}';
    }
}
