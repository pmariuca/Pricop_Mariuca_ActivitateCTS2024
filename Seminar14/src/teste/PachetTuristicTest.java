package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import org.junit.experimental.categories.Category;
import teste.categorii.ICuMock;
import teste.categorii.IFaraMock;
import teste.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class PachetTuristicTest {
    @org.junit.Test
    @Category(IFaraMock.class)
    public void testeazaCorectitudineAplicaDiscount() {
        IPersoana persoana = new Persoana("Maria", "12403236254373");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana, "Bora bora", 2568.0);

        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(2311.2, pachetTuristic.getPret(), 0);
    }

    @org.junit.Test
    @Category(IFaraMock.class)
    public void testAplicaDiscountBoundary() {
        IPersoana client = new Persoana("Marian", "15903236254373");
        PachetTuristic pachetTuristic = new PachetTuristic(client, "Maldive", 6521.3);
        pachetTuristic.aplicaDiscountVarstnici(10);

        assertEquals(5869.17, pachetTuristic.getPret(), 0);
    }

    @org.junit.Test
    @Category(ICuMock.class)
    public void testeazaAplicaDiscountFake() {
        PersoanaFake fake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(fake, "Maldive", 6521.3);

        fake.setValueGetVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(5869.17, pachetTuristic.getPret(), 0);
    }

    @org.junit.Test
    @Category(ICuMock.class)
    public void testeazaNuAplicaDiscountFake() {
        PersoanaFake fake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(fake, "Maldive", 6521.3);

        fake.setValueGetVarsta(45);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(6521.3, pachetTuristic.getPret(), 0);
    }

    @org.junit.Test
    @Category(ICuMock.class)
    public void testAplicaDiscount100() {
        PersoanaFake fake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(fake, "Maldive", 6521.3);
        fake.setValueGetVarsta(65);

        pachetTuristic.aplicaDiscountVarstnici(100);
        assertEquals(0.0, pachetTuristic.getPret(), 0);
    }

    @org.junit.Test
    @Category(ICuMock.class)
    public void testAplicaDiscount0() {
        PersoanaFake fake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(fake, "Maldive", 6521.3);
        fake.setValueGetVarsta(65);

        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(6521.3, pachetTuristic.getPret(), 0);
    }

    @org.junit.Test
    @Category(ICuMock.class)
    public void testAplicaDiscount1() {
        PersoanaFake fake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(fake, "Maldive", 6521.3);
        fake.setValueGetVarsta(65);

        pachetTuristic.aplicaDiscountVarstnici(1);
        assertEquals(6456.087, pachetTuristic.getPret(), 0);
    }
}