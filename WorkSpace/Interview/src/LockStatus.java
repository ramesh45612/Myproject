
public class LockStatus {

     static  void checkStatus(String accountNumber,String userId){
     String lockedByUser="ramesh";
     if(lockedByUser==null ||"".equals(lockedByUser)||" ".equals(lockedByUser)){
         System.out.println("not locked by any User");
         lockedByUser="editUser";
         
     }
     else if(userId==null&&lockedByUser!=null){
         System.out.println("cancel button");
         lockedByUser=null;
     }
     else{
         System.out.println("locked"+lockedByUser);
     }
     System.out.println("user\t"+lockedByUser);
    }
     
    public static void main(String[] args) {
       checkStatus("AccountNumbe", "ram");  // edit
       checkStatus("AccountNumbe", null); //  cancel
    }
}
