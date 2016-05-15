/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.ActorGroup#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getActorGroup()
 * @model
 * @generated
 */
public interface ActorGroup extends Actor {
	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link usecase.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see usecase.UsecasePackage#getActorGroup_Member()
	 * @model
	 * @generated
	 */
	EList<Actor> getMember();

} // ActorGroup
