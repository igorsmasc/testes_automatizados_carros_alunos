package service;


import model.Carro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarroServiceImplTest {

    /**
     *
     * Annotations
     *
     * Antes de cada caso de teste
     * @Before -> Junit 4
     * @BeforeEach -> Junit 5
     *
     * Após cada caso de teste
     * @After -> Junit 4
     * @AfterEach -> Junit 5
     *
     * Antes da classe de teste
     * @BeforeClass -> Junit 4
     * @BeforeAll -> Junit 5
     *
     * Após a classe de teste
     * @AfterClass -> Junit 4
     * @AfterAll -> Junit 5
     *
     * Pula um teste especifico
     * @Ignore -> Junit 4
     * @Disabled -> Junit 5
     *
     *
     * --------
     * Assertivas
     *
     * Classe das assertivas
     * Assert -> Junit 4
     * Assertion -> Junit 5
     *
     * Metodos
     *
     * fail - fail
     * assertTrue - assertTrue
     * assertFalse - assertFalse
     * assertSame - assertSame
     * assertNotSame - assertNotSame
     * assertEquals - assertEquals
     * assertNotEquals - assertNotEquals
     * assertThrows - assertThrows
     * assertNull - assertNull
     * assertNotNull - assertNotNull
     * assertArrayEquals - assertArrayEquals*
     *
     *
     * assertThat - N/A
     *
     *
     * Novas Junit 5
     * assertAll
     *
     */

    /**
     *
     * assertThrows
     * Junit 4.13+
     *
     */


//    @Test
//    public void testJunit4() {
//        Assert.assertEquals(1, 1);
//    }

    @Test
    public void testJunit5() {
    }

    @Test
    public void deveLancarExceptionQuandoAcelerarValorNegativo() {
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("cor", "marca", "2000", "modelo");

        Throwable throwable = Assertions.assertThrows(Exception.class,
                () -> carroService.acelerar(carro, -10)
        );

        Assertions.assertEquals("A velocidad deve ser maior que zero", throwable.getMessage());
    }

    @Test
    public void deveLancarExceptionQuandoFrearMenorQueUm() {
        CarroService carroService = new CarroServiceImpl();
        Carro carro = new Carro("cor", "marca", "2000", "modelo");

        // Lambda Functions
        Assertions.assertThrows(Exception.class,
                () -> carroService.frear(carro, -10));
    }
}
