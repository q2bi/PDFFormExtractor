
import org.javalite.activejdbc.Model;

public class patients extends Model{
	static{
		validatePresenceOf("assignedCaseNum","dateOfBirthDD");
    }
}
