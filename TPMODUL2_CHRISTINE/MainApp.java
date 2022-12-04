public class MainApp {
    public static void main(String[] args) throws Exception{
        Perangkat p = new Perangkat("Intel", 4.5f, 8);
        p.informasi();
        System.out.println();

        Laptop l = new Laptop("Seagata", 4.5f, 8, true);
        l.informasi();
        l.Gamelaptop("Candy Crush");
        l.SendEmail("ainslychr@gmail.com");
        l.SendEmail("ainslychr@gmail.com", "sharapova@gmail.com");
        System.out.println();

        Handphone h = new Handphone("Samsung J7", 2.4f, 4, false);
        h.informasi();
        h.telefon(628616492);
        h.kirimSMS(63784529);
        h.kirim_SMS(628498430, 620875634);
        System.out.println();
    }   
}