/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.Actor#getAction <em>Action</em>}</li>
 *   <li>{@link usecase.Actor#getGeneral <em>General</em>}</li>
 *   <li>{@link usecase.Actor#getAllActions <em>All Actions</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Pakageable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Action}.
	 * It is bidirectional and its opposite is '{@link usecase.Action#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see usecase.UsecasePackage#getActor_Action()
	 * @see usecase.Action#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link usecase.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see usecase.UsecasePackage#getActor_General()
	 * @model
	 * @generated
	 */
	EList<Actor> getGeneral();

	/**
	 * Returns the value of the '<em><b>All Actions</b></em>' reference list.
	 * The list contents are of type {@link usecase.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Actions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Actions</em>' reference list.
	 * @see #isSetAllActions()
	 * @see usecase.UsecasePackage#getActor_AllActions()
	 * @model unsettable="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	EList<Action> getAllActions();

	/**
	 * Returns whether the value of the '{@link usecase.Actor#getAllActions <em>All Actions</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Actions</em>' reference list is set.
	 * @see #getAllActions()
	 * @generated
	 */
	boolean isSetAllActions();

} // Actor
