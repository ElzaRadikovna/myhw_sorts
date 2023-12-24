import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void testSortFewTickets() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Kazan", 1500, 8, 10);
        Ticket ticket2 = new Ticket("Moscow", "Istanbul", 5000, 10, 14);
        Ticket ticket3 = new Ticket("Kazan", "Tbilisi", 8000, 4, 14);
        Ticket ticket4 = new Ticket("Moscow", "Tokio", 15000, 2, 18);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2000, 8, 8);
        Ticket ticket6 = new Ticket("Moscow", "Kazan", 1200, 9, 12);
        Ticket ticket7 = new Ticket("Ufa", "Kazan", 900, 8, 9);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 700, 6, 7);
        Ticket ticket9 = new Ticket("Ufa", "Sochi", 1100, 8, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] actual = manager.search("Moscow", "Kazan");
        Ticket[] expected = {ticket8, ticket6, ticket1, ticket5};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortOneTickets() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Kazan", 1500, 8, 10);
        Ticket ticket2 = new Ticket("Moscow", "Istanbul", 5000, 10, 14);
        Ticket ticket3 = new Ticket("Kazan", "Tbilisi", 8000, 4, 14);
        Ticket ticket4 = new Ticket("Moscow", "Tokio", 15000, 2, 18);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2000, 8, 8);
        Ticket ticket6 = new Ticket("Moscow", "Kazan", 1200, 9, 12);
        Ticket ticket7 = new Ticket("Ufa", "Kazan", 900, 8, 9);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 700, 6, 7);
        Ticket ticket9 = new Ticket("Ufa", "Sochi", 1100, 8, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] actual = manager.search("Kazan", "Tbilisi");
        Ticket[] expected = {ticket3};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortZeroTickets() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Kazan", 1500, 8, 10);
        Ticket ticket2 = new Ticket("Moscow", "Istanbul", 5000, 10, 14);
        Ticket ticket3 = new Ticket("Kazan", "Tbilisi", 8000, 4, 14);
        Ticket ticket4 = new Ticket("Moscow", "Tokio", 15000, 2, 18);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2000, 8, 8);
        Ticket ticket6 = new Ticket("Moscow", "Kazan", 1200, 9, 12);
        Ticket ticket7 = new Ticket("Ufa", "Kazan", 900, 8, 9);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 700, 6, 7);
        Ticket ticket9 = new Ticket("Ufa", "Sochi", 1100, 8, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Ticket[] actual = manager.search("Kazan", "Moscow");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortFewTicketsComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Kazan", 1500, 8, 10);
        Ticket ticket2 = new Ticket("Moscow", "Istanbul", 5000, 10, 14);
        Ticket ticket3 = new Ticket("Kazan", "Tbilisi", 8000, 4, 14);
        Ticket ticket4 = new Ticket("Moscow", "Tokio", 15000, 2, 18);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2000, 8, 8);
        Ticket ticket6 = new Ticket("Moscow", "Kazan", 1200, 9, 12);
        Ticket ticket7 = new Ticket("Ufa", "Kazan", 900, 8, 9);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 700, 6, 7);
        Ticket ticket9 = new Ticket("Ufa", "Sochi", 1100, 8, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.search("Moscow", "Kazan", comparator);
        Ticket[] expected = {ticket5, ticket8, ticket1, ticket6};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortOneTicketsComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Kazan", 1500, 8, 10);
        Ticket ticket2 = new Ticket("Moscow", "Istanbul", 5000, 10, 14);
        Ticket ticket3 = new Ticket("Kazan", "Tbilisi", 8000, 4, 14);
        Ticket ticket4 = new Ticket("Moscow", "Tokio", 15000, 2, 18);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2000, 8, 8);
        Ticket ticket6 = new Ticket("Moscow", "Kazan", 1200, 9, 12);
        Ticket ticket7 = new Ticket("Ufa", "Kazan", 900, 8, 9);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 700, 6, 7);
        Ticket ticket9 = new Ticket("Ufa", "Sochi", 1100, 8, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.search("Ufa", "Sochi", comparator);
        Ticket[] expected = {ticket9};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortZeroTicketsComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket("Moscow", "Kazan", 1500, 8, 10);
        Ticket ticket2 = new Ticket("Moscow", "Istanbul", 5000, 10, 14);
        Ticket ticket3 = new Ticket("Kazan", "Tbilisi", 8000, 4, 14);
        Ticket ticket4 = new Ticket("Moscow", "Tokio", 15000, 2, 18);
        Ticket ticket5 = new Ticket("Moscow", "Kazan", 2000, 8, 8);
        Ticket ticket6 = new Ticket("Moscow", "Kazan", 1200, 9, 12);
        Ticket ticket7 = new Ticket("Ufa", "Kazan", 900, 8, 9);
        Ticket ticket8 = new Ticket("Moscow", "Kazan", 700, 6, 7);
        Ticket ticket9 = new Ticket("Ufa", "Sochi", 1100, 8, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.search("Ufa", "Moscow", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);

    }

}
