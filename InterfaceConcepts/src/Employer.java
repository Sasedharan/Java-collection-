
public class Employer implements EmpRules,otherRules {
    public static void main(String[] args) {

        EmpRules e1 = new Employer();
        otherRules o = new Employer();
        o.bikeRide();
        o.wearHelmet();
        e1.holiday();
        e1.salary();
        System.out.println(e1.ta);
        System.out.println(e1.income);
    }
        public void holiday() {
            System.out.println("Sunday");
        }
        public void salary() {
            System.out.println("40000");
        }
        public void dressCode() {
            System.out.println("Formal");
        }
        public void workingHrs() {
            System.out.println("Sunday");
        }
    public void bikeRide(){
        System.out.println("Speed Limit is 50");
    }
    public void wearHelmet(){
        System.out.println("Safety Precaution");
         }
    }

