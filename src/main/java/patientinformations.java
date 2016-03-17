import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.DbName;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

public class patientinformations extends Model {
    static{
        validatePresenceOf("PatientNum", "AssignedCaseNum", "PatientInitials", "DateOfBirth_DD", "DateOfBirth_MMM", "DateOfBirth_YYYY", "SEX", "Weight", "Weight_Unit", "Height", "Height_Unit", "Race");
    }
 
}
