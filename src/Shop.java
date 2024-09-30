public class Shop {
    public static double sosiska=15;
    public static double kolbaska=18;
    public static double salo=100;
    public static final double Rub=1;
    public static final double Yena=1.57;
    public static final double Dollar=1.010786;
    public static double val;

    public static String valuta;

    public static String getValuta() {
        return valuta;
    }

    public static void setValuta(String valuta) {
        Shop.valuta = valuta;
    }
    public static double Cost(int sosiski, int kolbaski,int sal){
        if (valuta=="dollars") {
            val=Dollar;
        }
        if (valuta=="yenas") {
            val = Yena;
        }
        if (valuta=="rubles") {
            val = Rub;
        }
        return (sosiski*sosiska+kolbaski*kolbaska+sal*salo)*val;
    }
}
