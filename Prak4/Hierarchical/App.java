public class App {
    public static void main(String[] args) throws Exception {
        // implementasi hierarchichal inheritance
        Karyawan wahyu = new Karyawan("Wahyu");
        Dosen amir = new Dosen("Amir");
        Staff melan = new Staff("Melan");

        wahyu.kerja();
        amir.kerja();
        melan.kerja();
    }
}