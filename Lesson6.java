import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Lesson6 {
    public static void main(String[] args) {
        Comparator<people> c = new Comparator<people>() {
            @Override
            public int compare(people o1, people o2) {
                return o2.age - o1.age;
            }
        };
        System.out.println("Set:");
        Set<people> set = new TreeSet<>(c);
        set.add(new people("Nikolsky", "Dmitriy", "Anatol'evich", 33));
        set.add(new people("Filimonov", "Denis", "Viacheslavovich", 39));
        set.add(new people("Konyaev", "Roman", "Sergeevich", 45));
        set.forEach(p -> System.out.println(p.surname + " " + p.name + " " + p.patronymic + " " + p.age));
        System.out.println();

        System.out.println("set_2:");
        set_2 set_2 = new set_2();
        set_2.add(new people("Kiryushkin", "Michail", "Sergeevich", 38));
        set_2.add(new people("Buryakov", "Sergey", "Aleksandrovich", 41));
        set_2.add(new people("Zotov", "Vladimir", "Konstantinovich", 27));

        set_2.items.forEach((p, o) -> System.out.println(p.surname + " " + p.name + " " + p.patronymic + " " + p.age));
        System.out.println();
    }
}