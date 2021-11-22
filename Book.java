//class
public class Book
{
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardcover;


//constructor
public Book(String t, String a, int y, int p, boolean h)
{
  title = t;
  author = a;
  year = y;
  numPages = p;
  hardcover = h;
}
//accessor methods
public String getTitle()
{
  return title;
}

public String getAuthor()
{
  return author;
}

public int getYear()
{
  return year;
}

public int getNumPages()
{
  return numPages;
}

public boolean getHardcover()
{
  return hardcover;
}

//mutator methods
public void setTitle(String t)
{
  title=t;
}
public void setAuthor(String a)
{
  author=a;
}
public void setYear(int y)
{
  year=y;
}
public void setNumPages(int p)
{
  numPages=p;
}
public void setHardcover(boolean h)
{
  hardcover=h;
}

//other methods
public boolean equals(Book b)
{
  if(this.getTitle().equals(b.getTitle()))
  {
    return true;
  }
  else
  {
    return false;
  }
}




//to string
public String toString()
{
  String str = "";
  str = "Title: "+title+" \nAuthor: "+author+"\nYear: "+year+"\n# of Pages: "+numPages+"\nHard Cover: "+hardcover;
  return str;
}
}
