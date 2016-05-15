/**
 */
package usecase.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>usecase</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsecaseTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new UsecaseTests("usecase Tests");
		suite.addTestSuite(ScenarioTest.class);
		suite.addTestSuite(ActionStepTest.class);
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(ActorGroupTest.class);
		suite.addTestSuite(IncludeUseCaseTest.class);
		suite.addTestSuite(EndOfUseCaseTest.class);
		suite.addTestSuite(ExceptionalEndTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsecaseTests(String name) {
		super(name);
	}

} //UsecaseTests
