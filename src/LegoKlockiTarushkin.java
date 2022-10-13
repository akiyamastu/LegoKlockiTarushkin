public class LegoKlockiTarushkin {

    static int dta;
    static int dtb;
    static int ilość;
    static int niepilość;

    public static void main(String[] args) {

        dta = 71;

        dtb = 6;

        ilość = dta / dtb;

        System.out.println("Ilość pełnych pojemników: " +ilość);

        System.out.println("Ilość wszystkich pojemników: "+(ilość + 1));

        niepilość = dta % dtb;

        System.out.println("Ilość klocków w pojemniku który nie został " +
                "zapełniony w całości " + niepilość);

    }
}