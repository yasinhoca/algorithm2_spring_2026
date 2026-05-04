package hafta10;

public class hasta_bilgi {
    private String tc_no="22222222222";
    public String ad="Ali";
    public String soyad= "Alkan0";
    protected String tel="5055555555";
    int hasta_id=6;


   //Encapsulation - Kapsulleme
   //getter ve setter ile veri okunabilir veya değiştirilebilir
    public String getTc_no() {
        return tc_no;
    }

    public void setTc_no(String tc_no) {
        this.tc_no = tc_no;
    }
}
