package LibraryPackage;
public class Library 
{
	public static int totalCount=0;
	public static int loanedCount=0;
	public static String currentLibraryStatus()
	{
		return "*************************************"+
		"\n"+"LOANED: "+ loanedCount +
		"\n"+"EXISTING: " + (totalCount-loanedCount)+
		"\n"+"TOTAL: "+ totalCount+
		"\n"+"*************************************";
	}
	public static void setAuthor(Author a1,Book b1)
	{
		b1.setAuthor(a1);
		a1.setNumOfBooks(a1.getNumOfBooks()+1);
	}
	public static void setPublisher(Publisher p2,Book b2)
	{
		b2.setPublisher(p2);
		p2.setNumOfBooks(p2.getNumOfBooks()+1);
	}
	public static void main(String[] args) 
	{
		Book book01 = new Book("Sefiller",1862);
		Book book02 = new Book("Notre-Dame'ýn Kamburu",1831,784);
		Book book03 = new Book("Gülen Adam",1869);
		Book book04 = new Book("Deniz Ýþçileri",1866,465);
		Book book05 = new Book("Suç ve Ceza",1862,1300);
		Book book06 = new Book("Karamazov Kardeþler",1881,3247);
		Book book07 = new Book("Kumarbaz",1867);
		Book book08 = new Book("Tutunamayanlar",1972,645);
		Book book09 = new Book("Tehlikeli Oyunlar",1973);
		Book book10 = new Book("Bir Bilim Adamýnýn Romaný",1975);
		
		Author author01 = new Author("Victor","Hugo");
		Author author02 = new Author("Dostoyevski");
		Author author03 = new Author("Oðuz","Atay");
		
		Publisher publisher01 = new Publisher("Huzur Kýrtasiye");
		Publisher publisher02 = new Publisher("Ötüken");
		Publisher publisher03 = new Publisher();
		
		setAuthor(author01, book01);
		setAuthor(author01, book02);
		setAuthor(author01, book03);
		setAuthor(author01, book04);
		setAuthor(author02, book05);
		setAuthor(author02, book06);
		setAuthor(author02, book07);
		setAuthor(author03, book08);
		setAuthor(author03, book09);
		setAuthor(author03, book10);
		
		setPublisher(publisher01, book01);
		setPublisher(publisher01, book02);
		setPublisher(publisher01, book03);
		setPublisher(publisher01, book04);
		setPublisher(publisher01, book05);
		setPublisher(publisher02, book06);
		setPublisher(publisher02, book07);
		setPublisher(publisher02, book08);
		setPublisher(publisher02, book09);
		setPublisher(publisher02, book10);
		
		book01.loanBook();
		
		book01.bookInfo();
		book02.bookInfo();
		book03.bookInfo();
		book04.bookInfo();
		book05.bookInfo();
		book06.bookInfo();
		book07.bookInfo();
		book08.bookInfo();
		book09.bookInfo();
		book10.bookInfo();
		
		author01.authorInfo();
		author02.authorInfo();
		author03.authorInfo();
		
		publisher01.publisherInfo();
		publisher02.publisherInfo();
		publisher03.publisherInfo();

		System.out.printf(currentLibraryStatus());
	}
}