/**
 */
package usecase.tests;

import junit.textui.TestRunner;

import usecase.ExceptionalEnd;
import usecase.UsecaseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exceptional End</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceptionalEndTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExceptionalEndTest.class);
	}

	/**
	 * Constructs a new Exceptional End test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionalEndTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exceptional End test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExceptionalEnd getFixture() {
		return (ExceptionalEnd)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecaseFactory.eINSTANCE.createExceptionalEnd());
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

} //ExceptionalEndTest
