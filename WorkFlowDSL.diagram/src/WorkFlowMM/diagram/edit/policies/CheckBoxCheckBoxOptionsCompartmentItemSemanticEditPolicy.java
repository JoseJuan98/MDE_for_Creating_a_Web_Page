/*
* 
*/
package WorkFlowMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CheckBoxCheckBoxOptionsCompartmentItemSemanticEditPolicy
		extends WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CheckBoxCheckBoxOptionsCompartmentItemSemanticEditPolicy() {
		super(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Option_3029 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.OptionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
