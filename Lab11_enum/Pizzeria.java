enum PizzaClass{
    MALA(20), SREDNIA(35), DUZA(45);
    private int srednica;

    PizzaClass(int srednica){
        this.srednica = srednica;
    }

    public int getCena(){
        switch (srednica){
            case 20:
                return 24;
            case 35:
                return 34;
            case 45:
                return 50;
        }
        return 0;
    }
}