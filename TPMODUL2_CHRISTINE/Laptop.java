public class Laptop extends Perangkat {
    protected boolean Webcam;

    public Laptop(String Drive, float Processor, int Ram, boolean Webcam){
        super(Drive, Processor, Ram);
        this.Webcam = Webcam;
    }

    @Override
    public void informasi() {
        if (Webcam){
            System.out.println("Laptop ini memiliki drive tipe " + Drive + " dengan ram sebesar " + Ram + " GB dan processor secepat " + Processor + " Ghz. Selain itu laptop ini juga memiliki webcam");
        } else {
            System.out.println("Laptop ini memiliki drive tipe " + Drive + " dengan ram sebesar " + Ram + " GB dan processor secepat " + Processor + " Ghz. Selain itu laptop ini juga TIDAK memiliki webcam");
        }
    }
    public void Gamelaptop(String nameGame){
        System.out.println("Laptop berhasil membuka game " + nameGame);
    }
    public void SendEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }
    public void SendEmail (String email, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email + " dan ke " + email2);
    }
}