package activejdbc.examples.simple;

import java.io.IOException;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;


public class SimpleExample {
    final static Logger logger = LoggerFactory.getLogger(SimpleExample.class);
    protected static AcroFields fields;
    public static void main(String[] args) throws IOException {
    	PdfReader reader = new PdfReader("fillable_form.pdf");
    	fields = reader.getAcroFields();
    	
    	
        Base.open("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/SAE_Report_Form", "root", "8515111q");

        createEmployee();
//        logger.info("=========> Created employee:");
//        selectEmployee();
//        updateEmployee();
//        logger.info("=========> Updated employee:");
//        selectAllEmployees();
//        deleteEmployee();
//        logger.info("=========> Deleted employee:");
//        selectAllEmployees();
//        createEmployee();
//        logger.info("=========> Created employee:");
//        selectEmployee();
//        deleteAllEmployees();
//        logger.info("=========> Deleted all employees:");
//        selectAllEmployees();

        Base.close();
    }

    private static void createEmployee() {
//        Employee e = new Employee();
//        e.set("first_name", "John");
//        e.set("last_name", "Doe");
//        e.saveIt();

    	
//        patients p = new patients();
//        p.set("AssignedCaseNum", fields.getField("Section0_AssignedCase#"));
//        p.set("DateOfBirthDD", "abcd");
//        p.saveIt();
    	

    	
    	sectionzeros p0 = new sectionzeros();
    	
//    	 p0.set("AssignedCase#",fields.getField("Section0_AssignedCase#").toString());
//    	 p0.set("PrimaryAdverseEventTerm",fields.getField("Section0_PrimaryAdverseEventTerm").toString());
//    	 p0.set("Page#",fields.getField("Section0_Page#").toString());
//    	 p0.set("PageOf#",fields.getField("Section0_PageOf#").toString());
//    	 p0.set("DateOfReport_DD",fields.getField("Section0_DateOfReport_DD").toString());
//    	 p0.set("DateOfReport_MMM",fields.getField("Section0_DateOfReport_MMM").toString());
//    	 p0.set("DateOfReport_YYYY",fields.getField("Section0_DateOfReport_YYYY").toString());
//    	 p0.set("Protocol#",fields.getField("Section0_Protocol#").toString());
//    	 p0.set("Site#",fields.getField("Section0_Site#").toString());
//    	 p0.set("Initial_Report_Boolean",fields.getField("Section0_Initial_Report_Boolean").toString());
//    	 p0.set("FollowUpReport#",fields.getField("Section0_FollowUpReportNum").toString());
//    	 p0.set("ProtocolTitle",fields.getField("Section0_ProtocolTitle").toString());
    	 
    	 
//    	 p0.set("AssignedCase#","1");
//    	 p0.set("PrimaryAdverseEventTerm","1");
//    	 p0.set("Page#","1");
//    	 p0.set("PageOf#","1");
//    	 p0.set("DateOfReport_DD","1");
//    	 p0.set("DateOfReport_MMM","1");
//    	 p0.set("DateOfReport_YYYY","1");
//    	 p0.set("Protocol#","1");
//    	 p0.set("Site#","1");
//    	 p0.set("Initial_Report_Boolean","1");
//    	 p0.set("FollowUpReport#","1");
//    	 p0.set("ProtocolTitle","1");
//    	 p0.saveIt();
    	
	  patientinformations p = new patientinformations();
	  p.set("AssignedCaseNum", fields.getField("Section0_AssignedCase#").toString());
	  p.set("PatientNum", fields.getField("Section1_Patient#").toString());
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
    	  
        
    }

//    private static void selectEmployee() {
//        Employee e = Employee.findFirst("first_name = ?", "John");
//        logger.info(e.toString());
//    }
//
//    private static void updateEmployee() {
//        Employee e = Employee.findFirst("first_name = ?", "John");
//        e.set("last_name", "Steinbeck").saveIt();
//    }
//
//    private static void deleteEmployee() {
//        Employee e = Employee.findFirst("first_name = ?", "John");
//        e.delete();
//    }
//
//    private static void deleteAllEmployees() {
//            Employee.deleteAll();
//    }
//
//    private static void selectAllEmployees() {
//            logger.info("Employees list: " + Employee.findAll());
//    }
}
