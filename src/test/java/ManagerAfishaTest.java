import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class ManagerAfishaTest {





    @Test
    public void addingFilmTest() {
        ManagerAfisha managerAfisha = new ManagerAfisha();
        String[] actual = {"Блэдшот"};
        String[] expect = managerAfisha.addFilm("Блэдшот");
        Assertions.assertArrayEquals(actual, expect);

    }

    @Test
    public void findLastTest() {
        ManagerAfisha managerAfisha = new ManagerAfisha(2);
        String actual[] = {"Блэдшот","Отель Белград"};
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Отель Белград");
        String expect[] = managerAfisha.findLast();
        Assertions.assertArrayEquals(actual, expect);
    }


    @Test
    public void findAllTest() {
        ManagerAfisha managerAfisha = new ManagerAfisha();
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Вперед");
        managerAfisha.addFilm("Отель Белград");
        String[] actual = {"Блэдшот", "Вперед", "Отель Белград"};
        String[] expect = managerAfisha.findAll();
        Assertions.assertArrayEquals(actual, expect);

    }
    @Test
    public void equalFindLastTest() {
        ManagerAfisha managerAfisha = new ManagerAfisha(4);
        String actual[] = {"Блэдшот","Блэдшот","Блэдшот","Блэдшот"};
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        String expect[] = managerAfisha.findLast();
       Assertions.assertArrayEquals(actual, expect);
    }
    @Test
    public void bigFindLastTest() {
        ManagerAfisha managerAfisha = new ManagerAfisha(5);
        String actual[] = {"Блэдшот","Блэдшот","Блэдшот","Блэдшот"};
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        managerAfisha.addFilm("Блэдшот");
        String expect[] = managerAfisha.findLast();
        Assertions.assertArrayEquals(actual, expect);
    }

}
