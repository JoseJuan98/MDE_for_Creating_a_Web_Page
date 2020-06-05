/*
 * 
 */
package WorkFlowMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WorkFlowMMModelingAssistantProviderOfDataGroupEditPart
		extends WorkFlowMM.diagram.providers.WorkFlowMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(8);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.File_3011);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Number_3012);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Text_3028);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Image_3015);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Range_3016);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Date_3017);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Phone_3018);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WorkFlowMM.diagram.edit.parts.DataGroupEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(WorkFlowMM.diagram.edit.parts.DataGroupEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((WorkFlowMM.diagram.edit.parts.DataGroupEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(WorkFlowMM.diagram.edit.parts.DataGroupEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022);
		}
		return types;
	}

}
