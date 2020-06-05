/*
* 
*/
package WorkFlowMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActorActorDataCompartmentItemSemanticEditPolicy
		extends WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ActorActorDataCompartmentItemSemanticEditPolicy() {
		super(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Actor_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.DataGroupCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
