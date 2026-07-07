import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class FileManagement {
    private String fileName;

    public FileManagement(String fileName) {
        this.fileName = fileName;
    }
    
    public void writeFile(String data){
       try{
           File f = new File(fileName);
           f.createNewFile();
           
           FileWriter fw = new FileWriter(f);
           fw.write(data);
           fw.close();
           
           System.out.println(fileName + " written successfully");
       }
       catch(IOException e){
           System.out.println("Error writing file " + e.getMessage());
       }
    }
    
    public void appendFile(String data){
        try{
            File f = new File(fileName);
            f.createNewFile();
            
            FileWriter fw =new FileWriter(f,true);
            fw.write(data + "\n");
            fw.close();
            
            System.out.println("Data added to " + fileName);
        }
        catch(IOException e){
            System.out.println("Error opening file to add " + e.getMessage());
        }
    }
    
    public void readFile(){
        try{
            File f = new File(fileName);
            if(!f.exists()){
                System.out.println(fileName + " does not exist");
                return;
            }
            
            Scanner read = new Scanner(f);
         
            System.out.println("------ " + fileName + " content ------");
            
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
        }
        catch(Exception e){
            System.out.println("Error reading file " + e.getMessage());
        }
    }
    
    public boolean checkLogin(String email, String password, String role){
    try{
        File f = new File("users.txt");
        if (!f.exists()) {
            System.out.println("Error: users.txt nahi mili!");
            return false;
        }
        
        Scanner read = new Scanner(f);

        while(read.hasNextLine()){
            String line = read.nextLine().trim();
            if(line.isEmpty()) continue;
            
            String[] data = line.split(",");

    
            if(data.length >= 5){
                String fileEmail = data[1].trim();
                String filePassword = data[2].trim();
                String fileRole = data[4].trim();

                
                if(fileEmail.equalsIgnoreCase(email.trim())
                        && filePassword.equals(password.trim())
                        && fileRole.equalsIgnoreCase(role.trim())){

                    read.close();
                    return true;
                }
            }
        }
        read.close();
    }
    catch(Exception e){
        System.out.println("Login check error: " + e.getMessage());
    }
    return false;
}
    
    public Freelancer getFreelancer(String email, String password) {
    try {
        java.io.File f = new java.io.File("users.txt");
        if (!f.exists()) {
            System.out.println("Error: users.txt file nahi mili!");
            return null;
        }

        java.util.Scanner read = new java.util.Scanner(f);

        while (read.hasNextLine()) {
            String line = read.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] data = line.split(",");

            
            if (data.length >= 6) {
                String fileEmail = data[1].trim();
                String filePassword = data[2].trim();

                String inputEmail = email.trim();
                String inputPassword = password.trim();

                System.out.println("Comparing File Email: [" + fileEmail + "] with Input Email: [" + inputEmail + "]");

              
                if (fileEmail.equalsIgnoreCase(inputEmail) && filePassword.equals(inputPassword)) {
                    read.close();
                    System.out.println("-> MATCH FOUND! Fetching real data from file.");

                   
                    String actualName = data[0].trim();
                    String actualPhone = data[3].trim();
                    String fileSkills = data[5].trim(); 

                   
                    java.util.ArrayList<String> actualSkills = new java.util.ArrayList<>();
                    if (!fileSkills.isEmpty() && !fileSkills.equalsIgnoreCase("No skills added")) {
                      
                        String[] skillsArray = fileSkills.split("\\|"); 
                        for (String s : skillsArray) {
                            actualSkills.add(s.trim());
                        }
                    } else {
                        actualSkills.add("No skills added yet");
                    }

                  
                  
                    return new Freelancer(
                            actualName,       
                            fileEmail,        
                            filePassword,    
                            actualSkills,    
                            20.0             
                    );
                }
            }
        }
        read.close();
        System.out.println("-> NO MATCH: email or password doesnt match.");

    } catch (Exception e) {
        System.out.println("Exception in getFreelancer: " + e);
        e.printStackTrace();
    }

    return null;
}
    
    
    public void loadJobsToTable(DefaultTableModel model) {
        try {
            File f = new File(this.fileName); 
            if (!f.exists()) {
                System.out.println("Error: File not found!");
                return;
            }

            
            model.setRowCount(0);

            Scanner read = new Scanner(f);
            while (read.hasNextLine()) {
                String line = read.nextLine().trim();
                if (line.isEmpty()) continue; // to skip empty line

                String[] data = line.split(","); 
                model.addRow(data); 
            }
            read.close();
        } catch (Exception e) {
            System.out.println("Error showing data in Table" + e.getMessage());
        }
    }
    
    public Client getClient(String email, String password) {

        try {
            File f = new File("users.txt");

            if (!f.exists()) {
                System.out.println("Error: users.txt file not found");
                return null;
            }

            Scanner read = new Scanner(f);

            while (read.hasNextLine()) {

                String line = read.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] data = line.split(",");

                if (data.length >= 5) {

                    String fileEmail = data[1].trim();
                    String filePassword = data[2].trim();
                    String fileRole = data[4].trim();
                    

                    String inputEmail = email.trim();
                    String inputPassword = password.trim();

                    System.out.println("Comparing File Email: [" + fileEmail + "] with Input Email: [" + inputEmail + "]");
                    System.out.println("Comparing File Pass: [" + filePassword + "] with Input Pass: [" + inputPassword + "]");

                    if (fileEmail.equalsIgnoreCase(inputEmail)
                            && filePassword.equals(inputPassword)
                            && fileRole.equalsIgnoreCase("Client")) {

                        read.close();

                        System.out.println("-> MATCH FOUND! Client successfully created.");
                        String actualName = data[0].trim();
                        String companyName = (data.length >= 6) ? data[5].trim() : "No Company";
                        return new Client(
                            actualName,      // Name (data[0])
                            fileEmail,       // Email (data[1])
                            filePassword,    // Password (data[2])
                            companyName   // Company name ya Phone (data[3])
                    );
            
                    }
                }
            }

            read.close();
            System.out.println("-> NO MATCH: Client email/password role mismatch.");

        } catch (Exception e) {
            System.out.println("Exception in getClient: " + e);
        }

        return null;
    }
    
    public void updateFreelancerProfile(Freelancer updatedFreelancer) {

    try {

        File f = new File("users.txt");

        ArrayList<String> lines = new ArrayList<>();

        Scanner read = new Scanner(f);

        while(read.hasNextLine()) {

            String line = read.nextLine();

            String[] data = line.split(",");

            if(data.length >= 6) {

                String fileEmail = data[1].trim();

                if(fileEmail.equalsIgnoreCase(updatedFreelancer.getemail())) {

                    String updatedSkills =
                        String.join("|", updatedFreelancer.getSkills());

                    line =
                        updatedFreelancer.getname() + "," +
                        updatedFreelancer.getemail() + "," +
                        updatedFreelancer.getpassword() + "," +
                        data[3] + "," +
                        data[4] + "," +
                        updatedSkills;
                }
            }

            lines.add(line);
        }

        read.close();

        FileWriter fw = new FileWriter(f);

        for(String l : lines) {

            fw.write(l + "\n");

        }

        fw.close();

        System.out.println("Freelancer profile updated successfully!");

    }

    catch(Exception e) {

        System.out.println("Update Error: " + e.getMessage());

    }
}
}
