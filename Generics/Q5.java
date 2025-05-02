import java.util.Arrays;
import java.util.List;

abstract class JobRole{
    private String candidateName;
    private int experience;
    private String role;

    public JobRole(String role, String candidateName, int experience) {
        this.candidateName = candidateName;
        this.experience = experience;
        this.role = role;
    }

    public String getRole() {
        return role;
    }
    public String getCandidateName() {
        return candidateName;
    }

    public int getExperience() {
        return experience;
    }

}

class SoftwareEngineer extends JobRole{
        public SoftwareEngineer(String role, String candidateName, int experience) {
            super(role, candidateName, experience);
        }

}


class ProductManager extends JobRole{
    public ProductManager(String role, String candidateName, int experience) {
        super(role, candidateName, experience);
    }

}

class Resume<T extends JobRole>{
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobRole() {
        return jobRole.getRole();
    }

}


class HandlleJobs{
    public static void getJobRole(List<? extends JobRole> resume){
        for (JobRole i : resume){
            System.out.println(i.getCandidateName() + " " + i.getRole() + " " + i.getExperience());
        }
    }
}

public class Q5 {
    public static void main(String[] args) {

        SoftwareEngineer SE1 = new SoftwareEngineer("jr dev", "John",2);
        SoftwareEngineer SE2 = new SoftwareEngineer("Sr dev", "John",7);
        ProductManager PM1 = new ProductManager("jr pm", "Sav",7);
        Resume<SoftwareEngineer> seResume = new Resume<>(SE1);
        System.out.println(seResume.getJobRole());

        List<JobRole> candidates = Arrays.asList(SE1,SE2,PM1);
        HandlleJobs.getJobRole(candidates);
    }
}
