package soy.LOLI.sumador;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SumadorApplicationTest {

    private Sumador sumador = new Sumador();


    @Test

    public void testSum() {

         assertEquals(5, sumador.suma(2, 3));

    }    

}


