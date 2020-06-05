/*
* 
*/
package WorkFlowMM.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class WorkFlowMMDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getSemanticChildren(View view) {
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			return getWorkFlow_1000SemanticChildren(view);
		case WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID:
			return getActorActorOperationsCompartment_7001SemanticChildren(view);
		case WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID:
			return getActorActorDataCompartment_7003SemanticChildren(view);
		case WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID:
			return getDataGroupDataGroupDataCompartment_7002SemanticChildren(view);
		case WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID:
			return getCheckBoxCheckBoxOptionsCompartment_7004SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getWorkFlow_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WorkFlowMM.WorkFlow modelElement = (WorkFlowMM.WorkFlow) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActors().iterator(); it.hasNext();) {
			WorkFlowMM.Actor childElement = (WorkFlowMM.Actor) it.next();
			int visualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getActorActorOperationsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WorkFlowMM.Actor modelElement = (WorkFlowMM.Actor) containerView.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOperations().iterator(); it.hasNext();) {
			WorkFlowMM.Operation childElement = (WorkFlowMM.Operation) it.next();
			int visualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getActorActorDataCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WorkFlowMM.Actor modelElement = (WorkFlowMM.Actor) containerView.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getData().iterator(); it.hasNext();) {
			WorkFlowMM.DataGroup childElement = (WorkFlowMM.DataGroup) it.next();
			int visualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getDataGroupDataGroupDataCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WorkFlowMM.DataGroup modelElement = (WorkFlowMM.DataGroup) containerView.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getData().iterator(); it.hasNext();) {
			WorkFlowMM.Data childElement = (WorkFlowMM.Data) it.next();
			int visualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getCheckBoxCheckBoxOptionsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		WorkFlowMM.CheckBox modelElement = (WorkFlowMM.CheckBox) containerView.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOptions().iterator(); it.hasNext();) {
			WorkFlowMM.Option childElement = (WorkFlowMM.Option) it.next();
			int visualID = WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getContainedLinks(View view) {
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {
		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
			return getWorkFlow_1000ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			return getInitial_3019ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getFinal_3020ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			return getSendMsg_3021ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			return getReceiveMsg_3022ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			return getServiceTask_3023ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3024ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			return getUserTask_3025ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_3026ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_3027ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			return getDataGroup_3010ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			return getFile_3011ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			return getNumber_3012ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3028ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3014ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return getOption_3029ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3015ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_3016ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			return getDate_3017ContainedLinks(view);
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			return getPhone_3018ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingLinks(View view) {
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			return getInitial_3019IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getFinal_3020IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			return getSendMsg_3021IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			return getReceiveMsg_3022IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			return getServiceTask_3023IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3024IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			return getUserTask_3025IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_3026IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_3027IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			return getDataGroup_3010IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			return getFile_3011IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			return getNumber_3012IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3028IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3014IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return getOption_3029IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3015IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_3016IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			return getDate_3017IncomingLinks(view);
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			return getPhone_3018IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingLinks(View view) {
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {
		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_2001OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
			return getInitial_3019OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
			return getFinal_3020OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
			return getSendMsg_3021OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
			return getReceiveMsg_3022OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
			return getServiceTask_3023OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
			return getLabel_3024OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
			return getUserTask_3025OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
			return getDecision_3026OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
			return getJoin_3027OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
			return getDataGroup_3010OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
			return getFile_3011OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
			return getNumber_3012OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3028OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
			return getCheckBox_3014OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
			return getOption_3029OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3015OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
			return getRange_3016OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
			return getDate_3017OutgoingLinks(view);
		case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
			return getPhone_3018OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getWorkFlow_1000ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getActor_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getInitial_3019ContainedLinks(View view) {
		WorkFlowMM.Initial modelElement = (WorkFlowMM.Initial) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getFinal_3020ContainedLinks(View view) {
		WorkFlowMM.Final modelElement = (WorkFlowMM.Final) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getSendMsg_3021ContainedLinks(View view) {
		WorkFlowMM.SendMsg modelElement = (WorkFlowMM.SendMsg) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SendMsg_AttachSend_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getReceiveMsg_3022ContainedLinks(View view) {
		WorkFlowMM.ReceiveMsg modelElement = (WorkFlowMM.ReceiveMsg) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ReceiveMsg_AttachRec_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getServiceTask_3023ContainedLinks(View view) {
		WorkFlowMM.ServiceTask modelElement = (WorkFlowMM.ServiceTask) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceTask_Generates_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceTask_Requires_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getLabel_3024ContainedLinks(View view) {
		WorkFlowMM.Label modelElement = (WorkFlowMM.Label) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getUserTask_3025ContainedLinks(View view) {
		WorkFlowMM.UserTask modelElement = (WorkFlowMM.UserTask) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_UserTask_Input_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDecision_3026ContainedLinks(View view) {
		WorkFlowMM.Decision modelElement = (WorkFlowMM.Decision) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getJoin_3027ContainedLinks(View view) {
		WorkFlowMM.Join modelElement = (WorkFlowMM.Join) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDataGroup_3010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getFile_3011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getNumber_3012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getText_3028ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getCheckBox_3014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOption_3029ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getImage_3015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getRange_3016ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDate_3017ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getPhone_3018ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getActor_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getInitial_3019IncomingLinks(View view) {
		WorkFlowMM.Initial modelElement = (WorkFlowMM.Initial) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getFinal_3020IncomingLinks(View view) {
		WorkFlowMM.Final modelElement = (WorkFlowMM.Final) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getSendMsg_3021IncomingLinks(View view) {
		WorkFlowMM.SendMsg modelElement = (WorkFlowMM.SendMsg) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getReceiveMsg_3022IncomingLinks(View view) {
		WorkFlowMM.ReceiveMsg modelElement = (WorkFlowMM.ReceiveMsg) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getServiceTask_3023IncomingLinks(View view) {
		WorkFlowMM.ServiceTask modelElement = (WorkFlowMM.ServiceTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getLabel_3024IncomingLinks(View view) {
		WorkFlowMM.Label modelElement = (WorkFlowMM.Label) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getUserTask_3025IncomingLinks(View view) {
		WorkFlowMM.UserTask modelElement = (WorkFlowMM.UserTask) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDecision_3026IncomingLinks(View view) {
		WorkFlowMM.Decision modelElement = (WorkFlowMM.Decision) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getJoin_3027IncomingLinks(View view) {
		WorkFlowMM.Join modelElement = (WorkFlowMM.Join) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Operation_Next_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDataGroup_3010IncomingLinks(View view) {
		WorkFlowMM.DataGroup modelElement = (WorkFlowMM.DataGroup) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ServiceTask_Generates_4003(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ServiceTask_Requires_4004(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_UserTask_Input_4005(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_SendMsg_AttachSend_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_ReceiveMsg_AttachRec_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getFile_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getNumber_3012IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getText_3028IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getCheckBox_3014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOption_3029IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getImage_3015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getRange_3016IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDate_3017IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getPhone_3018IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getActor_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getInitial_3019OutgoingLinks(View view) {
		WorkFlowMM.Initial modelElement = (WorkFlowMM.Initial) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getFinal_3020OutgoingLinks(View view) {
		WorkFlowMM.Final modelElement = (WorkFlowMM.Final) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getSendMsg_3021OutgoingLinks(View view) {
		WorkFlowMM.SendMsg modelElement = (WorkFlowMM.SendMsg) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SendMsg_AttachSend_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getReceiveMsg_3022OutgoingLinks(View view) {
		WorkFlowMM.ReceiveMsg modelElement = (WorkFlowMM.ReceiveMsg) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ReceiveMsg_AttachRec_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getServiceTask_3023OutgoingLinks(View view) {
		WorkFlowMM.ServiceTask modelElement = (WorkFlowMM.ServiceTask) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceTask_Generates_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ServiceTask_Requires_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getLabel_3024OutgoingLinks(View view) {
		WorkFlowMM.Label modelElement = (WorkFlowMM.Label) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getUserTask_3025OutgoingLinks(View view) {
		WorkFlowMM.UserTask modelElement = (WorkFlowMM.UserTask) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_UserTask_Input_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDecision_3026OutgoingLinks(View view) {
		WorkFlowMM.Decision modelElement = (WorkFlowMM.Decision) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getJoin_3027OutgoingLinks(View view) {
		WorkFlowMM.Join modelElement = (WorkFlowMM.Join) view.getElement();
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Operation_Next_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDataGroup_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getFile_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getNumber_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getText_3028OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getCheckBox_3014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOption_3029OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getImage_3015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getRange_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getDate_3017OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getPhone_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_Operation_Next_4001(
			WorkFlowMM.Operation target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getOperation_Next()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001,
						WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_ServiceTask_Generates_4003(
			WorkFlowMM.DataGroup target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getServiceTask_Generates()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003,
						WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_ServiceTask_Requires_4004(
			WorkFlowMM.DataGroup target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getServiceTask_Requires()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004,
						WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_UserTask_Input_4005(
			WorkFlowMM.DataGroup target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getUserTask_Input()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005,
						WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_SendMsg_AttachSend_4006(
			WorkFlowMM.DataGroup target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getSendMsg_AttachSend()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006,
						WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(
			WorkFlowMM.Task target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getSendMsg_NavigatesTo()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008,
						WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingFeatureModelFacetLinks_ReceiveMsg_AttachRec_4007(
			WorkFlowMM.DataGroup target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkFlowMM.WorkFlowMMPackage.eINSTANCE.getReceiveMsg_AttachRec()) {
				result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(setting.getEObject(), target,
						WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007,
						WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_Operation_Next_4001(
			WorkFlowMM.Operation source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		for (Iterator<?> destinations = source.getNext().iterator(); destinations.hasNext();) {
			WorkFlowMM.Operation destination = (WorkFlowMM.Operation) destinations.next();
			result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
					WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001,
					WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_ServiceTask_Generates_4003(
			WorkFlowMM.ServiceTask source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		WorkFlowMM.DataGroup destination = source.getGenerates();
		if (destination == null) {
			return result;
		}
		result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003,
				WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_ServiceTask_Requires_4004(
			WorkFlowMM.ServiceTask source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		WorkFlowMM.DataGroup destination = source.getRequires();
		if (destination == null) {
			return result;
		}
		result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004,
				WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_UserTask_Input_4005(
			WorkFlowMM.UserTask source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		WorkFlowMM.DataGroup destination = source.getInput();
		if (destination == null) {
			return result;
		}
		result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005,
				WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_SendMsg_AttachSend_4006(
			WorkFlowMM.SendMsg source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		WorkFlowMM.DataGroup destination = source.getAttachSend();
		if (destination == null) {
			return result;
		}
		result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006,
				WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_SendMsg_NavigatesTo_4008(
			WorkFlowMM.SendMsg source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		WorkFlowMM.Task destination = source.getNavigatesTo();
		if (destination == null) {
			return result;
		}
		result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008,
				WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingFeatureModelFacetLinks_ReceiveMsg_AttachRec_4007(
			WorkFlowMM.ReceiveMsg source) {
		LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> result = new LinkedList<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor>();
		WorkFlowMM.DataGroup destination = source.getAttachRec();
		if (destination == null) {
			return result;
		}
		result.add(new WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor(source, destination,
				WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007,
				WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WorkFlowMM.diagram.part.WorkFlowMMNodeDescriptor> getSemanticChildren(View view) {
			return WorkFlowMMDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getContainedLinks(View view) {
			return WorkFlowMMDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getIncomingLinks(View view) {
			return WorkFlowMMDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WorkFlowMM.diagram.part.WorkFlowMMLinkDescriptor> getOutgoingLinks(View view) {
			return WorkFlowMMDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
