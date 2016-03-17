import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;
import org.javalite.activejdbc.Base;
 
public class Solution {
 
    public static final String SRC = "fillable_form.pdf";
 
    public static void main(String[] args) throws IOException {
    	Solution app = new Solution();
        app.getCheckboxValue(SRC);
    }
 
    public void getCheckboxValue(String src) throws IOException {
    	
    	PdfReader reader = new PdfReader("fillable_form.pdf");
    	AcroFields fields = reader.getAcroFields();
    	
//    	Set<String> fldNames = fields.getFields().keySet();
//    	for (String fldName : fldNames) {
//    	  System.out.println( fldName + ": " + fields.getField( fldName ) );
//    	}
    	
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/SAE_Report_Form", "root", "8515111q");

	    patientinformations p = new patientinformations();
	    p.set("PatientNum", fields.getField("Section1_Patient#").toString());
	    p.set("AssignedCaseNum", fields.getField("Section0_AssignedCase#").toString());
	    p.set("PatientInitials", fields.getField("Section1_PatientInitials").toString());
	    p.set("DateOfBirth_DD", fields.getField("Section1_DateOfBirth_DD").toString());
	    p.set("DateOfBirth_MMM", fields.getField("Section1_DateOfBirth_MMM").toString());
	    p.set("DateOfBirth_YYYY", fields.getField("Section1_DateOfBirth_YYYY").toString());
	    p.set("SEX", fields.getField("Section1_Sex_Radio").toString());
	    p.set("Weight", fields.getField("Section1_Weight").toString());
		p.set("Weight_Unit", fields.getField("Section1_Weight_Unit_Radio").toString());
	    p.set("Height", fields.getField("Section1_Height").toString());
	  p.set("Height_Unit", fields.getField("Section1_Height_Radio").toString());
	  p.set("Race", fields.getField("Section1_Race_Radio").toString());
	  p.saveIt();
	  Base.close();
    	
    }
}
