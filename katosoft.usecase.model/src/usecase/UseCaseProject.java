/**
 */
package usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.UseCaseProject#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getUseCaseProject()
 * @model
 * @generated
 */
public interface UseCaseProject extends usecase.Package {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(Actor)
	 * @see usecase.UsecasePackage#getUseCaseProject_System()
	 * @model
	 * @generated
	 */
	Actor getSystem();

	/**
	 * Sets the value of the '{@link usecase.UseCaseProject#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Actor value);

} // UseCaseProject
