/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package görsellabproje;

/**
 *
 * @author Windows 8.1
 */
public class notlar
{
    private String ogrenciNumarasi,DersAdi,DersNotu;

    public String getOgrenciNumarasi() {
        return ogrenciNumarasi;
    }

    public void setOgrenciNumarasi(String ogrenciNumarasi) {
        this.ogrenciNumarasi = ogrenciNumarasi;
    }

    public String getDersAdi() {
        return DersAdi;
    }

    public void setDersAdi(String DersAdi) {
        this.DersAdi = DersAdi;
    }

    public String getDersNotu() {
        return DersNotu;
    }

    public void setDersNotu(String DersNotu) {
        this.DersNotu = DersNotu;
    }

    public notlar(String DersAdi,String DersNotu,String ogrenciNumarasi ) {
        
        this.DersAdi = DersAdi;
        this.DersNotu = DersNotu;
        this.ogrenciNumarasi = ogrenciNumarasi;
    }
    
    
}
