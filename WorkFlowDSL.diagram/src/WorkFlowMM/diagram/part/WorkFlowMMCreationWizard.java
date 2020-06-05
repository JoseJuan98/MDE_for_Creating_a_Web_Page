/*
 * 
 */
package WorkFlowMM.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class WorkFlowMMCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected WorkFlowMM.diagram.part.WorkFlowMMCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected WorkFlowMM.diagram.part.WorkFlowMMCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizardTitle);
		setDefaultPageImageDescriptor(WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewWorkFlowMMWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new WorkFlowMM.diagram.part.WorkFlowMMCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "workflowmm_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new WorkFlowMM.diagram.part.WorkFlowMMCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "workflowmm") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".workflowmm_diagram".length()); //$NON-NLS-1$
					setFileName(WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "workflowmm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						WorkFlowMM.diagram.part.Messages.WorkFlowMMCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				WorkFlowMM.diagram.part.WorkFlowMMDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
