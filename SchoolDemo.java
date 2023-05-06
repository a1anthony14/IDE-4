public class SchoolDemo implements School.schoolSystem
{
   public static void main(String[] args)
   {
       ElementarySchool Elementaries = new ElementarySchool();
       MiddleSchool johnNDalton = new MiddleSchool();
       HighSchool RadfordHigh = new HighSchool();
       System.out.println("**********");
       System.out.println("Radford City Public Schools");
       System.out.println("**********");
       System.out.println();

       System.out.println("Elementaries:");
       Elementaries.describeSchool();

       System.out.println("Intermidiate:");
       johnNDalton.describeSchool();

       System.out.println("High Schools:");
       RadfordHigh.describeSchool();
       System.out.println();

       System.out.println("**********");
       System.out.println("School Board");
       System.out.println("**********");
       System.out.println();

       System.out.println(SCHOOL_SYSTEM_NAME);
       System.out.println(ADDRESS);
       System.out.println("Phone:" + PHONE_NUMBER);
       System.out.println("Superintendent:" + SUPERINTENDENT);
   }
}