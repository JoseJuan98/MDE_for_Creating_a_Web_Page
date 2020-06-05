/*
* 
*/
package WorkFlowMM.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class DataGroupItemSemanticEditPolicy
		extends WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataGroupItemSemanticEditPolicy() {
		super(WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.DataGroup_3010);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(
					incomingLink) == WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getVisualID(incomingLink) == WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getVisualID(incomingLink) == WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getVisualID(incomingLink) == WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getVisualID(incomingLink) == WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(node)) {
			case WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(cnode)) {
					case WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					case WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003 == req.getElementType()) {
			return null;
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004 == req.getElementType()) {
			return null;
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005 == req.getElementType()) {
			return null;
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006 == req.getElementType()) {
			return null;
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskGenerates_4003 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ServiceTaskGeneratesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ServiceTaskRequires_4004 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ServiceTaskRequiresCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.UserTaskInput_4005 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.UserTaskInputCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.SendMsgAttachSend_4006 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.SendMsgAttachSendCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (WorkFlowMM.diagram.providers.WorkFlowMMElementTypes.ReceiveMsgAttachRec_4007 == req.getElementType()) {
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ReceiveMsgAttachRecCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID:
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ServiceTaskGeneratesReorientCommand(req));
		case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID:
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ServiceTaskRequiresReorientCommand(req));
		case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID:
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.UserTaskInputReorientCommand(req));
		case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID:
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.SendMsgAttachSendReorientCommand(req));
		case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID:
			return getGEFWrapper(new WorkFlowMM.diagram.edit.commands.ReceiveMsgAttachRecReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
