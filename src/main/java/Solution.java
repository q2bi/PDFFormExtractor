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
    	
    	PdfReader reader = new PdfReader( src);
    	AcroFields fields = reader.getAcroFields();
    	Set<String> fldNames = fields.getFields().keySet();
    	for (String fldName : fldNames) {
    	  System.out.println( fldName + ": " + fields.getField( fldName ) );
    	}
    	
    	Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/SAE_Report_Form", "root", "8515111q");
    	Patient_Information_Table p = new Patient_Information_Table();
        p.set("Patient#", fields.getField("Section1_Patient#") );
        p.set("AssignedCase#", fields.getField("Section0_AssignedCase#"));
        p.set("DateOfBirth_DD", fields.getField("Section1_DateOfBirth_DD"));
        p.saveIt();
    	Base.close();
    	
    }
}
