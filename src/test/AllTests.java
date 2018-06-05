package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlmacenIndiceTest.class, AlmacenIndividualListTest.class, AlmacenIndividualSetTest.class,
		AlmacenMapTest.class, almacenRutaMapeadaTest.class })
public class AllTests {

}
