/**
 */
package usecase.impl;

import org.eclipse.emf.ecore.EClass;

import usecase.EndOfUseCase;
import usecase.UsecasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Of Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EndOfUseCaseImpl extends StepImpl implements EndOfUseCase {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndOfUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.END_OF_USE_CASE;
	}

	@Override
	public String getExplanation() {
		return "End of Use Case";
	}
	
	@Override
	public boolean isSetExplanation() {
		return true;
	}
} //EndOfUseCaseImpl
