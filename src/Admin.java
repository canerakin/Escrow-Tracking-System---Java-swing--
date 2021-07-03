/**
 * Yöneticinin bilgilerinin tutulduğu sınıftır
 */
public class Admin extends Insan{
    private String görev;
    /**
     * parametresiz yapıcıda otomatik atar
     */
    public Admin() {
        super("admin","","admin");
    }

    /**
     * isteğe göre biilgiyle giriş
     * @param isim admin ismi
     * @param sifre admin sifresi
     */
    public Admin(String isim, String sifre) {
        super(isim,"",sifre);
    }

    @Override
    public String getSifre() {
        return super.getSifre();
    }

    @Override
    public void setSifre(String sifre) {
        super.setSifre(sifre);
    }      
    

    public String getGörev() {
        return görev;
    }

    public void setGörev(String görev) {
        this.görev = görev;
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
        görev = "Admin";
    }
    
}
