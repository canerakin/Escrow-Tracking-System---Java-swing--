
/**
 * Müşteri bilgilerini içeren sınıftır
 */
public class Musteri extends Insan{
    private String görev;
    private String esyasi;

    public Musteri() {
    }

    /**
     * parametreli yapıcı methodu
     * @param isim müsteri ismi
     * @param soyisim müsteri soyisimi
     */
    public Musteri(String isim, String soyisim) {
        super(isim, soyisim);
    }
    
    public Musteri(String isim, String soyisim, String esya) {
        super(isim, soyisim);
        this.esyasi = esya ;
    }

    public String getGörev() {
        return görev;
    }

    public void setGörev(String görev) {
        this.görev = görev;
    }

    public String getEsyasi() {
        return esyasi;
    }

    public void setEsyasi(String esyasi) {
        this.esyasi = esyasi;
    }
    
    /**
     * isimin getter ı
     * @return kişinin ismi 
     */
    @Override
    public String getIsim() {
        return super.getIsim();
    }
    /**
     * isimin setterı
     * @param isim kişinin yeni ismi
     */
    @Override
    public void setIsim(String isim) {
        super.setIsim(isim);
    }
    /**
     * soyisimin getter ı
     * @return kişinin soyisimi
     */
    @Override
    public String getSoyisim() {
        return super.getSoyisim();
    }
    /**
     * soyisimin setter ı
     * @param soyisim kişinin yeni soyisimi
     */
    @Override
    public void setSoyisim(String soyisim) {
        super.setSoyisim(soyisim);
    }    
    
    
    /**
     * görev ataması yapar
     */
    @Override
    public void Görev() {
        görev = "Müşteri";
    }
}
