package app.structure.services;

import app.structure.entities.RadioStation;
import app.structure.repositories.RadioStationRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
class RadioStationServiceTest {

    @InjectMocks
    private RadioStationService radioStationService;

    @Mock
    private RadioStationRepository radioStationRepository;

    @Test
    public void testGetRadioStationsAreNotNull() {

        // given
        List<RadioStation> radioStationList = new ArrayList<>();
        when(radioStationRepository.getRadioStations()).thenReturn(radioStationList);

        // when
        List<RadioStation> result = radioStationService.getRadioStations();

        // then
        assertNotNull(result);
        assertEquals(radioStationList, result);
    }

    @Test
    public void testRepositoryReturnsNull() {

        // given
        when(radioStationRepository.getRadioStations()).thenReturn(null);

        // when
        List<RadioStation> result = radioStationService.getRadioStations();

        // then
        assertNotNull(result);
    }

    @Test
    public void test() {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("tow");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("");

        List<String> list2 = new ArrayList<>();
        list2.add("one");

        // list.retainAll(list2);
        list.removeIf((element) -> list.contains(element));
        // list.forEach(element -> System.out.println(element));

        // System.out.println(list.containsAll(list2));

        // list.removeIf((element) -> element.isBlank() || element.isEmpty());

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            // System.out.println("que onda" + iterator.next());
        }

        // System.out.println(list.size());

        List<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(2);
        ints.add(11);
        ints.add(4);
        ints.add(0);
        Collections.sort(ints);

        ints.forEach(e -> System.out.println(e));


        var e1 = new Employ(1L, "one", 3);
        var e2 = new Employ(2L, "two", 3);
        var e3 = new Employ(3L, "three", 2);
        var e4 = new Employ(4L, "four", 1);
        var e5 = new Employ(5L, "five", 5);
        var e6 = new Employ(6L, "six", 6);

        List<Employ> employList = new ArrayList<Employ>();
        employList.add(e6);
        employList.add(e5);
        employList.add(e4);
        employList.add(e1);
        employList.add(e2);
        employList.add(e3);

        employList = employList.stream()
                .map(e -> map(e))
                .filter(e -> filter(e))
                .collect(Collectors.toList());

        PriorityQueue<Employ> priority = new PriorityQueue<>(employList);
        // employList.forEach((Employ e) -> priority.add(e));

        var q = priority.stream()
                .filter(e -> filter(e))
                .collect(Collectors.toCollection(PriorityQueue::new));

        System.out.println(priority.poll());
        priority.forEach(p -> {
            System.out.println(p);
        });

        // priority.forEach(System.out::println);


        SortedSet linkedHashSet = new TreeSet();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        // linkedHashSet.add(null);


        linkedHashSet.forEach(s -> {
            System.out.println("s: " + s);
        });

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(null);

        linkedList.forEach(e -> System.out.println(e));

    }

    public Employ map(Employ e) {
        if (e.priority > 3) {
            e.priority = 3;
        }
        return e;
    }

    public boolean filter(Employ e) {
        return (e.priority > 0);
    }

}