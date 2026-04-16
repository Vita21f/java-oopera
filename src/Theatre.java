import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args){
        Actor actor1 = new Actor("Анатолий", "Петров", Gender.MALE, 186);
        Actor actor2 = new Actor("Александр", "Иванов", Gender.MALE, 173);
        Actor actor3 = new Actor("Екатерина", "Верховская", Gender.FEMALE, 170);

        Director director1 = new Director("Анастасия", "Чубышева", Gender.FEMALE, 26);
        Director director2 = new Director("Иван", "Златковский", Gender.MALE, 41);

        String musicAuthor = "Иванов Иван Иванович";
        String choreographer = "Петров Петр Петрович";

        ArrayList<Actor> showActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();

        Show classisShow = new Show("Вместо тысячи слов", 120, director1, showActors);
        Opera opera = new Opera("Жизнь за царя", 180, director2, operaActors,
                musicAuthor, "Либретто оперы...", 50);
        Ballet ballet = new Ballet("Лебединое озеро", 150, director1, balletActors,
                musicAuthor, "Либретто балета...", choreographer);

        classisShow.addActor(actor1);
        opera.addActor(actor2);
        ballet.addActor(actor3);
        classisShow.addActor(actor3); // Екатерина может участвовать в двух спектаклях
        classisShow.addActor(actor3); //проверка добавления: теперь при выводе предупреждения дубликат не добавляется

        classisShow.printListOfActors();
        opera.printListOfActors();
        ballet.printListOfActors();

        classisShow.replaceActor("Петров", actor2); // меняем Петрова на Иванова

        classisShow.printListOfActors();

        classisShow.replaceActor("Неизвестный", actor2);

        opera.printLibretto();
        ballet.printLibretto();
    }
}












