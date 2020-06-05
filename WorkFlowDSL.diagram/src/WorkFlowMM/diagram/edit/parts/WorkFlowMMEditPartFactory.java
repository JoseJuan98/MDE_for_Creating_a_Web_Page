/*
 * 
 */
package WorkFlowMM.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class WorkFlowMMEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {

			case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WorkFlowEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ActorEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ActorNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.InitialEditPart(view);

			case WorkFlowMM.diagram.edit.parts.InitialIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.InitialIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.FinalEditPart(view);

			case WorkFlowMM.diagram.edit.parts.FinalIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.FinalIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.SendMsgEditPart(view);

			case WorkFlowMM.diagram.edit.parts.SendMsgNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.SendMsgNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ReceiveMsgNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ReceiveMsgNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ServiceTaskIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ServiceTaskIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.LabelEditPart(view);

			case WorkFlowMM.diagram.edit.parts.LabelIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.LabelIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.UserTaskEditPart(view);

			case WorkFlowMM.diagram.edit.parts.UserTaskIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.UserTaskIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DecisionEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DecisionIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DecisionIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.JoinEditPart(view);

			case WorkFlowMM.diagram.edit.parts.JoinIDEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.JoinIDEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DataGroupEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DataGroupNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DataGroupNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.FileEditPart(view);

			case WorkFlowMM.diagram.edit.parts.FileNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.FileNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.NumberEditPart(view);

			case WorkFlowMM.diagram.edit.parts.NumberNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.NumberNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.TextEditPart(view);

			case WorkFlowMM.diagram.edit.parts.TextNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.TextNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.CheckBoxEditPart(view);

			case WorkFlowMM.diagram.edit.parts.CheckBoxNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.CheckBoxNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.OptionEditPart(view);

			case WorkFlowMM.diagram.edit.parts.OptionFieldnameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.OptionFieldnameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ImageEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ImageNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.RangeEditPart(view);

			case WorkFlowMM.diagram.edit.parts.RangeNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.RangeNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DateEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DateNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DateNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.PhoneEditPart(view);

			case WorkFlowMM.diagram.edit.parts.PhoneNameEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.PhoneNameEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart(view);

			case WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart(view);

			case WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart(view);

			case WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.OperationNextEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabelEditPart(view);

			case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabel2EditPart(view);

			case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabel3EditPart(view);

			case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabel4EditPart(view);

			case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabel5EditPart(view);

			case WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabel6EditPart(view);

			case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart(view);

			case WorkFlowMM.diagram.edit.parts.WrappingLabel7EditPart.VISUAL_ID:
				return new WorkFlowMM.diagram.edit.parts.WrappingLabel7EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
