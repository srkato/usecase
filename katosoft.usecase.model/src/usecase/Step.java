/**
 */
package usecase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link usecase.Step#getExplanation <em>Explanation</em>}</li>
 *   <li>{@link usecase.Step#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see usecase.UsecasePackage#getStep()
 * @model abstract="true"
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Explanation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explanation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explanation</em>' attribute.
	 * @see #isSetExplanation()
	 * @see usecase.UsecasePackage#getStep_Explanation()
	 * @model unsettable="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getExplanation();

	/**
	 * Returns whether the value of the '{@link usecase.Step#getExplanation <em>Explanation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Explanation</em>' attribute is set.
	 * @see #getExplanation()
	 * @generated
	 */
	boolean isSetExplanation();

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link usecase.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see usecase.UsecasePackage#getStep_Next()
	 * @model
	 * @generated
	 */
	EList<Step> getNext();

} // Step
