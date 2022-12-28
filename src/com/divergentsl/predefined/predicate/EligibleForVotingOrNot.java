package com.divergentsl.predefined.predicate;

import java.util.function.Predicate;

class Voter{
	private int age;
	private String name;
	private String nationality;
	
	Voter(int age,String name,String nationality){
		this.age=age;
		this.name=name;
		this.nationality=nationality;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "VoterName:"+name+" VoterAge:"+age+" VoterNationality:"+nationality;
	}
}
public class EligibleForVotingOrNot {
	public static void main(String[] args) {
		Predicate<Voter> eligible= voter->voter.getAge()>18 && voter.getNationality().equals("Indian");		
        Voter[] voters= {
        		    new Voter(12,"Ram","Indian"),
        		    new Voter(20,"Shayam","Indian"),
        		    new Voter(15,"Deepak","UAE"),
        		    new Voter(24,"Dev","UK")
                   };
        for(Voter voter:voters) {
        	if(eligible.test(voter))
        		System.out.println(voter);
        }
        
	}
}
