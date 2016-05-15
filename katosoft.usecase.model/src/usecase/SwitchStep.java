/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.SwitchStep#getCase <em>Case</em>}</li>
 *   <li>{@link usecase.SwitchStep#getDefaultStep <em>Default Step</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getSwitchStep()
 * @model
 * @generated
 */
public interface SwitchStep extends Step {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference list.
	 * @see usecase.UsecasePackage#getSwitchStep_Case()
	 * @model containment="true"
	 * @generated
	 */
	EList<Case> getCase();

	/**
	 * Returns the value of the '<em><b>Default Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Step</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Step</em>' reference.
	 * @see #setDefaultStep(Step)
	 * @see usecase.UsecasePackage#getSwitchStep_DefaultStep()
	 * @model
	 * @generated
	 */
	Step getDefaultStep();

	/**
	 * Sets the value of the '{@link usecase.SwitchStep#getDefaultStep <em>Default Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Step</em>' reference.
	 * @see #getDefaultStep()
	 * @generated
	 */
	void setDefaultStep(Step value);

} // SwitchStep
