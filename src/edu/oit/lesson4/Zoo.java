package edu.oit.lesson4;

public class Zoo {
    public String type = "Zoo";
    private String name;
    private String address;
    public Zoo(String name,  String address) {
        this.name = name;
        this.address=address;
    }
public Zoo () {
	
}
   
    public static void main(String[] args) {
        Zoo sanDiegoZoo = new Zoo( "San Diego Zoo", "San Pasqual Valley");
       
        
    	System.out.println(sanDiegoZoo.name + " is located at " + sanDiegoZoo.address);
    	
    	Zone rainForest = new Zone();
    	rainForest.setSpecies(200);
    	rainForest.setRareAnimals(50);
    	System.out.println("Rainforest is a zone with  "+ rainForest.getSpecies() + " species and " + rainForest.getRareAnimals() +" rare animals");

    	ZooStaff staff1 = new ZooStaff();
    	staff1.setName("Alex");
    	staff1.setJob("feeder");
    	
    	System.out.println(staff1.getName() + " work as a " + staff1.getJob() + ".");
    	
    }
}



class Zone extends Zoo {
	
	
	private int species;
	private int rareAnimals;
	public int getSpecies(){
		return species;
	}
	public void setSpecies(int species){
		this.species = species;
	}	
	public int getRareAnimals(){
		return rareAnimals;
	}
	public void setRareAnimals(int rareAnimals){
		this.rareAnimals = rareAnimals;
	}
	
}


class ZooStaff extends Zone {
	
	private String job;
	private String name;
	public String getJob(){
		return job;
	}
	public void setJob(String job){
		this.job = job;
	}	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}	
	
}