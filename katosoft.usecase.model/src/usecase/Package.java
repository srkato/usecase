/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.Package#getPakageable <em>Pakageable</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement, Pakageable {
	/**
	 * Returns the value of the '<em><b>Pakageable</b></em>' containment reference list.
	 * The list contents are of type {@link usecase.Pakageable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pakageable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pakageable</em>' containment reference list.
	 * @see usecase.UsecasePackage#getPackage_Pakageable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pakageable> getPakageable();

} // Package
