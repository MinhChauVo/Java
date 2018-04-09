/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baith2;

/**
 *
 * @author chauvo
 */
public class StudentInfo {
    private int STT;
    private String HoTen;
    private String NamSinh;
    private String GioiTinh;
    
    public int getSTT(){
        return this.STT;
      }
    public void setSTT(int STT){
        this.STT = STT;
    }
    public String getHoTen(){
        return this.HoTen;
    }
    public void setHoTen(String HoTen){
        this.HoTen = HoTen;
    }
    public String getNamSinh(){
        return this.NamSinh;
      }
    public void setNamSinh(String NamSinh){
        this.NamSinh = NamSinh;
    }
    public String getGioiTinh(){
        return this.GioiTinh;
    }
    public void setGioiTinh(String GioiTinh){
        this.GioiTinh = GioiTinh;
    }
    
}
