/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.Scenario#getSteps <em>Steps</em>}</li>
 *   <li>{@link usecase.Scenario#getOwnedUsecase <em>Owned Usecase</em>}</li>
 *   <li>{@link usecase.Scenario#getLabel <em>Label</em>}</li>
 *   <li>{@link usecase.Scenario#getGuardCondition <em>Guard Condition</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends Step, NamedElement {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see usecase.UsecasePackage#getScenario_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Owned Usecase</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link usecase.UseCase#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Usecase</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Usecase</em>' container reference.
	 * @see #setOwnedUsecase(UseCase)
	 * @see usecase.UsecasePackage#getScenario_OwnedUsecase()
	 * @see usecase.UseCase#getScenario
	 * @model opposite="scenario" transient="false"
	 * @generated
	 */
	UseCase getOwnedUsecase();

	/**
	 * Sets the value of the '{@link usecase.Scenario#getOwnedUsecase <em>Owned Usecase</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Usecase</em>' container reference.
	 * @see #getOwnedUsecase()
	 * @generated
	 */
	void setOwnedUsecase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see usecase.UsecasePackage#getScenario_Label()
	 * @model default=""
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link usecase.Scenario#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Guard Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Condition</em>' containment reference.
	 * @see #setGuardCondition(Condition)
	 * @see usecase.UsecasePackage#getScenario_GuardCondition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getGuardCondition();

	/**
	 * Sets the value of the '{@link usecase.Scenario#getGuardCondition <em>Guard Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Condition</em>' containment reference.
	 * @see #getGuardCondition()
	 * @generated
	 */
	void setGuardCondition(Condition value);

} // Scenario
