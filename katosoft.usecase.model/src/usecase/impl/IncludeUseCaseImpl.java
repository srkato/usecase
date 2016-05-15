/**
 */
package usecase.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import usecase.IncludeUseCase;
import usecase.Step;
import usecase.UseCase;
import usecase.UsecasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usecase.impl.IncludeUseCaseImpl#getUsecase <em>Usecase</em>}</li>
 *   <li>{@link usecase.impl.IncludeUseCaseImpl#getExceptionFlow <em>Exception Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeUseCaseImpl extends StepImpl implements IncludeUseCase {
	/**
	 * The cached value of the '{@link #getUsecase() <em>Usecase</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsecase()
	 * @generated
	 * @ordered
	 */
	protected UseCase usecase;

	/**
	 * The cached value of the '{@link #getExceptionFlow() <em>Exception Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionFlow()
	 * @generated
	 * @ordered
	 */
	protected Step exceptionFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeUseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.INCLUDE_USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getUsecase() {
		if (usecase != null && usecase.eIsProxy()) {
			InternalEObject oldUsecase = (InternalEObject)usecase;
			usecase = (UseCase)eResolveProxy(oldUsecase);
			if (usecase != oldUsecase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsecasePackage.INCLUDE_USE_CASE__USECASE, oldUsecase, usecase));
			}
		}
		return usecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetUsecase() {
		return usecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsecase(UseCase newUsecase) {
		UseCase oldUsecase = usecase;
		usecase = newUsecase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.INCLUDE_USE_CASE__USECASE, oldUsecase, usecase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step getExceptionFlow() {
		if (exceptionFlow != null && exceptionFlow.eIsProxy()) {
			InternalEObject oldExceptionFlow = (InternalEObject)exceptionFlow;
			exceptionFlow = (Step)eResolveProxy(oldExceptionFlow);
			if (exceptionFlow != oldExceptionFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsecasePackage.INCLUDE_USE_CASE__EXCEPTION_FLOW, oldExceptionFlow, exceptionFlow));
			}
		}
		return exceptionFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step basicGetExceptionFlow() {
		return exceptionFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionFlow(Step newExceptionFlow) {
		Step oldExceptionFlow = exceptionFlow;
		exceptionFlow = newExceptionFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.INCLUDE_USE_CASE__EXCEPTION_FLOW, oldExceptionFlow, exceptionFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsecasePackage.INCLUDE_USE_CASE__USECASE:
				if (resolve) return getUsecase();
				return basicGetUsecase();
			case UsecasePackage.INCLUDE_USE_CASE__EXCEPTION_FLOW:
				if (resolve) return getExceptionFlow();
				return basicGetExceptionFlow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsecasePackage.INCLUDE_USE_CASE__USECASE:
				setUsecase((UseCase)newValue);
				return;
			case UsecasePackage.INCLUDE_USE_CASE__EXCEPTION_FLOW:
				setExceptionFlow((Step)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UsecasePackage.INCLUDE_USE_CASE__USECASE:
				setUsecase((UseCase)null);
				return;
			case UsecasePackage.INCLUDE_USE_CASE__EXCEPTION_FLOW:
				setExceptionFlow((Step)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UsecasePackage.INCLUDE_USE_CASE__USECASE:
				return usecase != null;
			case UsecasePackage.INCLUDE_USE_CASE__EXCEPTION_FLOW:
				return exceptionFlow != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getExplanation() {
		return "<<"+getUsecase().getName()+">>";
	}
	
	@Override
	public boolean isSetExplanation() {
		return (getUsecase() != null);
	}
} //IncludeUseCaseImpl
