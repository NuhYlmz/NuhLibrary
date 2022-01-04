package LibraryPackage;
public class Book
{
	private String name;
	private int year;
	private int numOfPages=0;
	private boolean isLoaned=false;
	private Author author;
	private Publisher publisher;
	public Book(String name,int year)
	{
		this.name=name;
		this.year=year;
		Library.totalCount++;
	}
	public Book(String name,int year,int numOfPages)
	{
		this.name=name;
		this.year=year;
		this.numOfPages=numOfPages;
		Library.totalCount++;
	}
	public void bookInfo()
	{
		System.out.println("**************************************");
		System.out.println("BOOK NAME: "+name);
		System.out.println("YEAR: "+year);
		System.out.println("PAGE COUNT: "+numOfPages);
		if (author.getLastName()==null)
			System.out.println("AUTHOR: "+author.getFirstName());
		else
		System.out.println("AUTHOR: "+author.getFirstName()+" "+author.getLastName());
		System.out.println("PUBLISHER: "+publisher.getName());
		System.out.println("LOANED?:"+(isLoaned==true ? "YES":"NO"));
		System.out.println("**************************************");
	}
	
	public boolean isLoaned()
	{
		return this.isLoaned;
	}
	
	public void loanBook()
	{
		this.isLoaned=true;
		Library.loanedCount++;		
	}
	//(Baþlangýç)Getter Setter
	public Author getAuthor()
	{
		return this.author;
	}
	public Publisher getPublisher()
	{
		return this.publisher;
	}
	public void setAuthor(Author author)
	{
		this.author=author;
	}
	public void setPublisher(Publisher publisher)
	{
		this.publisher=publisher;
	}
	public String getName()
	{
		return name;
	}
	public int getYear()
	{
		return year;
	}
	public int getNumOfPages()
	{
		return numOfPages;
	}
	public boolean getIsLoaned()
	{
		return isLoaned;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setYear(int year)
	{
		if(year<=2015 && year>=100)
		{
			this.year=year;
		}
		else
			System.out.println("HATA!!! Geçersiz Tarih");
	}
	public void setNumOfPages(int numOfPages)
	{
		this.numOfPages=numOfPages;
	}
	public void setIsLoaned(boolean isLoaned)
	{
		if(isLoaned==true)
		{
			Library.loanedCount++;
			this.isLoaned=isLoaned;
		}	
		else
		{
			Library.loanedCount--;
			this.isLoaned=isLoaned;
		}
		
	}
	//(Bitiþ)Getter Setter
}