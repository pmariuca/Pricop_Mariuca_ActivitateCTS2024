package teste;

import clase.Persoana;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.IFaraMock;
import teste.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PersoanaTest {

    @org.junit.Test
    public void getSexReturnF() {
        Persoana pers1 = new Persoana("Simona", "6021118520090");
        Assert.assertEquals(pers1.getSex(), "F");
    }

    @org.junit.Test
    public void getSexReturnM() {
        Persoana pers2 = new Persoana("Andrei", "5021118520090");
        Assert.assertEquals(pers2.getSex(), "M");
    }

    @org.junit.Test
    public void getSexReturnLimitaInferioara() {
        Persoana pers2 = new Persoana("Andrei", "1021118520090");
        Assert.assertEquals(pers2.getSex(), "M");
    }

    @org.junit.Test
    @Category(IFaraMock.class)
    public void getSexCrossCheck() {
        String cnp="1021118520090";
        Persoana pers2 = new Persoana("Andrei", cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0)) % 2 ==0){
            sex= String.valueOf('F');
        }else{
            sex=String.valueOf('M');
        }
        Assert.assertEquals(pers2.getSex(), sex);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(IFaraMock.class)
    public void getSexErrorCNPStartWithNumberOutsideCases(){
        Persoana persoana =new Persoana("Andrei","9021118520090");
        persoana.getSex();
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(IFaraMock.class)
    public void getSexErrorCNPStartWithInvalidCharacter(){
        Persoana persoana =new Persoana("Andrei","-021118520090");
        persoana.getSex();
    }

    @org.junit.Test(expected = NullPointerException.class)
    @Category(IFaraMock.class)
    public void getSexErrorCNPIsEmptyString(){
        Persoana persoana =new Persoana("Andrei","");
        persoana.getSex();
    }

    @org.junit.Test(timeout = 200)
    @Category(IFaraMock.class)
    public void getSexPerformance(){
        Persoana persoana =new Persoana("Andrei","1293821039");
        persoana.getSex();
    }

    @org.junit.Test
    @Category(IFaraMock.class)
    public void getSexCorrect(){
        Persoana persoana =new Persoana("Andrei","1293821039");
        Assert.assertEquals(1,persoana.getSex().length());
    }

    @org.junit.Test
    @Category(IFaraMock.class)
    public void getSexCorrectByLetter(){
        Persoana persoana =new Persoana("Andrei","3293821039");
        boolean isCorrect = persoana.getSex().toLowerCase().equals("m") || persoana.getSex().toLowerCase().equals("f");
        assertTrue(isCorrect);
    }
    @org.junit.Test
    @Category(IFaraMock.class)
    public void getSexOrder() {
        Persoana persoana = new Persoana("Andrei", "1021118520090");
        Persoana pers1 = new Persoana("Simona", "6021118520090");
        assertTrue(persoana.getSex().compareTo(pers1.getSex()) > 0);
    }
    @org.junit.Test
    @Category(IFaraMock.class)
    public void getSexRange() {
        Persoana pers1 = new Persoana("Simona", "8021118520090");
        Assert.assertEquals(true, pers1.getSex().equals("F"));
    }
    @org.junit.Test(expected = NullPointerException.class)
    @Category(IFaraMock.class)
    public void getSexExistance() {
        Persoana pers1 = new Persoana("Simona", null);
        pers1.getSex();
    }
    @org.junit.Test(expected = IllegalArgumentException.class)
    @Category(IFaraMock.class)
    public void getSexCardinality() {
        Persoana pers1 = new Persoana("Simona", "0000000000000");
        pers1.getSex();
    }
}