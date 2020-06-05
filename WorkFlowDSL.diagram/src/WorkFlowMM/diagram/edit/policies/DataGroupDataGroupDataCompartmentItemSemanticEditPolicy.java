/*
* 
*/
package WorkFlowMM.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DataGroupDataGroupDataCompartmentItemSemanticEditPolicy
		extends WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataGroupDataGroupDataCompartmentItemSemanticEditPolicy() {
		super(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.File_3011 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.FileCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Number_3012 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.NumberCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Text_3028 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.TextCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.CheckBox_3014 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.CheckBoxCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Image_3015 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ImageCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Range_3016 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.RangeCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Date_3017 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.DateCreateCommand(req));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.Phone_3018 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.PhoneCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
