//import mlp.classroom.*;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//
//import static mlp.classroom.Main.searchClassroom;
//import static mlp.classroom.Main.sortClassroom;
//import static org.assertj.core.api.Assertions.assertThat;
//
//public class MainTest {
//
//    Student a = new Student("Anna", 18, 60, 161, Gender.FEMALE, 2, "2AHITM");
//    Student b = new Student("Bob", 19, 70, 175, Gender.MALE, 3, "3BSCI");
//    Student c = new Student("Charlie", 20, 65, 170, Gender.MALE, 2, "2CMPEN");
//    Student d = new Student("Diana", 21, 55, 160, Gender.FEMALE, 4, "4DSGN");
//    Student e = new Student("Emma", 18, 58, 163, Gender.FEMALE, 1, "1ENG");
//    Student f = new Student("Frank", 22, 75, 180, Gender.MALE, 3, "3PHYS");
//    Student g = new Student("Grace", 20, 62, 167, Gender.FEMALE, 2, "2CHEM");
//    Student h = new Student("Henry", 19, 68, 173, Gender.MALE, 1, "1MATH");
//    Student i = new Student("Isabella", 18, 61, 162, Gender.FEMALE, 2, "2BIO");
//    Teacher j = new Teacher("Stütz", 62, 98, 185, Gender.MALE, "SEW", 9);
//
//    final Person[] classroom = new Person[]{
//            a,
//            b,
//            c,
//            d,
//            e,
//            f,
//            g,
//            h,
//            i,
//            j
//    };
//    @Order(1000)
//    @Test
//    void testingIfBubbleSortWorksInAscending() {
//
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//        sortClassroom(classroom, SortType.BUBBLE, new AgeComparator(), true);
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//
//        assertThat(classroom).isSortedAccordingTo(new AgeComparator());
//
//        assertThat(classroom).containsExactly(
//                a,
//                e,
//                i,
//                b,
//                h,
//                c,
//                g,
//                d,
//                f,
//                j
//        );
//    }
//    @Order(1100)
//    @Test
//    void testingIfInsertionSortWorksInAscending() {
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//        sortClassroom(classroom, SortType.INSERTION, new AgeComparator(), true);
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//
//        assertThat(classroom).isSortedAccordingTo(new AgeComparator());
//
//        assertThat(classroom).containsExactly(
//                a,
//                e,
//                i,
//                b,
//                h,
//                c,
//                g,
//                d,
//                f,
//                j
//        );
//    }
//    @Order(1200)
//    @Test
//    void testingIfSelectionSortWorksInAscending() {
//
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//        sortClassroom(classroom, SortType.SELECTION, new AgeComparator(), true);
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//
//        assertThat(classroom).isSortedAccordingTo(new AgeComparator());
//
//        assertThat(classroom).containsExactly(
//                a,
//                e,
//                i,
//                b,
//                h,
//                c,
//                g,
//                d,
//                f,
//                j
//        );
//
//    }
//    @Order(1300)
//    @Test
//    void testingIfBubbleSortWorksInDecending() {
//
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//
//        sortClassroom(classroom, SortType.BUBBLE, new AgeComparator(), false);
//
//        Arrays.stream(classroom).forEach(System.out::println);
//
//        assertThat(classroom).containsExactly(
//                j,
//                f,
//                d,
//                c,
//                g,
//                b,
//                h,
//                a,
//                e,
//                i
//        );
//    }
//    @Order(1400)
//    @Test
//    void testingIfInsertionSortWorksInDecending() {
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//
//        sortClassroom(classroom, SortType.INSERTION, new AgeComparator(), false);
//
//        Arrays.stream(classroom).forEach(System.out::println);
//
//        assertThat(classroom).containsExactly(
//                j,
//                f,
//                d,
//                c,
//                g,
//                b,
//                h,
//                a,
//                e,
//                i
//        );
//    }
//    @Order(1500)
//    @Test
//    void testingIfSelectionSortWorksInDecending() {
//
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//        sortClassroom(classroom, SortType.SELECTION, new AgeComparator(), false);
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//
//
//        assertThat(classroom).containsExactly(
//                j,
//                f,
//                d,
//                c,
//                g,
//                b,
//                h,
//                a,
//                e,
//                i
//        );
//    }
//
//    @Order(2000)
//    @Test
//    void testingIfSearchingWithBinaryWorks() {
//        sortClassroom(classroom, SortType.BUBBLE, new AgeComparator(), true);
//        Arrays.stream(classroom).forEach(System.out::println);
//        System.out.println();
//        Person found = searchClassroom(SearchType.BINARY ,classroom, new AgeComparator(), h);
//        assertThat(found).isEqualTo(h);
//        System.out.println();
//        System.out.println(found);
//    }
//}
