package teste;

import org.junit.jupiter.api.Test;
import tema1.PerecheNumere;

import static org.junit.jupiter.api.Assertions.*;

public class TesteNumerePereche {
    @Test
    void test1_Fibb() {
        PerecheNumere p = new PerecheNumere(1, 2);
        assertTrue(p.isFibb());
    }
    @Test
    void test2_Fibb(){
        PerecheNumere p = new PerecheNumere(2, 2);
        assertFalse(p.isFibb());
    }
    @Test
    void test3_Fibb(){
        PerecheNumere p = new PerecheNumere(5, 8);
        assertTrue(p.isFibb());
    }
    @Test
    void test1_cmmc(){
        PerecheNumere p = new PerecheNumere(2, 4);
        assertEquals(4,p.cmmc());
    }
    @Test
    void test2_cmmc(){
        PerecheNumere p = new PerecheNumere(1, 2);
        assertFalse(p.cmmc()==1);
    }
    @Test
    void test3_cmmc(){
        PerecheNumere p = new PerecheNumere(5, 8);
        assertTrue(p.cmmc()==40);
    }
    @Test
    void test1_sumaeq(){
        PerecheNumere p = new PerecheNumere(1, 2);
        assertFalse(p.equalSumDigits());
    }
}
