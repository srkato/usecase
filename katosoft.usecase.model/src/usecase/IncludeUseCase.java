/**
 */
package usecase;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.IncludeUseCase#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link usecase.IncludeUseCase#getExceptionFlow <em>Exception Flow</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getIncludeUseCase()
 * @model
 * @generated
 */
public interface IncludeUseCase extends Step {
	/**
	 * Returns the value of the '<em><b>Usecase</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usecase</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usecase</em>' reference.
	 * @see #setUsecase(UseCase)
	 * @see usecase.UsecasePackage#getIncludeUseCase_Usecase()
	 * @model required="true"
	 * @generated
	 */
	UseCase getUsecase();

	/**
	 * Sets the value of the '{@link usecase.IncludeUseCase#getUsecase <em>Usecase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usecase</em>' reference.
	 * @see #getUsecase()
	 * @generated
	 */
	void setUsecase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Exception Flow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Flow</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Flow</em>' reference.
	 * @see #setExceptionFlow(Step)
	 * @see usecase.UsecasePackage#getIncludeUseCase_ExceptionFlow()
	 * @model
	 * @generated
	 */
	Step getExceptionFlow();

	/**
	 * Sets the value of the '{@link usecase.IncludeUseCase#getExceptionFlow <em>Exception Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Flow</em>' reference.
	 * @see #getExceptionFlow()
	 * @generated
	 */
	void setExceptionFlow(Step value);

} // IncludeUseCase
