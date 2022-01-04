package LibraryPackage;
public class Author
{
	private String firstName;
	private String lastName;
	private int numOfBooks=0;
	public Author(String firstName)
	{
		this.firstName=firstName;
	}
	public Author(String firstName,String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public void authorInfo()
	{
		System.out.println("**************************************");
		System.out.println("Author Name = "+firstName);
		if(lastName!=null)
			System.out.println("Author Name = "+lastName);
		System.out.println("Number of books = "+numOfBooks);
		System.out.println("**************************************");
	}
	public int numOfBooks()
	{
		return this.numOfBooks;
	}
	
	//(Baþlangýç)Getter Setter
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getNumOfBooks()
	{
		return numOfBooks;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public void setNumOfBooks(int numOfBooks)
	{
		this.numOfBooks=numOfBooks;
	}
	//(Bitiþ)Getter Setter
}