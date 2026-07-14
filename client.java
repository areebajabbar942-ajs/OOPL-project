import java.util.ArrayList;
import java.util.List;

public class Client extends User {

    private String companyName;
    private String name;
    private List<Job> jobs;
    
    

   public Client(String name, String email, String password, String companyName) {

        super(name,email,password);

        this.companyName = companyName;
        this.jobs = new ArrayList<>();
    }

    public Client(String companyName, List<Job> jobs, String name, String email, String password) {
        super(name, email, password);
        this.companyName = companyName;
        this.jobs = jobs;
    }

    public Job postJob(int jobId, String title, String description, double budget , String deadline) {

        Job job = new Job(jobId, title, description, budget, getName() , deadline);

        jobs.add(job);

        return job;
    }
    
    public String getName(){
        return super.getname();
    }
    
    public void setName(String name) {
        this.name = name; 
    }

    public String getJobs() {
        String result = "";
        for(Job j : jobs){
           result = (" " + j + "\n");
        }
        return result;
    }
    
    public void setCompanyBio(String companyBio) {
        this.companyName = companyBio;
    }

    public String getCompanyName() {
        return companyName;
    }
    
    public List<Job> getJobsList() {
        return jobs;
    }
}
