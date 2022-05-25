public class Main {
    public static void main(String[] args) {
        try {
            Pozitie pozitie = new Pozitie(10,10);
            Copac copac = new Copac(12,"verde","mare",pozitie);
            Copac copac1 = (Copac) copac.clone();
            Livada livada = new Livada();
            livada.planteaza(copac);
            livada.planteaza(copac1);
            for (Copac c: livada.getCopaci()) {
                System.out.println(c.getXoY());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
