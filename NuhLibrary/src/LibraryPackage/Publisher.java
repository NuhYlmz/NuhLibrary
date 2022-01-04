package LibraryPackage;
public class Publisher
{
	private String name;
	private int numOfBooks=0;
	public Publisher()
	{
		
	}
	public Publisher(String name)
	{
		this.name=name;
	}
	public void publisherInfo()
	{
		if(name!=null)
		{
			System.out.println("**************************************");
			System.out.println("Publisher Name = "+name);
			System.out.println("Book of Publisher = "+numOfBooks);
			System.out.println("**************************************");
		}
	}
	
	public int numOfBooks()
	{
		return this.numOfBooks;
	}
	
	//(Baþlangýç)Getter Setter
	public String getName()
	{
		return name;
	}
	public int getNumOfBooks()
	{
		return numOfBooks();
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNumOfBooks(int numOfBooks)
	{
		this.numOfBooks=numOfBooks;
	}
	//(Bitiþ)Getter Setter
}