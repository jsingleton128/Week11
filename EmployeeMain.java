public class EmployeeMain {
    public static void main(String[] args) {
        System.out.println("Janitor:");
        Janitor janitor1 = new Janitor();
        janitor1.clean();
        janitor1.showHours();
        janitor1.showSalary();
        janitor1.showVacation();
        System.out.println();
        
        System.out.println("Harvard Lawyer:");
        HarvardLawyer harvardlawyer1 = new HarvardLawyer();
        harvardlawyer1.getVacationForm();
        harvardlawyer1.showSalary();
        harvardlawyer1.showVacation();
        System.out.println();

    }
}