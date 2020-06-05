/*
 * 
 */
package WorkFlowMM.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class WorkFlowMMModelingAssistantProviderOfSendMsgEditPart
		extends WorkFlowMM.diagram.providers.WorkFlowMMModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((WorkFlowMM.diagram.edit.parts.SendMsgEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(WorkFlowMM.diagram.edit.parts.SendMsgEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((WorkFlowMM.diagram.edit.parts.SendMsgEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(WorkFlowMM.diagram.edit.parts.SendMsgEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.InitialEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.FinalEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.SendMsgEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.LabelEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.UserTaskEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.DecisionEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.JoinEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.DataGroupEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.InitialEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.FinalEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.SendMsgEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.LabelEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		if (targetEditPart instanceof WorkFlowMM.diagram.edit.parts.UserTaskEditPart) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((WorkFlowMM.diagram.edit.parts.SendMsgEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(WorkFlowMM.diagram.edit.parts.SendMsgEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((WorkFlowMM.diagram.edit.parts.SendMsgEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(WorkFlowMM.diagram.edit.parts.SendMsgEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001);
		types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((WorkFlowMM.diagram.edit.parts.SendMsgEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(WorkFlowMM.diagram.edit.parts.SendMsgEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.OperationNext_4001) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026);
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027);
		} else if (relationshipType == WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgNavigatesTo_4008) {
			types.add(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021);
		}
		return types;
	}

}
