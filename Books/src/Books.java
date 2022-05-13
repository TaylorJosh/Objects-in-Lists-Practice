public class Books {
    private String title;
    private int numOfPages;
    private int publicationYear;
  
    public Books(String title, int numOfPages, int publicationYear) {
      this.title = title;
      this.numOfPages = numOfPages;
      this.publicationYear = publicationYear;
    }
  
    public String getTitle() {
      return title;
    }
  
    public int getNumOfPages() {
      return numOfPages;
    }

    public int getPublicationYear() {
      return publicationYear;
    }
  
    @Override
    public String toString() {
        return getTitle() + ", " + getNumOfPages() + " pages, " + getPublicationYear();
    }
  }
