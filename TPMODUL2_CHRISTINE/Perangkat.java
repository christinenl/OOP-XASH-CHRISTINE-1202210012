public class Perangkat { 
    protected String Drive;
    protected int Ram;
    protected float Processor;

    public Perangkat (String Drive, Float Processor, int Ram){
        this.Drive = Drive;
        this.Ram = Ram;
        this.Processor = Processor;
    }

    public void informasi(){
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe " + Drive + " dengan ram sebesar " + Ram + " GB dan processor secepat " + Processor + " Ghz %n");
    }
}