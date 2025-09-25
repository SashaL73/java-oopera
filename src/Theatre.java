public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Sara","Conor",Gender.FEMALE,170);
        Actor actor2 = new Actor("Jon","Snow",Gender.MALE,150);
        Actor actor3 = new Actor("Al","Pacino",Gender.MALE,121);
        Actor actor4 = new Actor("Konstantin","Velikomorskih",Gender.MALE,210);

        Director director1 = new Director("Aleksej","Balabanov",Gender.MALE, 5874);
        Director director2 = new Director("Steven","Spilberg",Gender.MALE, 60);

        Show show = new Show("TheGrateShow",60, director1);
        Opera opera = new Opera("MagnificentOpera",120,director1,"Rahmaninov","text",30);
        Ballet balet = new Ballet("ExcellentBallet",120,director2,"Tchaikovsky","text","choreography");

        show.addActor(actor1);
        show.addActor(actor3);
        show.addActor(actor2);
        opera.addActor(actor1);
        opera.addActor(actor2);
        opera.addActor(actor3);
        balet.addActor(actor3);
        balet.addActor(actor2);
        balet.addActor(actor4);

        System.out.println("Актеры шоу - " + show.getTitle());
        show.printActors();
        System.out.println();
        System.out.println("Актеры шоу - " + opera.getTitle());
        opera.printActors();
        System.out.println();
        System.out.println("Актеры шоу - " + balet.getTitle());
        balet.printActors();

        show.replaceActor(actor4,"Conor");
        System.out.println();
        System.out.println("Актеры шоу - " + show.getTitle());
        show.printActors();

        System.out.println();
        show.replaceActor(actor2,"Acterov");
        System.out.println();
        System.out.println("Либретто оперы - " + opera.getTitle());
        opera.printLibretto();
        System.out.println();
        System.out.println("Либретто балета - " + balet.getTitle());
        balet.printLibretto();
    }
}
