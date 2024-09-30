public class Main {
    public static void main(String[] args){
        Shop.setValuta("dollars");
        System.out.println(Shop.getValuta());
        System.out.printf("%.2f",Shop.Cost(2,3,8));
    }
}
