import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(5,5);
        assertEquals(75, printer.getPaper());
    }

    @Test
    public void cantPrintNotEnoughPaper(){
        printer.print(10, 12);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canRefill(){
        printer.fill();
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canReduce(){
        printer.print(2,5);
        assertEquals(90, printer.getToner());
    }

    @Test
    public void cantPrintNotEnoughToner(){
        printer.print(10, 12);
        assertEquals(100, printer.getToner() );
    }
}
