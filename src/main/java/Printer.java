public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return paper;
    }

    public void print(int pages, int copies){
        if (this.paper >= pages * copies){
          this.paper -= (copies * pages);
          this.toner -= (copies * pages);
        }
    }

    public void fill(){
        paper = 100;
    }

    public int getToner() {
        return toner;
    }

}
