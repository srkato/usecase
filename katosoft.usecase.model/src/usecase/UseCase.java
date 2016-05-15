/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.UseCase#getScenario <em>Scenario</em>}</li>
 *   <li>{@link usecase.UseCase#getPreCondition <em>Pre Condition</em>}</li>
 *   <li>{@link usecase.UseCase#getPostCondition <em>Post Condition</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends Pakageable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Scenario}.
	 * It is bidirectional and its opposite is '{@link usecase.Scenario#getOwnedUsecase <em>Owned Usecase</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see usecase.UsecasePackage#getUseCase_Scenario()
	 * @see usecase.Scenario#getOwnedUsecase
	 * @model opposite="ownedUsecase" containment="true" required="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Pre Condition</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Condition</em>' containment reference list.
	 * @see usecase.UsecasePackage#getUseCase_PreCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getPreCondition();

	/**
	 * Returns the value of the '<em><b>Post Condition</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Condition</em>' containment reference list.
	 * @see usecase.UsecasePackage#getUseCase_PostCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getPostCondition();

} // UseCase
