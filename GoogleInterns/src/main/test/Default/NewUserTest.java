/**
 * 
 */
package Default;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import edu.cvtc.web.model.NewUser;

/**
 * @author Jennifer Diederich
 *
 */
public class NewUserTest {

	@Test
	public void createNewUser() {
		NewUser newUser = new NewUser("Jen", "Diederich", 41, "jdiederich2@student.cvtc.edu", "JDiederich2", "Password");
		assertThat(newUser.toString(), is("Jen Diederich is 41. Email is jdiederich2@student.cvtc.edu. User name is JDiederich2. "
				+ "Password is password"));
	}

}
