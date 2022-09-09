import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class ManagerAfishaTest {
    String array []= {"Блэдшот","Вперед", "Отель Белград"};



@Test
   public void addFilmTest(){
   ManagerAfisha managerAfisha = new ManagerAfisha();
  managerAfisha.setAfisha(array) ;
  String[] actual = {"Блэдшот", "Вперед", "Отель Белград","Серж"};
String nweFilm ="Серж";
String [] expect = managerAfisha.addFilm(nweFilm);
   Assertions.assertArrayEquals(actual,expect);

}
    @Test
    public void addingFilmTest(){
        ManagerAfisha managerAfisha = new ManagerAfisha();
        String[] actual = {"Блэдшот"};
        String [] expect = managerAfisha.addFilm("Блэдшот");
        Assertions.assertArrayEquals(actual,expect);

    }




}
