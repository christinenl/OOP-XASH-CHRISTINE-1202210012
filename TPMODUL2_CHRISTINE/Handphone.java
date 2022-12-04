public class Handphone extends Perangkat{
    
    protected boolean Fingerprint;

    public Handphone(String Drive, float Processor, int Ram, boolean Fingerprint){
        super(Drive,Processor,Ram);
        this.Fingerprint = Fingerprint;
    }
    @Override
    public void informasi(){
        if(Fingerprint){
            System.out.printf("Handphone ini memiliki drive tipe " + Drive + " dengan ram sebesar " + Ram + " GB dan processor secepat " + Processor + " Ghz. %nSelain itu handphone ini memiliki Fingerprint");
        } else {
            System.out.printf("Handphone ini memiliki drive tipe " + Drive + " dengan ram sebesar " + Ram + " GB dan processor secepat " + Processor + " Ghz. %nSelain itu handphone ini TIDAK memiliki Fingerprint");
        }
    }
    public void telefon(int nmrhp){
        System.out.printf("%nHandphone berhasil menyambungkan telfon ke No %s", nmrhp);
    }
    public void kirimSMS(int nmrhp){
        System.out.printf("%nHandphone berhasil mengirim SMS ke No %s", nmrhp);
    }
    public void kirim_SMS(int nmrhp, int nmrhp2){
        System.out.printf("%nHandphone berhasil mengirim SMS ke No " + nmrhp + " dan ke No " + nmrhp2);
    } 
}
