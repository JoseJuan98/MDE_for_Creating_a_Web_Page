/**
 */
package WorkFlowMM.util;

import WorkFlowMM.Actor;
import WorkFlowMM.CheckBox;
import WorkFlowMM.Data;
import WorkFlowMM.DataGroup;
import WorkFlowMM.Date;
import WorkFlowMM.Decision;
import WorkFlowMM.Extension;
import WorkFlowMM.File;
import WorkFlowMM.Final;
import WorkFlowMM.Image;
import WorkFlowMM.Initial;
import WorkFlowMM.Join;
import WorkFlowMM.Label;
import WorkFlowMM.Message;
import WorkFlowMM.Operation;
import WorkFlowMM.Option;
import WorkFlowMM.Phone;
import WorkFlowMM.Range;
import WorkFlowMM.ReceiveMsg;
import WorkFlowMM.SendMsg;
import WorkFlowMM.ServiceTask;
import WorkFlowMM.Task;
import WorkFlowMM.Text;
import WorkFlowMM.UserTask;
import WorkFlowMM.WorkFlow;
import WorkFlowMM.WorkFlowMMPackage;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see WorkFlowMM.WorkFlowMMPackage
 * @generated
 */
public class WorkFlowMMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WorkFlowMMValidator INSTANCE = new WorkFlowMMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "WorkFlowMM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowMMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WorkFlowMMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WorkFlowMMPackage.WORK_FLOW:
				return validateWorkFlow((WorkFlow)value, diagnostics, context);
			case WorkFlowMMPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case WorkFlowMMPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case WorkFlowMMPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case WorkFlowMMPackage.DECISION:
				return validateDecision((Decision)value, diagnostics, context);
			case WorkFlowMMPackage.SERVICE_TASK:
				return validateServiceTask((ServiceTask)value, diagnostics, context);
			case WorkFlowMMPackage.MESSAGE:
				return validateMessage((Message)value, diagnostics, context);
			case WorkFlowMMPackage.DATA_GROUP:
				return validateDataGroup((DataGroup)value, diagnostics, context);
			case WorkFlowMMPackage.LABEL:
				return validateLabel((Label)value, diagnostics, context);
			case WorkFlowMMPackage.USER_TASK:
				return validateUserTask((UserTask)value, diagnostics, context);
			case WorkFlowMMPackage.INITIAL:
				return validateInitial((Initial)value, diagnostics, context);
			case WorkFlowMMPackage.FINAL:
				return validateFinal((Final)value, diagnostics, context);
			case WorkFlowMMPackage.FILE:
				return validateFile((File)value, diagnostics, context);
			case WorkFlowMMPackage.NUMBER:
				return validateNumber((WorkFlowMM.Number)value, diagnostics, context);
			case WorkFlowMMPackage.TEXT:
				return validateText((Text)value, diagnostics, context);
			case WorkFlowMMPackage.CHECK_BOX:
				return validateCheckBox((CheckBox)value, diagnostics, context);
			case WorkFlowMMPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case WorkFlowMMPackage.SEND_MSG:
				return validateSendMsg((SendMsg)value, diagnostics, context);
			case WorkFlowMMPackage.RECEIVE_MSG:
				return validateReceiveMsg((ReceiveMsg)value, diagnostics, context);
			case WorkFlowMMPackage.DATA:
				return validateData((Data)value, diagnostics, context);
			case WorkFlowMMPackage.IMAGE:
				return validateImage((Image)value, diagnostics, context);
			case WorkFlowMMPackage.RANGE:
				return validateRange((Range)value, diagnostics, context);
			case WorkFlowMMPackage.EXTENSION:
				return validateExtension((Extension)value, diagnostics, context);
			case WorkFlowMMPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case WorkFlowMMPackage.PHONE:
				return validatePhone((Phone)value, diagnostics, context);
			case WorkFlowMMPackage.JOIN:
				return validateJoin((Join)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFlow(WorkFlow workFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkFlow_initialTaskMustBeOne(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkFlow_finalTaskMustBeOne(workFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkFlow_TaskMustBePrecededByOneOperation(workFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the initialTaskMustBeOne constraint of '<em>Work Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFlow_initialTaskMustBeOne(WorkFlow workFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "initialTaskMustBeOne", getObjectLabel(workFlow, context) },
						 new Object[] { workFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the finalTaskMustBeOne constraint of '<em>Work Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFlow_finalTaskMustBeOne(WorkFlow workFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "finalTaskMustBeOne", getObjectLabel(workFlow, context) },
						 new Object[] { workFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the TaskMustBePrecededByOneOperation constraint of '<em>Work Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkFlow_TaskMustBePrecededByOneOperation(WorkFlow workFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TaskMustBePrecededByOneOperation", getObjectLabel(workFlow, context) },
						 new Object[] { workFlow },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(operation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InitialTaskMustNotBePreceded constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_InitialTaskMustNotBePreceded(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "InitialTaskMustNotBePreceded", getObjectLabel(operation, context) },
						 new Object[] { operation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NextOperationMustNotBeItself constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_NextOperationMustNotBeItself(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NextOperationMustNotBeItself", getObjectLabel(operation, context) },
						 new Object[] { operation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the NextOperationToAnotherActorMustNeedASendMsgTask constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NextOperationToAnotherActorMustNeedASendMsgTask", getObjectLabel(operation, context) },
						 new Object[] { operation },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecision(Decision decision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decision, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(decision, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(decision, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(serviceTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(message, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(message, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(message, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataGroup(DataGroup dataGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabel(Label label, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(label, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(label, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(label, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(label, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(label, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(label, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateUserTask_TaskMustHasOneSuccessor(userTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TaskMustHasOneSuccessor constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask_TaskMustHasOneSuccessor(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "TaskMustHasOneSuccessor", getObjectLabel(userTask, context) },
						 new Object[] { userTask },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitial(Initial initial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(initial, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(initial, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(initial, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinal(Final final_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(final_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(final_, diagnostics, context);
		if (result || diagnostics != null) result &= validateFinal_FinalTaskMustNotHasAnySuccessor(final_, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FinalTaskMustNotHasAnySuccessor constraint of '<em>Final</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFinal_FinalTaskMustNotHasAnySuccessor(Final final_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "FinalTaskMustNotHasAnySuccessor", getObjectLabel(final_, context) },
						 new Object[] { final_ },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFile(File file, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(file, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(WorkFlowMM.Number number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(number, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(Text text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(text, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckBox(CheckBox checkBox, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(checkBox, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMsg(SendMsg sendMsg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendMsg, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendMsg_SendMsgMustBeSendToADifferentActorThanItself(sendMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendMsg_SendMsgMustBeConnectToAReceiveMsg(sendMsg, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SendMsgMustBeSendToADifferentActorThanItself constraint of '<em>Send Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMsg_SendMsgMustBeSendToADifferentActorThanItself(SendMsg sendMsg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SendMsgMustBeSendToADifferentActorThanItself", getObjectLabel(sendMsg, context) },
						 new Object[] { sendMsg },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the SendMsgMustBeConnectToAReceiveMsg constraint of '<em>Send Msg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendMsg_SendMsgMustBeConnectToAReceiveMsg(SendMsg sendMsg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SendMsgMustBeConnectToAReceiveMsg", getObjectLabel(sendMsg, context) },
						 new Object[] { sendMsg },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveMsg(ReceiveMsg receiveMsg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(receiveMsg, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(receiveMsg, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(receiveMsg, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateData(Data data, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(data, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImage(Image image, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(image, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRange(Range range, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(range, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtension(Extension extension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(date, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhone(Phone phone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(phone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJoin(Join join, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(join, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_InitialTaskMustNotBePreceded(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationMustNotBeItself(join, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_NextOperationToAnotherActorMustNeedASendMsgTask(join, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WorkFlowMMValidator
