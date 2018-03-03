
class EnumInsideClass {
    
    enum MonthConstants{
       JAN,FEB;
    }

}

public class EnumInsideClassM{
    
    enum MonthCon{
        JANNEW, FEBNEW
    }
    
    public static void main(String[] args) {
        EnumInsideClass.MonthConstants jan = EnumInsideClass.MonthConstants.JAN;
        System.out.println(jan);//JAN
        //MonthConstants m = MonthConstants.JAN //Wrong
        MonthCon ob = MonthCon.JANNEW;
        System.out.println(ob); //JANNEW
        EnumInsideClassM.MonthCon jan1 = MonthCon.JANNEW;
        System.out.println(jan1); //JANNEW
        
        EnumInsideClassM.MonthCon jan2 = EnumInsideClassM.MonthCon.JANNEW;
        System.out.println(jan2); //JANNEW
    }
    
}