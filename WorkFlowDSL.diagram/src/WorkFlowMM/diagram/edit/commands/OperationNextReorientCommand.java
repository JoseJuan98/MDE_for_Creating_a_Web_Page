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
public class OperationNextReorientCommand extends EditElementCommand {

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
	public OperationNextReorientCommand(ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof WorkFlowMM.Operation) {
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
		if (!(oldEnd instanceof WorkFlowMM.Operation && newEnd instanceof WorkFlowMM.Operation)) {
			return false;
		}
		return WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOperationNext_4001(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WorkFlowMM.Operation && newEnd instanceof WorkFlowMM.Operation)) {
			return false;
		}
		return WorkFlowMM.diagram.edit.policies.WorkFlowMMBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistOperationNext_4001(getOldSource(), getNewTarget());
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
		getOldSource().getNext().remove(getOldTarget());
		getNewSource().getNext().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getNext().remove(getOldTarget());
		getOldSource().getNext().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.Operation getOldSource() {
		return (WorkFlowMM.Operation) referenceOwner;
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.Operation getNewSource() {
		return (WorkFlowMM.Operation) newEnd;
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.Operation getOldTarget() {
		return (WorkFlowMM.Operation) oldEnd;
	}

	/**
	* @generated
	*/
	protected WorkFlowMM.Operation getNewTarget() {
		return (WorkFlowMM.Operation) newEnd;
	}
}
