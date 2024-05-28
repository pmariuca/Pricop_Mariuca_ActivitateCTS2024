package clase;

import static org.junit.Assert.*;

public class PersoanaTest {
    // teste corectitudine
    @org.junit.Test
    public void getSexReturnFeminin6() {
        Persoana persoanaF = new Persoana("Maria", "6020311659866");
        assertEquals("F", persoanaF.getSex());
    }
    @org.junit.Test
    public void getSexReturnFeminin4() {
        Persoana persoanaF = new Persoana("Maria", "4020311659866");
        assertEquals("F", persoanaF.getSex());
    }
    @org.junit.Test
    public void getSexReturnFeminin2() {
        Persoana persoanaF = new Persoana("Maria", "2020311659866");
        assertEquals("F", persoanaF.getSex());
    }

    @org.junit.Test
    public void getSexReturnMasculin5() {
        Persoana persoanaM = new Persoana("Marian", "5020311659866");
        assertEquals("M", persoanaM.getSex());
    }
    @org.junit.Test
    public void getSexReturnMasculin3() {
        Persoana persoanaM = new Persoana("Marian", "3020311659866");
        assertEquals("M", persoanaM.getSex());
    }
    @org.junit.Test
    public void getSexReturnMasculin1() {
        Persoana persoanaM = new Persoana("Marian", "1020311659866");
        assertEquals("M", persoanaM.getSex());
    }

    // teste boundary - pentru valorile 1 si 6
    @org.junit.Test
    public void getSexReturnLimitaInferioara() {
        Persoana persoanaM = new Persoana("Marian", "1020311659866");
        assertEquals("M", persoanaM.getSex());
    }
    @org.junit.Test
    public void getSexReturnLimitaSuperioara() {
        Persoana persoanaF = new Persoana("Marian", "6020311659866");
        assertEquals("F", persoanaF.getSex());
    }

    // teste inverse relationship - nu putem pentru ca nu avem nume

    // teste cross-check
    @org.junit.Test
    public void getSexTestCrossCheckParitate() {
        Persoana persoanaF = new Persoana("Marian", "6020311659866");
        int cheie = Integer.valueOf(persoanaF.CNP.charAt(0));
        String sex = cheie % 2 == 0 ? "F" : "M";
        assertEquals(sex, persoanaF.getSex());
    }

    // teste error condition
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        Persoana persoanaF = new Persoana("Marian", "0020311659866");
        persoanaF.getSex();
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorConditionInvalid() {
        Persoana persoanaF = new Persoana("Marian", "a020311659866");
        persoanaF.getSex();
    }
    @org.junit.Test(expected = NullPointerException.class)
    public void getSexErrorConditionEmptyString() {
        Persoana persoanaF = new Persoana("Marian", "");
        persoanaF.getSex();
    }

    // teste performance
    @org.junit.Test(timeout = 10)
    public void getSexPerformance() {
        Persoana persoanaF = new Persoana("Marian", "8020311659866");
        persoanaF.getSex();
    }

    // teste conformance - format
    @org.junit.Test
    public void getSexConformanceSingurCaracter() {
        Persoana persoana = new Persoana("Marian", "8020311659866");
        String sexPersoana = persoana.getSex();
        assertEquals(1, sexPersoana.length());
    }
    @org.junit.Test
    public void getSexConformanceTipCaracter() {
        Persoana persoana = new Persoana("Marian", "8020311659866");
        String sexPersoana = persoana.getSex();
        Boolean isCorrect = sexPersoana.equals("M") || sexPersoana.equals("F");
        assertTrue(isCorrect);
    }

    // teste ordering
    @org.junit.Test
    public void getSexOrdering() {
        Persoana persoana1 = new Persoana("Maria", "8020311659866");
        Persoana persoana2 = new Persoana("Marian", "7020311659866");
        assertTrue((persoana1.getSex().compareTo(persoana2.getSex())) < 0);
    }

    // teste range
    @org.junit.Test
    public void getSexVerificaInterval8() {
        Persoana persoana = new Persoana("Maria", "8020311659866");
        assertEquals("F", persoana.getSex());
    }

    // teste reference - nu avem referinta

    // teste existance - daca nu exista cnp - empty string + null
    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistanceNull() {
        Persoana persoana = new Persoana("Maria", null);
        persoana.getSex();
    }
}