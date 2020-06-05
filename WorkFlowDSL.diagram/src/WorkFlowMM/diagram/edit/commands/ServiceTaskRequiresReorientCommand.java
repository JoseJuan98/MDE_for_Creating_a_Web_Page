/*
 * 
 */
package WorkFlowMM.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ServiceTaskRequiresReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public ServiceTaskRequiresReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof WorkFlowMM.ServiceTask) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof WorkFlowMM.DataGroup && newEnd instanceof WorkFlowMM.ServiceTask)) {
			return false;
		}
		return WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServiceTaskRequires_4004(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WorkFlowMM.DataGroup && newEnd instanceof WorkFlowMM.DataGroup)) {
			return false;
		}
		return WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistServiceTaskRequires_4004(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setRequires(null);
		getNewSource().setRequires(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setRequires(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.ServiceTask getOldSource() {
		return (WorkFlowMM.ServiceTask) referenceOwner;
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.ServiceTask getNewSource() {
		return (WorkFlowMM.ServiceTask) newEnd;
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.DataGroup getOldTarget() {
		return (WorkFlowMM.DataGroup) oldEnd;
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.DataGroup getNewTarget() {
		return (WorkFlowMM.DataGroup) newEnd;
	}
}
