/*
 * 
 */
package WorkFlowMM.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class WorkFlowMMElementTypes {

	/**
	* @generated
	*/
	private WorkFlowMMElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType WorkFlow_1000 = getElementType("WorkFlowDSL.diagram.WorkFlow_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Actor_2001 = getElementType("WorkFlowDSL.diagram.Actor_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Initial_3019 = getElementType("WorkFlowDSL.diagram.Initial_3019"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Final_3020 = getElementType("WorkFlowDSL.diagram.Final_3020"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SendMsg_3021 = getElementType("WorkFlowDSL.diagram.SendMsg_3021"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ReceiveMsg_3022 = getElementType("WorkFlowDSL.diagram.ReceiveMsg_3022"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ServiceTask_3023 = getElementType("WorkFlowDSL.diagram.ServiceTask_3023"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Label_3024 = getElementType("WorkFlowDSL.diagram.Label_3024"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserTask_3025 = getElementType("WorkFlowDSL.diagram.UserTask_3025"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Decision_3026 = getElementType("WorkFlowDSL.diagram.Decision_3026"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Join_3027 = getElementType("WorkFlowDSL.diagram.Join_3027"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataGroup_3010 = getElementType("WorkFlowDSL.diagram.DataGroup_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType File_3011 = getElementType("WorkFlowDSL.diagram.File_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Number_3012 = getElementType("WorkFlowDSL.diagram.Number_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Text_3028 = getElementType("WorkFlowDSL.diagram.Text_3028"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CheckBox_3014 = getElementType("WorkFlowDSL.diagram.CheckBox_3014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Option_3029 = getElementType("WorkFlowDSL.diagram.Option_3029"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Image_3015 = getElementType("WorkFlowDSL.diagram.Image_3015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Range_3016 = getElementType("WorkFlowDSL.diagram.Range_3016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Date_3017 = getElementType("WorkFlowDSL.diagram.Date_3017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Phone_3018 = getElementType("WorkFlowDSL.diagram.Phone_3018"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType OperationNext_4001 = getElementType("WorkFlowDSL.diagram.OperationNext_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ServiceTaskGenerates_4003 = getElementType(
			"WorkFlowDSL.diagram.ServiceTaskGenerates_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType ServiceTaskRequires_4004 = getElementType(
			"WorkFlowDSL.diagram.ServiceTaskRequires_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType UserTaskInput_4005 = getElementType("WorkFlowDSL.diagram.UserTaskInput_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SendMsgAttachSend_4006 = getElementType(
			"WorkFlowDSL.diagram.SendMsgAttachSend_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SendMsgNavigatesTo_4008 = getElementType(
			"WorkFlowDSL.diagram.SendMsgNavigatesTo_4008"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ReceiveMsgAttachRec_4007 = getElementType(
			"WorkFlowDSL.diagram.ReceiveMsgAttachRec_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WorkFlow_1000, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getWorkFlow());

			elements.put(Actor_2001, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getActor());

			elements.put(Initial_3019, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getInitial());

			elements.put(Final_3020, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getFinal());

			elements.put(SendMsg_3021, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getSendMsg());

			elements.put(ReceiveMsg_3022, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getReceiveMsg());

			elements.put(ServiceTask_3023, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getServiceTask());

			elements.put(Label_3024, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getLabel());

			elements.put(UserTask_3025, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getUserTask());

			elements.put(Decision_3026, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDecision());

			elements.put(Join_3027, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getJoin());

			elements.put(DataGroup_3010, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDataGroup());

			elements.put(File_3011, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getFile());

			elements.put(Number_3012, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getNumber());

			elements.put(Text_3028, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getText());

			elements.put(CheckBox_3014, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getCheckBox());

			elements.put(Option_3029, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOption());

			elements.put(Image_3015, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getImage());

			elements.put(Range_3016, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getRange());

			elements.put(Date_3017, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDate());

			elements.put(Phone_3018, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getPhone());

			elements.put(OperationNext_4001, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_Next());

			elements.put(ServiceTaskGenerates_4003, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getServiceTask_Generates());

			elements.put(ServiceTaskRequires_4004, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getServiceTask_Requires());

			elements.put(UserTaskInput_4005, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getUserTask_Input());

			elements.put(SendMsgAttachSend_4006, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getSendMsg_AttachSend());

			elements.put(SendMsgNavigatesTo_4008, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getSendMsg_NavigatesTo());

			elements.put(ReceiveMsgAttachRec_4007, WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getReceiveMsg_AttachRec());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WorkFlow_1000);
			KNOWN_ELEMENT_TYPES.add(Actor_2001);
			KNOWN_ELEMENT_TYPES.add(Initial_3019);
			KNOWN_ELEMENT_TYPES.add(Final_3020);
			KNOWN_ELEMENT_TYPES.add(SendMsg_3021);
			KNOWN_ELEMENT_TYPES.add(ReceiveMsg_3022);
			KNOWN_ELEMENT_TYPES.add(ServiceTask_3023);
			KNOWN_ELEMENT_TYPES.add(Label_3024);
			KNOWN_ELEMENT_TYPES.add(UserTask_3025);
			KNOWN_ELEMENT_TYPES.add(Decision_3026);
			KNOWN_ELEMENT_TYPES.add(Join_3027);
			KNOWN_ELEMENT_TYPES.add(DataGroup_3010);
			KNOWN_ELEMENT_TYPES.add(File_3011);
			KNOWN_ELEMENT_TYPES.add(Number_3012);
			KNOWN_ELEMENT_TYPES.add(Text_3028);
			KNOWN_ELEMENT_TYPES.add(CheckBox_3014);
			KNOWN_ELEMENT_TYPES.add(Option_3029);
			KNOWN_ELEMENT_TYPES.add(Image_3015);
			KNOWN_ELEMENT_TYPES.add(Range_3016);
			KNOWN_ELEMENT_TYPES.add(Date_3017);
			KNOWN_ELEMENT_TYPES.add(Phone_3018);
			KNOWN_ELEMENT_TYPES.add(OperationNext_4001);
			KNOWN_ELEMENT_TYPES.add(ServiceTaskGenerates_4003);
			KNOWN_ELEMENT_TYPES.add(ServiceTaskRequires_4004);
			KNOWN_ELEMENT_TYPES.add(UserTaskInput_4005);
			KNOWN_ELEMENT_TYPES.add(SendMsgAttachSend_4006);
			KNOWN_ELEMENT_TYPES.add(SendMsgNavigatesTo_4008);
			KNOWN_ELEMENT_TYPES.add(ReceiveMsgAttachRec_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			return WorkFlow_1000;
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return Actor_2001;
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			return Initial_3019;
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return Final_3020;
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			return SendMsg_3021;
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			return ReceiveMsg_3022;
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			return ServiceTask_3023;
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return Label_3024;
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			return UserTask_3025;
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			return Decision_3026;
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return Join_3027;
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			return DataGroup_3010;
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			return File_3011;
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			return Number_3012;
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return Text_3028;
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return CheckBox_3014;
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return Option_3029;
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return Image_3015;
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return Range_3016;
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			return Date_3017;
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			return Phone_3018;
		case WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID:
			return OperationNext_4001;
		case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID:
			return ServiceTaskGenerates_4003;
		case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID:
			return ServiceTaskRequires_4004;
		case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID:
			return UserTaskInput_4005;
		case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID:
			return SendMsgAttachSend_4006;
		case WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID:
			return SendMsgNavigatesTo_4008;
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID:
			return ReceiveMsgAttachRec_4007;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.getElement(elementTypeAdapter);
		}
	};

}
