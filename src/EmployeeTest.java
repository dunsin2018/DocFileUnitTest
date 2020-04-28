import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void getNameTest (){

        Employee employee = new Employee();
        //Arrange
        String firstName = "Duncan";
        String lastName = "Favored";
        String expected = "Duncan Favored";
        String actual;

        //ACT
        actual = Employee.getName (firstName, lastName);

        //Assert
        assertEquals ( expected,actual );
    }
}
