package com.kalkulagailua;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class KalkulagailuaTest {
    @Test 
    void oinarrizkoBatuketaTest(){
        Kalkulagailua kalk=new Kalkulagailua();
        int emaitza=kalk.batu(2,3);
        assertEquals(5, emaitza, "2+3 batuketak 5 izan behar luke");
    }
    @Test 
    void oinarrizkoKenketaTest(){
        Kalkulagailua kalk = new Kalkulagailua();
        int emaitza= kalk.kenketa(3,2);
        assertEquals(1, emaitza,"3-2 kenketak 1 izan behar luke");
    }
    @Test
    void oinarrizkoBiderketaTest(){
        Kalkulagailua kalk = new Kalkulagailua();
        int emaitza= kalk.biderketa(3,2);
        assertEquals(6, emaitza,"3*2 biderketak 6 izan behar luke");
    }


    
}
