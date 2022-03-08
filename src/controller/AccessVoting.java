package controller;
import java.util.Scanner;

import model.VotingBean;
import view.DisplayVoting;

public class AccessVoting {
	
	public static void getInfo(VotingBean votes){
		Scanner userIn = new Scanner(System.in);
		String voterId;
		String voterFirstName;
		String voterLastName;
		int voterAge;
		String presCandidate;
		String vicePresCandidate;
		int choice = 0;
		
		System.out.println("\nWELCOME TO THE COMELEC ELECTIONS");
		System.out.println("1-PRESS TO VOTE");
		System.out.println("2-COUNT THE VOTES");
		System.out.println("3-LIST ALL VOTERS");
		System.out.println("4-PROGRAM TERMINATION");
		System.out.print("\nEnter your choice: ");
		choice = userIn.nextInt();
		userIn.nextLine();
		
		switch(choice){
			case 1:
				if(VotingBean.index != 3){
					System.out.print("\nEnter Voter's ID: ");
					voterId = userIn.nextLine();
					votes.setVoterId(voterId);
					
					System.out.print("Enter Last Name: ");
					voterLastName = userIn.nextLine();
					votes.setVoterLastName(voterLastName);
					System.out.print("Enter First Name: ");
					voterFirstName = userIn.nextLine();
					votes.setVoterFirstName(voterFirstName);
					votes.addVoterNameToList();
					
					System.out.print("Enter Age: ");
					voterAge = userIn.nextInt();
					userIn.nextLine();
					
					while(voterAge < 18 || voterAge > 150){
						System.out.print("\nPlease Enter A Valid Age: ");
						voterAge = userIn.nextInt();
						userIn.nextLine();
					}
					
					votes.setVoterAge(voterAge);
					
					System.out.print("Enter Presidential Candidate: ");
					presCandidate = userIn.nextLine();
					votes.setPresCandidate(presCandidate);
					System.out.print("Enter Vice Presidential Candidate: ");
					vicePresCandidate = userIn.nextLine();
					votes.setVicePresCandidate(vicePresCandidate);
					
					votes.countVotes();
					
					System.out.println("\nTHANK YOU FOR VOTING!");
					
					break;
				}else{
					System.out.println("\nMaximum Length of Voters Reached!");
					break;
				}
				
				
			case 2:
				DisplayVoting.displayVotes();
				break;
				
			case 3: 
				DisplayVoting.displayListofVoters();
				break;
				
			case 4:
				System.out.println("\nProgram Exited. Thank You For Using the Application");
				userIn.close();
				System.exit(0);
				
			default:
				System.out.println("\nInvalid Input. Try Again!");
				break;
		}
	}
	
	public static void main(String[] args) {
		VotingBean votes = new VotingBean();

		while(true){
			getInfo(votes);
		}
		
	}

}
