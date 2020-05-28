package model;

public class Player {
	private long playerld;
	private String name;
	private String country;
	private Skill skill;

	public Player() {
		
	}
	
	public Player(long playerld, String name, String country, Skill skill) {
		this.playerld = playerld;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}

	public long getPlayerld() {
		return playerld;
	}

	public void setPlayerld(long playerld) {
		this.playerld = playerld;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	public void display() {
		System.out.println(this.playerld+"  "+this.name+"  "+this.country);
		/*
		 * if(this.skill.getSkillId()==1) System.out.println("Bowler"); else
		 * System.out.println("Batting");
		 */
	}

}
