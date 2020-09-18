
public class Battle{
	
	// YOUR CODE GOES HERE
	
	String name1,name2;
	float attack1,attack2,defense1,defense2,HP1,HP2;
	int roundNum=0;
	//Default Constructor
	public Battle(){
		name1="";
		name2="";
		attack1=0;
		attack2=0;
		defense1=0;
		defense2=0;
		HP1=0;
		HP2=0;
	}
	
	//Constructor
	public Battle(String n1, float a1, float d1, 
			float H1, String n2, float a2, float d2, float H2){
		name1 = n1;
		name2 = n2;
		attack1 = a1;
		attack2 = a2;
		defense1 = d1;
		defense2 = d2;
		HP1 = H1;
		HP2 = H2;
	}
	
	//Methods

	String getMonster1Name() { return name1; }
	String getMonster2Name() {
		return name2;
	}
	float getMonster1HP() {
		return HP1;
	}
	float getMonster2HP() { return HP2; }
	float getMonster1Attack() { return attack1; }
	float getMonster2Attack() { return attack2; }
	float getMonster1Defense() { return defense1; }
	float getMonster2Defense() { return defense2; }
	
	boolean isMonster1Dead(){
		if(HP1<=0) {
			return true;
		}
		return false;
	}
	boolean isMonster2Dead(){
		if(HP2<=0) {
			return true;
		}
		return false;
	}
	
	void simulateRound() {
		roundNum++;
		System.out.printf("Round " + roundNum + "\n");
		float damage1 = attack1 - defense2;
		float damage2 = attack2 - defense1;
		System.out.printf("Chikapu does " + damage1 + " points of damage to Zarichard\n" + 
				"Zarichard does " + damage2 + " points of damage to Chikapu\n");
		HP1 = HP1 - damage2;
		HP2 = HP2 - damage1;
		System.out.printf("Chikapu:  " + HP1 + "\n" + 
				"Zarichard:  " + HP2 + "\n");
	}
		
	
}
