/**
 *  Her insanda bulunan isim ve soyisim bilgilerini tutan abstract class
 */
public abstract class Insan {
    /**
     *  string olarak isim tuttum
     */
    private String isim;
    /**
     *  string olarak soyisim tuttum
     */
    private String soyisim;
    
    /**
     * adminin kullanabilmesi için şifresidir
     */
    private String sifre;

    /**
     * parametresiz yapıcı fonksiyonu
     */
    public Insan() {      }
    
    
    /**
     * parametreli yapıcı fonksiyon müşteri
     * @param isim kişinin ismi
     * @param soyisim kişinin soyismi
    */
    public Insan(String isim, String soyisim ) {
        this.isim = isim;
        this.soyisim = soyisim;
    }
    
    /**
     * adminden kullanılıyor
     * @param isim kişinin ismi
     * @param soyisim kişinin soyismi
     * @param sifre adminin şifresi
     */
    public Insan(String isim, String soyisim ,String sifre) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.sifre = sifre;
    }
    /**
     * sifre geetter ı
     * @return  sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * sifrenin setterı
     * @param sifre 
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }    

    /**
     * isimin getter ı
     * @return kişinin ismi 
     */
    public String getIsim() {
        return isim;
    }
    /**
     * isimin setterı
     * @param isim kişinin yeni ismi
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }
    /**
     * soyisimin getter ı
     * @return kişinin soyisimi
     */
    public String getSoyisim() {
        return soyisim;
    }
    /**
     * soyisimin setter ı
     * @param soyisim kişinin yeni soyisimi
     */
    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }
    /**
     * Kişiden kişiye değişen 
     */
    public abstract void Görev();   

    
}
