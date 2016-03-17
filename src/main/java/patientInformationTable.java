import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.DbName;
import org.javalite.activejdbc.annotations.IdName;
import org.javalite.activejdbc.annotations.Table;

@DbName("SAE_Report_Form")
@Table("Patient_Information_Table")
@IdName("PatientNum")
public class patientInformationTable extends Model {
    static{
        validatePresenceOf("PatientNum", "AssignedCaseNum", "PatientInitials", "DateOfBirth_DD", "DateOfBirth_MMM", "DateOfBirth_YYYY", "SEX", "Weight", "Weight_Unit", "Height", "Height_Unit", "Race");
    }
    
    public void setPatientNum(String name) {
        set("PatientNum", name);
    }

    public String getPatientNum() {
        if (get("PatientNum") != null) {
            return getString("PatientNum");
        }
        return null;
    }
    
    public void setAssignedCaseNum(String caseNum) {
        set("AssignedCaseNum", caseNum);
    }

    public String getAssignedCaseNum() {
        if (get("AssignedCaseNum") != null) {
            return getString("AssignedCaseNum");
        }
        return null;
    }
    
    public void setPatientInitials(String patientInitials) {
        set("PatientInitials", patientInitials);
    }

    public String getPatientInitials() {
        if (get("PatientInitials") != null) {
            return getString("PatientInitials");
        }
        return null;
    }
    
    public void setDateOfBirth_DD(String DateOfBirth_DD) {
        set("DateOfBirth_DD", DateOfBirth_DD);
    }

    public String getDateOfBirth_DD() {
        if (get("DateOfBirth_DD") != null) {
            return getString("DateOfBirth_DD");
        }
        return null;
    }
    
//    public void setDateOfBirth_MMM(String DateOfBirth_DD) {
//        set("DateOfBirth_DD", DateOfBirth_DD);
//    }
//
//    public String getDateOfBirth_DD() {
//        if (get("DateOfBirth_DD") != null) {
//            return getString("DateOfBirth_DD");
//        }
//        return null;
//    }
    
 
}
