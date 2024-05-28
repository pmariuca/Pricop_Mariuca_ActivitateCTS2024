package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PersoanaTest;
import teste.categorii.ICuMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory({ICuMock.class})
public class SuitaCustom {
}
