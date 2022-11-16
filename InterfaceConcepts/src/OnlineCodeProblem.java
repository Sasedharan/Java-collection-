
 abstract class OnlineCodeProblem implements EmpRules {
    public void dressCode() {
        System.out.println("Black");
    }

    public void salary() {
        System.out.println("No Salary");
    }

    public void holiday() {
        System.out.println("Parent class - No Holiday");
    }

//    public void workingHrs() {
//        System.out.println("Parent class - 24X7");
//    }
}
    class ChildOnlineCodeProblem extends OnlineCodeProblem{

    public void workingHrs(){
        System.out.println("Child Class- 24/7");
    }
        public void holiday() {
        System.out.println("Child Class - No Holiday");
    }
}



