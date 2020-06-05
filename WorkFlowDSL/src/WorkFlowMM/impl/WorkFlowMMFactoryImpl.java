/**
 */
package WorkFlowMM.impl;

import WorkFlowMM.Actor;
import WorkFlowMM.CheckBox;
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
import WorkFlowMM.Option;
import WorkFlowMM.Phone;
import WorkFlowMM.Range;
import WorkFlowMM.ReceiveMsg;
import WorkFlowMM.SendMsg;
import WorkFlowMM.ServiceTask;
import WorkFlowMM.Text;
import WorkFlowMM.UserTask;
import WorkFlowMM.WorkFlow;
import WorkFlowMM.WorkFlowMMFactory;
import WorkFlowMM.WorkFlowMMPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkFlowMMFactoryImpl extends EFactoryImpl implements WorkFlowMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkFlowMMFactory init() {
		try {
			WorkFlowMMFactory theWorkFlowMMFactory = (WorkFlowMMFactory)EPackage.Registry.INSTANCE.getEFactory(WorkFlowMMPackage.eNS_URI);
			if (theWorkFlowMMFactory != null) {
				return theWorkFlowMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkFlowMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowMMFactoryImpl() {
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
			case WorkFlowMMPackage.WORK_FLOW: return createWorkFlow();
			case WorkFlowMMPackage.ACTOR: return createActor();
			case WorkFlowMMPackage.DECISION: return createDecision();
			case WorkFlowMMPackage.SERVICE_TASK: return createServiceTask();
			case WorkFlowMMPackage.DATA_GROUP: return createDataGroup();
			case WorkFlowMMPackage.LABEL: return createLabel();
			case WorkFlowMMPackage.USER_TASK: return createUserTask();
			case WorkFlowMMPackage.INITIAL: return createInitial();
			case WorkFlowMMPackage.FINAL: return createFinal();
			case WorkFlowMMPackage.FILE: return createFile();
			case WorkFlowMMPackage.NUMBER: return createNumber();
			case WorkFlowMMPackage.TEXT: return createText();
			case WorkFlowMMPackage.CHECK_BOX: return createCheckBox();
			case WorkFlowMMPackage.OPTION: return createOption();
			case WorkFlowMMPackage.SEND_MSG: return createSendMsg();
			case WorkFlowMMPackage.RECEIVE_MSG: return createReceiveMsg();
			case WorkFlowMMPackage.IMAGE: return createImage();
			case WorkFlowMMPackage.RANGE: return createRange();
			case WorkFlowMMPackage.EXTENSION: return createExtension();
			case WorkFlowMMPackage.DATE: return createDate();
			case WorkFlowMMPackage.PHONE: return createPhone();
			case WorkFlowMMPackage.JOIN: return createJoin();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlow createWorkFlow() {
		WorkFlowImpl workFlow = new WorkFlowImpl();
		return workFlow;
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
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataGroup createDataGroup() {
		DataGroupImpl dataGroup = new DataGroupImpl();
		return dataGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initial createInitial() {
		InitialImpl initial = new InitialImpl();
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Final createFinal() {
		FinalImpl final_ = new FinalImpl();
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowMM.Number createNumber() {
		NumberImpl number = new NumberImpl();
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckBox createCheckBox() {
		CheckBoxImpl checkBox = new CheckBoxImpl();
		return checkBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMsg createSendMsg() {
		SendMsgImpl sendMsg = new SendMsgImpl();
		return sendMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMsg createReceiveMsg() {
		ReceiveMsgImpl receiveMsg = new ReceiveMsgImpl();
		return receiveMsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phone createPhone() {
		PhoneImpl phone = new PhoneImpl();
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkFlowMMPackage getWorkFlowMMPackage() {
		return (WorkFlowMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkFlowMMPackage getPackage() {
		return WorkFlowMMPackage.eINSTANCE;
	}

} //WorkFlowMMFactoryImpl
