public class MainClass {
    public static void main(String[] args) {
        Man headquarters [] = new Man[9];

        Object I = new Man();

        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                headquarters[i] = new General();
            }
            if (i > 3){
                headquarters[i] = new Soldier();
            }else{
                headquarters[i] = new Commander();
            }
            headquarters[i].setName("man" + i);
        }
        for (int i = 0; i < 9; i++) {
            headquarters[i].report();
            headquarters[i].fight();
            System.out.println("My subordinaters");
            for (Man man: headquarters[i].subordinate()) {
                System.out.println(man.getName());
            }

        }
    }

}
