abstract public class School
{
   private int enrollment;
   private String name;
   public abstract void describeSchool();

   public interface schoolSystem {
      public static final String SCHOOL_SYSTEM_NAME = "Radford City Schools";
      public static final String PHONE_NUMBER = "(540)731-3647";
      public static final String SUPERINTENDENT = "Robert Graham";
      public static final String ADDRESS = "1612 Wadsworth Street Radford, VA 24141";
   }
   public void setName(String school)
   {
      name = school;
   }
   public String getName()
   {
      return name;
   }
}