/*
* 
*/
package WorkFlowMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActorActorOperationsCompartmentItemSemanticEditPolicy
		extends WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActorActorOperationsCompartmentItemSemanticEditPolicy() {
		super(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Initial_3019 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.InitialCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Final_3020 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.FinalCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsg_3021 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.SendMsgCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsg_3022 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ReceiveMsgCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTask_3023 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ServiceTaskCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Label_3024 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.LabelCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTask_3025 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.UserTaskCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Decision_3026 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.DecisionCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Join_3027 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.JoinCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
