package view;
import model.VotingBean;

public class DisplayVoting {
	public static void displayVotes(){	
		//Presidential Candidate Votes
		if(VotingBean.duterteCtr > VotingBean.robredoCtr){
			System.out.println("\nPresidential Candidate Winner: Duterte(" + VotingBean.duterteCtr + ")");
		}else if(VotingBean.duterteCtr == VotingBean.robredoCtr){
			System.out.println("\nPresidential Candidate Draw: Duterte(" + VotingBean.duterteCtr + ")"
					+ ", Robredo(" + VotingBean.robredoCtr + ")");
		}else{
			System.out.println("\nPresidential Candidate Winner: Robredo(" + VotingBean.robredoCtr + ")");
		}
		
		//Vice Presidential Candidate Votes
		if(VotingBean.goCtr > VotingBean.poeCtr){
			System.out.println("Vice Presidential Candidate Winner: Go(" + VotingBean.goCtr + ")");
		}else if(VotingBean.goCtr == VotingBean.poeCtr){
			System.out.println("Vice Presidential Candidate Draw: Go(" + VotingBean.goCtr + ")"
					+ ", Poe(" + VotingBean.poeCtr + ")");
		}else{
			System.out.println("Vice Presidential Candidate Winner: Poe(" + VotingBean.poeCtr + ")");
		}
	}
	
	public static void displayListofVoters(){
		System.out.println("\nLIST OF VOTERS");
		System.out.println("-------------------");
		for(String name:VotingBean.listOfVoters){
			if(name != null){
				System.out.println(name);
			}
		}
		
	}
}
