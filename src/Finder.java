import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста. *
     *
     * @param groups    группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public static Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    }

    /**
     * возвращает СПИСОК ИМЕН ГРУПП
     * в которых все люди старше определенного возраста
     * из списка всех групп
     */
    public static List<String> findGroupsWIthOldMembers(List<MembersGroup> groups, int targetAge){
        return groups.stream()
                .filter(group -> group.getMembers().stream()
                        .allMatch(member -> member.getAge() > targetAge)
                )
                .map(MembersGroup::getGroupName)
                .collect(Collectors.toList());
    }
}
