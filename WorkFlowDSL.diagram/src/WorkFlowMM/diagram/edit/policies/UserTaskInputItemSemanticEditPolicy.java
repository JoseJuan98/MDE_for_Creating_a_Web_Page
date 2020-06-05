/*
* 
*/
package WorkFlowMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class UserTaskInputItemSemanticEditPolicy
		extends WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public UserTaskInputItemSemanticEditPolicy() {
		super(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
