/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class TriThuc {
    private int STT,hokhan,somui,sot,hathoi,moitim,dauhong,daunguc
            ,khotho,chanan,hodam,homau;
    private String conclusion;

    public TriThuc() {
    }

    public TriThuc(int STT) {
        this.STT = STT;
    }

    public int getSTT() {
        return STT;
    }

    public void setSTT(int STT) {
        this.STT = STT;
    }

    public int getHokhan() {
        return hokhan;
    }

    public void setHokhan(int hokhan) {
        this.hokhan = hokhan;
    }

    public int getSomui() {
        return somui;
    }

    public void setSomui(int somui) {
        this.somui = somui;
    }

    public int getSot() {
        return sot;
    }

    public void setSot(int sot) {
        this.sot = sot;
    }

    public int getHathoi() {
        return hathoi;
    }

    public void setHathoi(int hathoi) {
        this.hathoi = hathoi;
    }

    public int getMoitim() {
        return moitim;
    }

    public void setMoitim(int moitim) {
        this.moitim = moitim;
    }

    public int getDauhong() {
        return dauhong;
    }

    public void setDauhong(int dauhong) {
        this.dauhong = dauhong;
    }

    public int getDaunguc() {
        return daunguc;
    }

    public void setDaunguc(int daunguc) {
        this.daunguc = daunguc;
    }

    public int getKhotho() {
        return khotho;
    }

    public void setKhotho(int khotho) {
        this.khotho = khotho;
    }

    public int getChanan() {
        return chanan;
    }

    public void setChanan(int chanan) {
        this.chanan = chanan;
    }

    public int getHodam() {
        return hodam;
    }

    public void setHodam(int hodam) {
        this.hodam = hodam;
    }

    public int getHomau() {
        return homau;
    }

    public void setHomau(int homau) {
        this.homau = homau;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}

