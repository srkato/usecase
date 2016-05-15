/**
 */
package usecase.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import usecase.Action;
import usecase.ActionStep;
import usecase.Actor;
import usecase.ActorGroup;
import usecase.Condition;
import usecase.EndOfUseCase;
import usecase.ExceptionalEnd;
import usecase.IncludeUseCase;
import usecase.ModelElement;
import usecase.NamedElement;
import usecase.Scenario;
import usecase.UseCase;
import usecase.UseCaseProject;
import usecase.UsecaseFactory;
import usecase.UsecasePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsecaseFactoryImpl extends EFactoryImpl implements UsecaseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UsecaseFactory init() {
		try {
			UsecaseFactory theUsecaseFactory = (UsecaseFactory)EPackage.Registry.INSTANCE.getEFactory(UsecasePackage.eNS_URI);
			if (theUsecaseFactory != null) {
				return theUsecaseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsecaseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsecaseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UsecasePackage.MODEL_ELEMENT: return createModelElement();
			case UsecasePackage.NAMED_ELEMENT: return createNamedElement();
			case UsecasePackage.USE_CASE: return createUseCase();
			case UsecasePackage.PACKAGE: return createPackage();
			case UsecasePackage.SCENARIO: return createScenario();
			case UsecasePackage.ACTION_STEP: return createActionStep();
			case UsecasePackage.ACTOR: return createActor();
			case UsecasePackage.ACTION: return createAction();
			case UsecasePackage.USE_CASE_PROJECT: return createUseCaseProject();
			case UsecasePackage.ACTOR_GROUP: return createActorGroup();
			case UsecasePackage.INCLUDE_USE_CASE: return createIncludeUseCase();
			case UsecasePackage.END_OF_USE_CASE: return createEndOfUseCase();
			case UsecasePackage.EXCEPTIONAL_END: return createExceptionalEnd();
			case UsecasePackage.CONDITION: return createCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelElement createModelElement() {
		ModelElementImpl modelElement = new ModelElementImpl();
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase createUseCase() {
		UseCaseImpl useCase = new UseCaseImpl();
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public usecase.Package createPackage() {
		PackageImpl package_ = new PackageImpl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStep createActionStep() {
		ActionStepImpl actionStep = new ActionStepImpl();
		return actionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCaseProject createUseCaseProject() {
		UseCaseProjectImpl useCaseProject = new UseCaseProjectImpl();
		return useCaseProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorGroup createActorGroup() {
		ActorGroupImpl actorGroup = new ActorGroupImpl();
		return actorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeUseCase createIncludeUseCase() {
		IncludeUseCaseImpl includeUseCase = new IncludeUseCaseImpl();
		return includeUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfUseCase createEndOfUseCase() {
		EndOfUseCaseImpl endOfUseCase = new EndOfUseCaseImpl();
		return endOfUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionalEnd createExceptionalEnd() {
		ExceptionalEndImpl exceptionalEnd = new ExceptionalEndImpl();
		return exceptionalEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsecasePackage getUsecasePackage() {
		return (UsecasePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsecasePackage getPackage() {
		return UsecasePackage.eINSTANCE;
	}

} //UsecaseFactoryImpl
