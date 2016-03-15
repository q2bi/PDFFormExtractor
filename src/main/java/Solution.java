import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
 
import java.io.IOException;
import java.util.Set;
 
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
    }
}
