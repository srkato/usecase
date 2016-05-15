/**
 */
package usecase.tests;

import junit.textui.TestRunner;

import usecase.ActionStep;
import usecase.UsecaseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Action Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionStepTest extends StepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ActionStepTest.class);
	}

	/**
	 * Constructs a new Action Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Action Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ActionStep getFixture() {
		return (ActionStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UsecaseFactory.eINSTANCE.createActionStep());
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

} //ActionStepTest
