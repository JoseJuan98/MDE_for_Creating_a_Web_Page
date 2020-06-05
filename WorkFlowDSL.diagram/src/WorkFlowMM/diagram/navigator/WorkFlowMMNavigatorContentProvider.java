/*
* 
*/
package WorkFlowMM.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class WorkFlowMMNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public WorkFlowMMNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem> result = new ArrayList<WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup group = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) {
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem navigatorItem = (WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getVisualID(view)) {

		case WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup links = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_WorkFlow_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorOperationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ActorActorDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_DataGroup_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.FileEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.NumberEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.RangeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.DateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.DataGroupDataGroupDataCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.PhoneEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.CheckBoxEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getType(
							WorkFlowMM.diagram.edit.parts.CheckBoxCheckBoxOptionsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews, WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
					.getType(WorkFlowMM.diagram.edit.parts.OptionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Initial_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Initial_3019_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Final_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Final_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_SendMsg_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_SendMsg_3021_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ReceiveMsg_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ReceiveMsg_3022_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ServiceTask_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ServiceTask_3023_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Label_3024_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Label_3024_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_UserTask_3025_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_UserTask_3025_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Decision_3026_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Decision_3026_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Node sv = (Node) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup incominglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Join_3027_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup outgoinglinks = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_Join_3027_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.OperationNextEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_OperationNext_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_OperationNext_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.JoinEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.ServiceTaskGeneratesEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ServiceTaskGenerates_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ServiceTaskGenerates_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.ServiceTaskRequiresEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ServiceTaskRequires_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ServiceTaskRequires_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.UserTaskInputEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_UserTaskInput_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_UserTaskInput_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.SendMsgAttachSendEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_SendMsgAttachSend_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_SendMsgAttachSend_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.ReceiveMsgAttachRecEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ReceiveMsgAttachRec_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_ReceiveMsgAttachRec_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.DataGroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case WorkFlowMM.diagram.edit.parts.SendMsgNavigatesToEditPart.VISUAL_ID: {
			LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem> result = new LinkedList<WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup target = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_SendMsgNavigatesTo_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup source = new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorGroup(
					WorkFlowMM.diagram.part.Messages.NavigatorGroupName_SendMsgNavigatesTo_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.InitialEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.FinalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ReceiveMsgEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.ServiceTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.LabelEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.UserTaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry
							.getType(WorkFlowMM.diagram.edit.parts.SendMsgEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WorkFlowMM.diagram.edit.parts.WorkFlowEditPart.MODEL_ID
				.equals(WorkFlowMM.diagram.part.WorkFlowMMVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem> result = new ArrayList<WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<WorkFlowMM.diagram.navigator.WorkFlowMMNavigatorItem> getForeignShortcuts(Diagram diagram,
			Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem) {
			WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem abstractNavigatorItem = (WorkFlowMM.diagram.navigator.WorkFlowMMAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
