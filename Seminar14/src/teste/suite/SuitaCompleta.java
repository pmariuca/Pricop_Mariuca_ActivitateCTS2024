package teste.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
public class SuitaCompleta {
 // ruleaza toate testele
}
