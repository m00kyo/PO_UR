public class Main {
    public enum Swiatlo {
        CZERWONE("Stój!"), ZOLTE("Uwaga!"), ZIELONE("Jedź!");
        private String kom;

        Swiatlo(String kom) {
            this.kom = kom;
        }


        public String getKomunikat() {
            return kom;
        }

    }

    public static void main(String[] args) {

        Swiatlo status = Swiatlo.ZOLTE;
        System.out.println(status.getKomunikat());

        PizzaClass pizza = PizzaClass.SREDNIA;
        System.out.println(pizza.getCena());
    }
}
