import org.javalite.activejdbc.Model;

public class Patient_Information_Table extends Model {
    static{
        validatePresenceOf("Patient#, AssignedCase#, DateOfBirth_DD");
    }
}
