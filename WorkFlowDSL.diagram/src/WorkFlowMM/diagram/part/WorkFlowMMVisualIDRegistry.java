/*
* 
*/
package WorkFlowMM.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WorkFlowMMVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "WorkFlowDSL.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID.equals(view.getType())) {
				return WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getWorkFlow().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((WorkFlowMM.WorkFlow) domainElement)) {
			return WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getModelID(containerView);
		if (!WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID.equals(containerModelID)
				&& !"WorkFlowMM".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getActor().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getInitial().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getFinal().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getSendMsg().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getReceiveMsg().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getServiceTask().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getLabel().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getUserTask().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDecision().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getJoin().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDataGroup().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getFile().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getNumber().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getCheckBox().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getRange().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getDate().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID;
			}
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getPhone().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOption().isSuperTypeOf(domainElement.eClass())) {
				return WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getModelID(containerView);
		if (!WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID.equals(containerModelID)
				&& !"WorkFlowMM".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.InitialIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.FinalIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.SendMsgNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.ReceiveMsgNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.ServiceTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.LabelIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.UserTaskIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.DecisionIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.JoinIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.DataGroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.FileNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.NumberNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.TextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.OptionFieldnameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.ImageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.RangeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.DateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.PhoneNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID:
			if (WorkFlowMM.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(WorkFlowMM.WorkFlow element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			return false;
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.checkNodeVisualID(containerView, domainElement,
					candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
