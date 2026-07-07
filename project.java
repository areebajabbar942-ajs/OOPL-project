public class Project {
    private String title;
    private String description;
    private double budget;
    private Client client;
    private boolean isCompleted;

    public Project(String title, String description, double budget, Client client) {
        this.title = title;
        this.description = description;
        this.budget = budget;
        this.client = client;
        this.isCompleted = false;
    }
    public void markCompleted(){
        isCompleted = true;
        System.out.println("Project '" + title +"'marked as completed.");
    }
public void showProjectDetails(){
    System.out.println("\n====Project Details=====");
    System.out.println("Title: " +title );
    System.out.println("Description " + description);
    System.out.println("Budjet: $" + budget);
    System.out.println("Client: "+ client.getname());
    System.out.println("Status: "+(isCompleted? "Completed":"In Progress"));
    
}
    public String getTitle() {
        return title;
    }

    public double getBudjet() {
        return budget;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    
    
    
    
}