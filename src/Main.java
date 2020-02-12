import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Main {
    /**
     * Класс для проверки выполнения задания *
     */

    public static final int TARGET_AGE = 18;

    public static void main(String[] args) {
        List<MembersGroup> membersGroups = Arrays.asList(
                new MembersGroup("group 1", Arrays.asList(
                        new Member("Max", 25),
                        new Member("Liza", 34),
                        new Member("Alex", 29),
                        new Member("Tom", 14),
                        new Member("Linda", 43)
                )),
                new MembersGroup("group 2", Arrays.asList(
                        new Member("Tina", 15),
                        new Member("Mike", 13),
                        new Member("Elon", 16),
                        new Member("Bert", 17)
                )),
                new MembersGroup("group 3", Arrays.asList(
                        new Member("Tina", 19),
                        new Member("Mike", 21),
                        new Member("Elon", 32),
                        new Member("Bert", 47)
                )),
                new MembersGroup("group 4", Arrays.asList(
                        new Member("Tina", 18),
                        new Member("Mike", 18),
                        new Member("Elon", 18),
                        new Member("Bert", 18)
                )),
                new MembersGroup("group 5", Arrays.asList(
                        new Member("Tina", 19),
                        new Member("Mike", 21),
                        new Member("Elon", 32),
                        new Member("Bert", 47)
                ))
        );

        Set<String> oldMembers = Finder.findOldMembers(membersGroups, TARGET_AGE);
        List<String> groups = Finder.findGroupsWIthOldMembers(membersGroups, TARGET_AGE);

        System.out.println(oldMembers);     // вывод людей по старому методу
        System.out.println(groups);         // вывод групп людей
    }
}
