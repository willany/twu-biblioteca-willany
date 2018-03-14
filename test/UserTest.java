import org.junit.Test;

public class UserTest {

    Librarian librarian;

    @Test
    public void validateCostumerDetails(){
        assert("Willany Silva\n Haysa Rodrigues", librarian.listOfUsersWhoCheckedOutBook());
    }
}
