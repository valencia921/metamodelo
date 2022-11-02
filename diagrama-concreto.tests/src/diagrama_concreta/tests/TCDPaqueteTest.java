/**
 */
package diagrama_concreta.tests;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.TCDPaquete;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TCD Paquete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TCDPaqueteTest extends TestCase {

	/**
	 * The fixture for this TCD Paquete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDPaquete fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TCDPaqueteTest.class);
	}

	/**
	 * Constructs a new TCD Paquete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCDPaqueteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TCD Paquete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TCDPaquete fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TCD Paquete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCDPaquete getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Diagrama_concretaFactory.eINSTANCE.createTCDPaquete());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //TCDPaqueteTest
