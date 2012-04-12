package br.com.caelum.aeris;

import org.jboss.seam.mock.AbstractSeamTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class JUnitSeamTest extends AbstractSeamTest {
	// Exemplo, auxiliar est�tica para chamar m�todos n�o static em um m�todo est�tico.
	private static JUnitSeamTest seamTest = new JUnitSeamTest();
	private static boolean batch = false;

	/*
	 * JUnit test life cycle methods.
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		if (!batch) {
			seamTest.startContainer();
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		if (!batch) {
			seamTest.stopContainer();
		}
	}

	@Before
	public void setUp() throws Exception {
		setupClass();
		begin();
	}

	@After
	public void tearDown() throws Exception {
		end();
		cleanupClass();
	}

	/*
	 * Helper methods
	 */

	// Inicia o JBoss incorporado container ejb.
	public void startContainer() throws Exception {
		super.startSeam();
	}

	// P�ra o JBoss incorporado container ejb.
	public void stopContainer() throws Exception {
		super.stopSeam();
	}

	public boolean isBatch() {
		return batch;
	}

	// Usada por um corredor JUnit.Suite para definir o sinalizador de lote.
//	public void setBatch(final boolean fBatch) {
//		batch = fBatch;
//	}
}
