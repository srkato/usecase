/**
 */
package usecase.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import usecase.Condition;
import usecase.ModelElement;
import usecase.NamedElement;
import usecase.Scenario;
import usecase.Step;
import usecase.UseCase;
import usecase.UsecasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link usecase.impl.ScenarioImpl#getName <em>Name</em>}</li>
 *   <li>{@link usecase.impl.ScenarioImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link usecase.impl.ScenarioImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link usecase.impl.ScenarioImpl#getOwnedUsecase <em>Owned Usecase</em>}</li>
 *   <li>{@link usecase.impl.ScenarioImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link usecase.impl.ScenarioImpl#getGuardCondition <em>Guard Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends StepImpl implements Scenario {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGuardCondition() <em>Guard Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition guardCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsecasePackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.SCENARIO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.SCENARIO__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getExplanation() {
//		StringBuffer text = new StringBuffer();
//		text.append(getName()).append(System.getProperty("line.separator"));
//		int no = 0;
//		for (Step step : getSteps()) {
//			text.append(getLabel() + ".").append(no).append(":").append(step.getExplanation());
//			text.append(System.getProperty("line.separator"));
//		}
//		return text.toString();
		return toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetExplanation() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, UsecasePackage.SCENARIO__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getOwnedUsecase() {
		if (eContainerFeatureID() != UsecasePackage.SCENARIO__OWNED_USECASE) return null;
		return (UseCase)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedUsecase(UseCase newOwnedUsecase, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnedUsecase, UsecasePackage.SCENARIO__OWNED_USECASE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedUsecase(UseCase newOwnedUsecase) {
		if (newOwnedUsecase != eInternalContainer() || (eContainerFeatureID() != UsecasePackage.SCENARIO__OWNED_USECASE && newOwnedUsecase != null)) {
			if (EcoreUtil.isAncestor(this, newOwnedUsecase))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnedUsecase != null)
				msgs = ((InternalEObject)newOwnedUsecase).eInverseAdd(this, UsecasePackage.USE_CASE__SCENARIO, UseCase.class, msgs);
			msgs = basicSetOwnedUsecase(newOwnedUsecase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.SCENARIO__OWNED_USECASE, newOwnedUsecase, newOwnedUsecase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.SCENARIO__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getGuardCondition() {
		return guardCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardCondition(Condition newGuardCondition, NotificationChain msgs) {
		Condition oldGuardCondition = guardCondition;
		guardCondition = newGuardCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UsecasePackage.SCENARIO__GUARD_CONDITION, oldGuardCondition, newGuardCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardCondition(Condition newGuardCondition) {
		if (newGuardCondition != guardCondition) {
			NotificationChain msgs = null;
			if (guardCondition != null)
				msgs = ((InternalEObject)guardCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UsecasePackage.SCENARIO__GUARD_CONDITION, null, msgs);
			if (newGuardCondition != null)
				msgs = ((InternalEObject)newGuardCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UsecasePackage.SCENARIO__GUARD_CONDITION, null, msgs);
			msgs = basicSetGuardCondition(newGuardCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsecasePackage.SCENARIO__GUARD_CONDITION, newGuardCondition, newGuardCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnedUsecase((UseCase)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UsecasePackage.SCENARIO__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				return basicSetOwnedUsecase(null, msgs);
			case UsecasePackage.SCENARIO__GUARD_CONDITION:
				return basicSetGuardCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				return eInternalContainer().eInverseRemove(this, UsecasePackage.USE_CASE__SCENARIO, UseCase.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UsecasePackage.SCENARIO__NAME:
				return getName();
			case UsecasePackage.SCENARIO__DESCRIPTION:
				return getDescription();
			case UsecasePackage.SCENARIO__STEPS:
				return getSteps();
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				return getOwnedUsecase();
			case UsecasePackage.SCENARIO__LABEL:
				return getLabel();
			case UsecasePackage.SCENARIO__GUARD_CONDITION:
				return getGuardCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UsecasePackage.SCENARIO__NAME:
				setName((String)newValue);
				return;
			case UsecasePackage.SCENARIO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UsecasePackage.SCENARIO__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends Step>)newValue);
				return;
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				setOwnedUsecase((UseCase)newValue);
				return;
			case UsecasePackage.SCENARIO__LABEL:
				setLabel((String)newValue);
				return;
			case UsecasePackage.SCENARIO__GUARD_CONDITION:
				setGuardCondition((Condition)newValue);
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
			case UsecasePackage.SCENARIO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UsecasePackage.SCENARIO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UsecasePackage.SCENARIO__STEPS:
				getSteps().clear();
				return;
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				setOwnedUsecase((UseCase)null);
				return;
			case UsecasePackage.SCENARIO__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case UsecasePackage.SCENARIO__GUARD_CONDITION:
				setGuardCondition((Condition)null);
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
			case UsecasePackage.SCENARIO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UsecasePackage.SCENARIO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UsecasePackage.SCENARIO__STEPS:
				return steps != null && !steps.isEmpty();
			case UsecasePackage.SCENARIO__OWNED_USECASE:
				return getOwnedUsecase() != null;
			case UsecasePackage.SCENARIO__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case UsecasePackage.SCENARIO__GUARD_CONDITION:
				return guardCondition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case UsecasePackage.SCENARIO__NAME: return UsecasePackage.NAMED_ELEMENT__NAME;
				case UsecasePackage.SCENARIO__DESCRIPTION: return UsecasePackage.NAMED_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case UsecasePackage.NAMED_ELEMENT__NAME: return UsecasePackage.SCENARIO__NAME;
				case UsecasePackage.NAMED_ELEMENT__DESCRIPTION: return UsecasePackage.SCENARIO__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ScenarioImpl
