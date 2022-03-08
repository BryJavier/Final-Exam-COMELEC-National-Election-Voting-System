package model;

public class VotingBean {
	
	private String voterId;
	private String voterLastName;
	private String voterFirstName;
	private int voterAge;
	private String presCandidate;
	private String vicePresCandidate;
	
	public static String[] listOfVoters = new String[3];
	public static int index = 0;
	
	//President Vote Counters
	public static int duterteCtr = 0;
	public static int robredoCtr = 0;
	
	//Vice President Vote Counters
	public static int poeCtr = 0;
	public static int goCtr = 0;
	
	public VotingBean() {
		
	}
	
	public VotingBean(String voterId, String voterLastName, String voterFirstName,
			int voterAge, String presCandidate, String vicePresCandidate) {
		this.voterId = voterId;
		this.voterLastName = voterLastName;
		this.voterFirstName = voterFirstName;
		this.voterAge = voterAge;
		this.presCandidate = presCandidate;
		this.vicePresCandidate = vicePresCandidate;
	}


	
	public String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}
	
	public void addVoterNameToList(){
		listOfVoters[index] = voterLastName + ", " + voterFirstName;
		++index;
	}
	
	public void countVotes(){
		//Presidential Votes
		if(presCandidate.equals("Duterte")){
			++duterteCtr;
		}else if(presCandidate.equals("Robredo")){
			++robredoCtr;
		}else{
		}
		
		//Vice Presidential Votes
		if(vicePresCandidate.equals("Go")){
			++goCtr;
		}else if(vicePresCandidate.equals("Poe")){
			++poeCtr;
		}else{
		}
	}


	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	public String getVoterLastName() {
		return voterLastName;
	}

	public void setVoterLastName(String voterLastName) {
		voterLastName = capitalizeWord(voterLastName);
		this.voterLastName = voterLastName;
	}

	public String getVoterFirstName() {
		return voterFirstName;
	}

	public void setVoterFirstName(String voterFirstName) {
		voterFirstName = capitalizeWord(voterFirstName);
		this.voterFirstName = voterFirstName;
	}

	public int getVoterAge() {
		return voterAge;
	}

	public void setVoterAge(int voterAge) {
		this.voterAge = voterAge;
	}

	public String getPresCandidate() {
		return presCandidate;
	}

	public void setPresCandidate(String presCandidate) {
		presCandidate = capitalizeWord(presCandidate);
		this.presCandidate = presCandidate;
	}

	public String getVicePresCandidate() {
		return vicePresCandidate;
	}

	public void setVicePresCandidate(String vicePresCandidate) {
		vicePresCandidate = capitalizeWord(vicePresCandidate);
		this.vicePresCandidate = vicePresCandidate;
	}
	
	
	
	

}
