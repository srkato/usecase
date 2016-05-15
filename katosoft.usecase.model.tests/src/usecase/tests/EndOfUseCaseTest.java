/**
 */
package usecase.tests;

import junit.textui.TestRunner;

import usecase.EndOfUseCase;
import usecase.UsecaseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>End Of Use Case</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EndOfUseCaseTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EndOfUseCaseTest.class);
	}

	/**
	 * Constructs a new End Of Use Case test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfUseCaseTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this End Of Use Case test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EndOfUseCase getFixture() {
		return (EndOfUseCase)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecaseFactory.eINSTANCE.createEndOfUseCase());
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

} //EndOfUseCaseTest
