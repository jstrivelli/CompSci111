public class Course
{
	private int section;
	private String name;
	private int numCredits;
	private String instructor;
	private int dept;
	public Course(String name, int dept, int numCredits)
	{
		this.name = name;
		this.dept= dept;
		this.numCredits = numCredits;
	}
	public String getName()
	{
		return name;
	}
	public int getNumCredits()
	{
		return numCredits;
	}
	public String toString()
	{
		return name + " " + numCredits + " " + dept;
	}
	public boolean equals(Course c){
		if(this.name.equals(c.name) && this.dept == c.dept && this.numCredits == c.numCredits)
			return true;
		else
			return false;
	}
}